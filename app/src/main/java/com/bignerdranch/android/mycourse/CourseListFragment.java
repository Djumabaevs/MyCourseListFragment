package com.bignerdranch.android.mycourse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.bignerdranch.android.mycourse.data.Course;
import com.bignerdranch.android.mycourse.data.CourseArrayAdapter;
import com.bignerdranch.android.mycourse.data.CourseData;
import com.bignerdranch.android.mycourse.util.ScreenUtility;

import java.util.List;

public class CourseListFragment extends ListFragment {
    List<Course> courses = new CourseData().courseList();

    public CourseListFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScreenUtility screenUtility = new ScreenUtility(getActivity());
        Log.d("Width ", String.valueOf(screenUtility.getDpWidth()));

        CourseArrayAdapter adapter = new CourseArrayAdapter(getActivity(), R.layout.course_listitem, courses);
        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.course_list_fragment, container, false);
        return view;
    }

    public interface Callbacks {
        void onItemSelected(Course course);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Course course = courses.get(position);

 //       startActivity(new Intent(this, CourseDetailActivity.class));  cannot start activity using intent inside a fragment

//        Toast.makeText(getActivity(), "Name: " + course.getCourseName(), Toast.LENGTH_LONG).show();
    }
}
