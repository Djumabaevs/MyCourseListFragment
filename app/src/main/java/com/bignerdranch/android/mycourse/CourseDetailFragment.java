package com.bignerdranch.android.mycourse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bignerdranch.android.mycourse.data.Course;

public class CourseDetailFragment extends Fragment {

    Course course;

    //required no-args constructor
    public CourseDetailFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.course_detail_fragment, container, false);

    }
}
