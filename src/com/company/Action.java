package com.company;

public class Action {
    private String name;
    private int change;

    public Action(String name, int change) {
        this.name = name;
        this.change = change;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
}
