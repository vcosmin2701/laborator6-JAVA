package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config1 = new ExportConfig("fisier1.txt", "Lista 1");
        Exporter exporter1 = new Exporter(config1);

        ExportConfig config2 = new ExportConfig("fisier2.txt", "Lista 2");
        Exporter exporter2 = new Exporter(config2);

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("N1", "P1"));
        list1.add(new Person("N2", "P2"));
        exporter1.export(list1);
        list1.add(new Person("N3", "P3"));
        exporter2.export(list1);
    }
}