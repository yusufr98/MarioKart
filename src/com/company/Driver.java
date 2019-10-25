package com.company;

public class Driver implements Comparable<Driver>{
    private String name;
    private int position;

    public Driver(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public int compareTo(Driver compareDriver) {
        int comparePosition = ((Driver) compareDriver).getPosition();
        //ascending order
        return this.position - comparePosition;
    }
}
