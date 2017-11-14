package com.maqian.eventreporter;

import java.util.*;

/**
 * Created by maqian on 11/8/17.
 */

//can have a external api to replace this part.
public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        String name1 = "apple";
        String name2 = "apricot";
        String name3 = "avocado";
        String name4 = "cherry";
        String name5 = "grapes";
        String name6 = "kiwi";
        String name7 = "lemon";
        String name8 = "nut";
        String name9 = "strawberry";
        String name10 = "watermelon";
        eventData.add(
                new Event(name1, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name2, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name3, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name4, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name5, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name6, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name7, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name8, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name9, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        eventData.add(
                new Event(name10, "fruit", "1184 W valley Blvd, CA 90101",
                        "This is a huge event"));
        return eventData;
    }
}
