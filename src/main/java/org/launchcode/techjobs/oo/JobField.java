package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

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

}
