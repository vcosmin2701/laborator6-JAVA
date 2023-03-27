package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exporter {
    ExportConfig config;
    List<Person> exportList = new ArrayList<>();

    public Exporter(ExportConfig config, List<Person> exportList) {
        this.config = config;
        // defense copying
        this.exportList =new ArrayList<Person>(exportList);
    }

    public void export(){
        System.out.println("Deshid fisier cu nume " + config.getFile());
        System.out.println("Scriu in fisier " + config.getTitle());
        for(Person p : exportList){
            System.out.println("Scrie " + p.firstName + " " + p.secondName);
        }
    }
}
