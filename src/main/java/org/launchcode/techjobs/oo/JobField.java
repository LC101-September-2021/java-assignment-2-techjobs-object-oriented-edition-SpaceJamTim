package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    @Override
    public String toString() {
        if (value == null || value == "") {
            return "Data not available";
        } else {
            return value;
        }
    }
}
