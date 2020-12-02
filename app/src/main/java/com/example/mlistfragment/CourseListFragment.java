package com.example.mlistfragment;

import android.content.Context;
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

import com.example.mlistfragment.data.CorseArrayAdapter;
import com.example.mlistfragment.data.Course;
import com.example.mlistfragment.data.CourseData;
import com.example.mlistfragment.util.ScreenUtil;

import java.util.List;

public class CourseListFragment extends ListFragment {
    private CallBacks activity;

    List<Course> courses = new CourseData().courseList();

    public CourseListFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScreenUtil screenUtil = new ScreenUtil(getActivity());
        Log.d("Width, height", "onCreate: " + screenUtil.getDpWidth() + " / " + screenUtil.getDpHeight());

        CorseArrayAdapter adapter = new CorseArrayAdapter(getActivity(), R.layout.course_list_itm, courses);
        setListAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.course_list_fragment, container, false);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface CallBacks{
        public void onItemSelected(Course course, int position);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        //Toast.makeText(getActivity(), "position "+position, Toast.LENGTH_SHORT).show();

        Course course = courses.get(position);
        this.activity.onItemSelected(course, position);
        //Toast.makeText(getActivity(), "course "+course.getCourseName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.activity = (CallBacks) context;
    }
}
