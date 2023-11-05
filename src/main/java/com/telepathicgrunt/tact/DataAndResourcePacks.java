package com.telepathicgrunt.tact;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ConfigTracker;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.resource.PathPackResources;

import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Optional;

public class DataAndResourcePacks {

    static void setupBuiltInDataPack(final AddPackFindersEvent event) {
        try {
            if (Config.applyTagAdjustments && event.getPackType() == PackType.SERVER_DATA) {
                var resourcePath =  ModList.get().getModFileById(TACT.MODID).getFile()
                        .findResource("datapacks/apply_tag_adjustments");

                var pack = Pack.readMetaAndCreate(
                        "tact/apply_tag_adjustments",
                        Component.literal("TACT - Adjusted Tags"),
                        true,
                        (path) -> new PathPackResources(path, false, resourcePath),
                        PackType.SERVER_DATA,
                        Pack.Position.BOTTOM,
                        PackSource.DEFAULT);

                event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
            }


            if (event.getPackType() == PackType.CLIENT_RESOURCES) {
                loadTACTConfigsEarly();

                if (Config.restoreEndStory) {
                    var resourcePath =  ModList.get().getModFileById(TACT.MODID).getFile()
                            .findResource("resourcepacks/restore_end_story");

                    var pack = Pack.readMetaAndCreate(
                            "tact/restore_end_story",
                            Component.literal("TACT - Restore End Story"),
                            true,
                            (path) -> new PathPackResources(path, false, resourcePath),
                            PackType.CLIENT_RESOURCES,
                            Pack.Position.TOP,
                            PackSource.DEFAULT);

                    event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
                }
            }

        }
        catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void loadTACTConfigsEarly() {
        Optional<? extends ModContainer> modContainerById = ModList.get().getModContainerById(TACT.MODID);
        modContainerById.ifPresent(container -> {
            ConfigTracker.INSTANCE.configSets()
                    .get(ModConfig.Type.COMMON)
                    .forEach(c -> {
                        if (c.getFileName().equals("tact-common.toml")) {
                            try {
                                Method method = ConfigTracker.INSTANCE.getClass().getDeclaredMethod("openConfig", ModConfig.class, Path.class);
                                method.setAccessible(true);
                                method.invoke(ConfigTracker.INSTANCE, c, FMLPaths.CONFIGDIR.get());
                                method.setAccessible(false);
                            }
                            catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });
        });
    }
}
