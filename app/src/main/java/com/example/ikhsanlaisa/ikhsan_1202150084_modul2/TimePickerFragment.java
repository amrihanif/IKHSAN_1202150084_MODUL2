package com.example.ikhsanlaisa.ikhsan_1202150084_modul2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.TimePicker;
import android.text.format.DateFormat;
import java.util.Calendar;

/**
 * Created by ikhsanlaisa on 17/02/18.
 */

@SuppressLint("ValidFragment")
class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //mengeset waktu sekarang ke datepicker
        final Calendar c = Calendar.getInstance();

        //membuat object baru untuk timepickerdialog dan mengembalikannya
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //mengeset activity ke takeAway activity
        takeAway takeAway = (takeAway) getActivity();
        //memerintahkan takeAway Activity untuk memproses TimePickerDialog() method
        takeAway.processTimePickerResult(hourOfDay, minute);
    }
}
