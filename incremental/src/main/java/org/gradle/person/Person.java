package org.gradle.person;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private String name;
    private String name2;

    // Constructor
    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    // Get the name for the person
    public String getName() {
        return name;
    }
    
    // Set the name of this person
    public void setName(String name) {
        this.name = name;
    }
}
