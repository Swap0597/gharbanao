package com.gharbanao.coreentities.architects;

public class ProjectTimeline {
    private int year;
    private String name;
    private String address;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ProjectTimeline{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
