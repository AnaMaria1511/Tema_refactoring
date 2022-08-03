package com.mcserby.training.refactoring;

public class Details {

    private String name = null;

    private String description = null;

    public Details(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Details name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }


    public Details description(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

}

