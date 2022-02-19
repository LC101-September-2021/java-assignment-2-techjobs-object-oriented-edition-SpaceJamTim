package org.launchcode.techjobs.oo;

public abstract class JobField {

    public int id;
    public static int nextId = 1;

    //does "value" need to be initialized here?

    public String value;

    public JobField(String value) {
        this.value = value;
        this.id = nextId;
        nextId++;
    }

    public JobField() {

    }

    @Override
    public String toString() {
        if (value == null || value.equals("")) {
            return "Data not available";
        } else {
            return value;
        }
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
