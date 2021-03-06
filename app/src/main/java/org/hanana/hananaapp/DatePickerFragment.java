package org.hanana.hananaapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        DatePickerDialog dateSettings = new DatePickerDialog(getActivity());

        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog;
        dialog = new android.app.DatePickerDialog(getActivity(), this, year, month, day);
//
        return dialog;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

    }
}
