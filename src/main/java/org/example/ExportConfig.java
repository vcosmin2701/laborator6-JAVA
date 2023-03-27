package org.example;

// immutability
public class ExportConfig {
    final String file;
    final String title;

    public ExportConfig(String file, String title) {
        this.file = file;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getFile() {
        return file;
    }
}
