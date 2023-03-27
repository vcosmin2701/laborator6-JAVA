package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config = new ExportConfig();
        config.setFile("fisier1.txt");
        config.setTitle("Lista 1");
        Exporter exporter = new Exporter(config);

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("N1", "P1"));
        list1.add(new Person("N2", "P2"));
        exporter.export(list1);
    }
}