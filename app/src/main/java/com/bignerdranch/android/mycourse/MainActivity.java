package com.bignerdranch.android.mycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.bignerdranch.android.mycourse.data.Course;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.my_container);

        if(fragment == null) {
            fragment = new CourseListFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.my_container, fragment)
                    .commit();
        }*/

    }

    @Override
    public void onItemSelected(Course course) {

    }
}