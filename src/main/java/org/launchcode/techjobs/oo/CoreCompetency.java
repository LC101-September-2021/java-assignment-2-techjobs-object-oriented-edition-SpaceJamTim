package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

//extends enable CoreCompetency to be contained in JobField

    //private int id;
    //private static int nextId = 1;
    //private String value;

    public CoreCompetency() {
        super();
//        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }
}
