package com.RepairIt.RepairIt.entities;

public enum Type {

    ORDINATEUR("ordinateur"),

	MACHINEALAVER("machine a laver"),
    
	FRIGERATEUR("frigo");

	Type(String key) {
	    this.value = key;
    }
    
    private String value;

    public String value() {
        return value;
    }
}
