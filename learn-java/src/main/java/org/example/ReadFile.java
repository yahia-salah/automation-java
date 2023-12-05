package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        var path = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\test.txt");
        var text = Files.readString(path);

        System.out.println(text);
    }
}
