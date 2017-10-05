package io.robusta.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteApplication {

    public static void main(String[] args) throws IOException {

        WriteApplication writeApplication = new WriteApplication();
        writeApplication.write();
        writeApplication.append();
        writeApplication.appendList();

    }

    public void write() throws IOException {
        String fileName = "astropox.csv";
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Hello world again");
        writer.flush();
        writer.close();
    }

    public void append() throws IOException {
        String fileName = "astropox.csv";
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file, true);
        writer.write("Hello world again again");
        writer.flush();
        writer.close();
    }

    public void appendList() throws IOException {
        String fileName = "astropox.csv";
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        List<Integer> list = Arrays.asList(1, 2, 3);
        FileWriter writer = new FileWriter(file, true);
        for (Integer number : list) {
            writer.write(number + ";");
        }
        writer.flush();
        writer.close();
    }

}
