package com.company;

public enum Tuna {
    kent("dude", "22"),
    kelsey("girl", "20"),
    julia("girl2", "22");

    private final String desc;
    private final String year;

    Tuna(String description, String birthday) {
        desc = description;
        year = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }
}
