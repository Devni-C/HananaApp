package org.hanana.hananaapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.DatePicker;

/*import org.hanana.hananaapp.models.TimeStamper;
import org.hanana.hananaapp.models.ViewUpdater;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    TimeStamper timeStamper;
    ViewUpdater viewUpdater;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(getActivity(), this, year, month, day);

        return dialog;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        timeStamper.setDate(day, month,year);
        viewUpdater.updateView();
    }

    public void setTimeStamper(TimeStamper stamper){
        timeStamper = stamper;
    }

    public void setViewUpdater(ViewUpdater updater){
        viewUpdater = updater;
    }

}*/
