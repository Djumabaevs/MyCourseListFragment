package com.bignerdranch.android.mycourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.bignerdranch.android.mycourse.data.Course;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {
    private boolean isTwoPane = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.detail_container) != null) {
            isTwoPane = true;
        }
    }

    @Override
    public void onItemSelected(Course course, int position) {
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();

        if (isTwoPane) {
            Bundle bundle = new Bundle();
            bundle.putInt("course_id", position);

            FragmentManager fragmentManager = getSupportFragmentManager();
            CourseDetailFragment courseDetailFragment = new CourseDetailFragment();
            courseDetailFragment.setArguments(bundle);

            fragmentManager.beginTransaction()
                    .replace(R.id.detail_container, courseDetailFragment)
                    .commit();
        } else {
            Intent intent = new Intent(MainActivity.this, CourseDetailActivity.class);
            intent.putExtra("course_id", position);
            startActivity(intent);
        }
    }
}