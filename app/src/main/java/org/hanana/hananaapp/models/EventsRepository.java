package org.hanana.hananaapp.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;

public class EventsRepository {

    private ArrayList<Event> mEvents;
    public static EventsRepository sEventsRepository;

    // constructor

    // mehod to get a an EventsRepository
    public static EventsRepository getInstance(Context context){
        if(sEventsRepository == null)
            sEventsRepository = new EventsRepository(context);

        return sEventsRepository;
    }

    private EventsRepository(Context context) {

        mEvents = new ArrayList<>();
        for (int i = 0; i < 100 ; ++i){
            Event event = new Event(i,i);
            event.setTitle("Event " + i);
            event.setDate(new Date());
            event.setLatitude(0.0f);
            event.setLongitude(0.0f);
            event.setVenue("Venue " + i);
        }

    }

    // method to get all events
    public ArrayList<Event> getAllEvents(){
        return mEvents;
    }
}
