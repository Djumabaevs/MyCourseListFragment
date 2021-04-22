package com.bignerdranch.android.mycourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        if(savedInstanceState == null) {
            CourseDetailFragment fragment = new CourseDetailFragment();

        }
    }
}