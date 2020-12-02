package com.example.mlistfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.mlistfragment.data.CorseArrayAdapter;
import com.example.mlistfragment.data.Course;
import com.example.mlistfragment.data.CourseData;

import java.util.List;

public class MyFrag extends ListFragment {
    List<Course> courses = new CourseData().courseList();

    public MyFrag() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CorseArrayAdapter adapter = new CorseArrayAdapter(getActivity(), R.layout.course_list_itm, courses);
        setListAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.my_fragment, container, false);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
