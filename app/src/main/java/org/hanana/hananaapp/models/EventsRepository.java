package org.hanana.hananaapp.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import org.hanana.hananaapp.database.HananaDB;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EventsRepository extends HananaDB{

    private ArrayList<Event> mEvents;
    public static EventsRepository sEventsRepository;

    public EventsRepository(Context context) {
        super(context);
    }

    // constructor

    // method to get a an EventsRepository
    public static EventsRepository getInstance(Context context){
        if(sEventsRepository == null)
            sEventsRepository = new EventsRepository(context);

        return sEventsRepository;
    }

    /*public EventsRepository(Context context) {

        mEvents = new ArrayList<>();
        for (int i = 0; i < 100 ; ++i){
            Event event = new Event(i,i);
            event.setTitle("Event " + i);
            event.setDate(new Date());
            event.setLatitude(0.0f);
            event.setLongitude(0.0f);
            event.setVenue("Venue " + i);
            mEvents.add(event);
        }

    }*/

    // method to get all events
    public ArrayList<Event> getAllEvents(){
        return mEvents;
    }



    public void insert(Event event) {
        SQLiteDatabase db = this.getWritableDatabase();



//        EventTimeStamper eventTimeStamper = new EventTimeStamper();
//        DateFormat dateFormat = new SimpleDateFormat
//                (eventTimeStamper.getDateTimeStampFormat());
//        String date = dateFormat.format(event.getDate());

        String insertQuery = "INSERT INTO " + TABLE_EVENT ;
        insertQuery += " values( null, '" + event.getTitle();
        insertQuery += "', '" + event.getVenue();
        insertQuery += "', '" + event.getDate();
//        insertQuery += "', '" + date;
        insertQuery += "', '" + event.getTime();
        insertQuery += "', '" + event.getLongitude();
        insertQuery += "', '" + event.getLatitude();
        insertQuery += "' )";

        db.execSQL(insertQuery);
        db.close();
        Log.i("HANANA", event.getTitle() + " is added!");


    }
}
