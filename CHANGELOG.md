### **(V.1.5.1 Changes) (1.20.1 Minecraft)**

#### BugFix:
Attempt to resolve the event listener load order issue that Alex's Cave has with DragonSurvival and Pehkui.
I cancelled Alex's Caves event and resubscribed the logic myself using highest event priority so it always runs first as well as some logic adjustment in the event itself.