package org.hanana.hananaapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

/*import org.hanana.hananaapp.models.TimeStamper;
import org.hanana.hananaapp.models.ViewUpdater;
import android.text.format.DateFormat;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
    TimeStamper timeStamper;
    ViewUpdater viewUpdater;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog dialog = new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));

        return dialog;
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute){
        timeStamper.setTime(minute, hourOfDay);
        viewUpdater.updateView();
    }

    public void setTimeStamper(TimeStamper stamper){
        timeStamper = stamper;
    }

    public void setViewUpdater(ViewUpdater updater){
        viewUpdater = updater;
    }

}*/
