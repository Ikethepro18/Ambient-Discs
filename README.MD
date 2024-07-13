![Minecraft Version](https://img.shields.io/modrinth/game-versions/ambient-discs?link=https%3A%2F%2Fmodrinth.com%2Fmod%2Fait%2Fversions&label=Minecraft%20Version)
![Latest Release](https://img.shields.io/modrinth/v/ambient-discs?&label=Latest%20Version&link=https%3A%2F%2Fmodrinth.com%2Fmod%2Finto-the-dark%2Fversions)
![Latest Github Commit](https://img.shields.io/github/last-commit/Ikethepro18/Ambient-Discs?logo=Github&label=Latest%20Commit)
![Modrinth Download Count](https://img.shields.io/modrinth/dt/ambient-discs?logo=modrinth&link=https%3A%2F%2Fmodrinth.com%2Fmod%2Fait&label=Downloads)

# Welcome to Ambient Discs
Ambient Discs is a simple mod that takes the vanilla Minecraft soundtrack and adds music discs for all that don't. This way, you can listen to any piece of the Minecraft soundtrack at any time you please.

## How do I Get the Discs?
For the most part, all discs will be obtained the "good old fashioned way" via skeletons killing creepers. However, there is room in the future for discs to be found in vanilla, or potentially custom, structures to add more merit to exploration.

## Will this Mod have Composer's Tracks?
No, only tracks included in the vanilla game will get a disc. This is mainly for licensing reasons, but also because then it'd end up with hundreds of music discs which is frankly too many.

## Can I Use This for...?
Yes you can use this mod in your modpack, or tweak and remix it in your own way if you'd like. Do bear in mind though it is licensed under [CC-BY-SA-4.0](https://creativecommons.org/licenses/by-sa/4.0/), so take that into consideration if you do plan on using it

## How do I build this?
If you've ever built a mod before, it's as simple as you'd expect. If it's your first time building a mod, it's quite simple really.

1. If you've got Git installed, you can use `git clone https://github.com/Ikethepro18/Ambient-Discs.git` to a directory of your choice to clone the project 
   - If you don't have Git installed you can use `winget install git.git` and restart Command Prompt/Powershell/Terminal to install Git
   - If you don't want to do that then you can just download the zip from [master](https://github.com/Ikethepro18/Ambient-Discs/archive/refs/heads/master.zip) and unzip it to a directory of your choice
2. Open command prompt or terminal into that directory<sup>[?](https://www.lifewire.com/open-command-prompt-in-a-folder-5185505)</sup>
3. Run `.\gradlew build`
   - If you get the error 
   
   ```
   ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
   
   Please set the JAVA_HOME variable in your environment to match the location of your Java installation.
   ```
   
   or are told you're using an outdated version of Java, then run `winget install Oracle.JDK.21` and make sure you set it as your Java home (you can check this by running `java --version` and ensuring it's Java 21)

4. You should find your compiled mod at `.\build\libs\ambient-discs-{version}.jar` which you can do with whatever you please
5. If you're having issues or struggling you can get support in my [Discord Server](https://discord.gg/k7mpmzRDw6)