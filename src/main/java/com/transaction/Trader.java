package com.transaction;

/**
 * Created by sergey.volkov on 10/28/2016.
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city){
        this.city = city;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
