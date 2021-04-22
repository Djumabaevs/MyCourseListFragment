package com.bignerdranch.android.mycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.bignerdranch.android.mycourse.data.Course;
import com.bignerdranch.android.mycourse.data.CourseData;

public class CourseDetailActivity extends AppCompatActivity {
    Course course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        if(savedInstanceState == null) {

            Bundle extra = getIntent().getExtras();
            int position = extra.getInt("course_id");
            course = new CourseData().courseList().get(position);
            Toast.makeText(getApplicationContext(), "Course name: " + course.getCourseName(), Toast.LENGTH_LONG).show();

            CourseDetailFragment fragment = new CourseDetailFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(R.id.detail_container, fragment)
                    .commit();

        }
    }
}