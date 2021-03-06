package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {
      // Code In JobField
    // private int id;
    // private static int nextId = 1;
    // private String value;

    public PositionType() {
        super();
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    //@Override
    //public String toString() {
    //    if (value == null) {
    //        return "Data not available";
    //    } else {
    //        return value;
    //    }
    //}
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }
}
