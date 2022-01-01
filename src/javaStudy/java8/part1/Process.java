package javaStudy.java8.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Process {
    public static String processFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/we/IdeaProjects/Algorithms/src/javaStudy/java8/part1/data.txt"));
        return br.readLine();
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/we/IdeaProjects/Algorithms/src/javaStudy/java8/part1/data.txt"));
        return p.process(br);
    }
}
