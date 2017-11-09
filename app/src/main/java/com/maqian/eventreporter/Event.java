package com.maqian.eventreporter;

/**
 * Created by maqian on 11/8/17.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String name;
    private String title;
    private String address;
    private String description;

    /**
     * Constructor
     */
    public Event(String name, String title, String address, String description) {
        this.name = name;
        this.title = title;
        this.address = address;
        this.description = description;
    }


    /**
     * Getters for private attributes of Event class.
     */
    public String getName() { return this.name; }
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }
}
