package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("N1", "P1"));
        personList.add(new Person("N2", "P2"));
        Exporter exporter1 = new Exporter(new ExportConfig("fisier1.txt", "Lista1"), personList);
        personList.add(new Person("N3", "P3"));
        Exporter exporter2 = new Exporter(new ExportConfig("fisier2.txt", "Lista2"), personList);

        exporter1.export();
        exporter2.export();
    }
}