package org.example;

import java.util.List;

public class Exporter {
    ExportConfig config;
    public Exporter(ExportConfig config) {
        this.config = config;
    }

    public void export(List<Person> personList){
        System.out.println("Deshid fisier cu nume " + config.getFile());
        System.out.println("Scriu in fisier " + config.getTitle());
        for(Person p : personList){
            System.out.println("Scrie " + p.firstName + " " + p.secondName);
        }
    }
}
