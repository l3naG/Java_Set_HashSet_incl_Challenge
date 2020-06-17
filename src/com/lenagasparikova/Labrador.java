package com.lenagasparikova;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

    // can not be overriden the superclass equals() set to final

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Labrador) {
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
