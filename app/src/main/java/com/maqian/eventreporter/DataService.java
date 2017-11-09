package com.maqian.eventreporter;

import java.util.*;

/**
 * Created by maqian on 11/8/17.
 */


public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 5; ++i) {
            String name1 = "event_thumbnail";
            String name2 = "picture2";
            eventData.add(
                    new Event(name1, "Event", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
            eventData.add(
                    new Event(name2, "Event", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        return eventData;
    }
}
