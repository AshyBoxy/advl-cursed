package xyz.ashyboxy.advl.cursed;

import net.minecraft.client.main.Main;

import java.util.Arrays;
import java.util.stream.Stream;

public class Launcher {
    public static void main(String[] args) {
        Logger.info("Hello from mc bootstrap");

        System.setProperty("minecraft.launcher.brand", "advl-cursed");
        System.setProperty("minecraft.launcher.version", "0.0.0");

        String[] nextArgs = Stream.concat(Stream.of(
                "--accessToken", "",
                "--version", "1.21.1",
                "--versionType", "release"
        ), Arrays.stream(args)).toArray(String[]::new);

        Logger.info("Arguments are: ", Arrays.toString(nextArgs));
        Logger.info("Running mc in: ", System.getProperty("user.dir"));

        Main.main(nextArgs);
    }
}
