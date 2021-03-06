package com.github.badoualy.datepicker.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.badoualy.datepicker.DatePickerTimeline;
import com.github.badoualy.datepicker.MonthView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        DatePickerTimeline timeline = (DatePickerTimeline) findViewById(R.id.timeline);
        final MonthView.DateLabelAdapter adapter = new MonthView.DateLabelAdapter() {

            @Override
            public CharSequence getLabel(Calendar calendar, int index) {
                return Integer.toString(calendar.get(Calendar.MONTH) + 1) + "/" + (calendar.get(Calendar.YEAR) % 2000);
            }
        };
        timeline.setDateLabelAdapter(adapter);

        //timeline.setFirstVisibleDate(2016, Calendar.JULY, 19);
    }

}
