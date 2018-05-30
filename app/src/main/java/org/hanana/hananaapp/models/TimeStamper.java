package org.hanana.hananaapp.models;

public interface TimeStamper {
    public void setTime(int minute, int hourOfDay);
    public void setDate(int day, int month, int year);
    public boolean isTimeSet();
    public boolean isDateSet();
    public String getDateTimeStamp();
    public String getTimeStamp();
    public String getDateStamp();
    public String getDateTimeStamoFormat();

    String getDateTimeStampFormat();
}
