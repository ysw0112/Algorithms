package javaStudy.java8;


import java.io.File;

public class streamApiTutorial {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        System.out.printf(hiddenFiles[0].toString());
    }
}
