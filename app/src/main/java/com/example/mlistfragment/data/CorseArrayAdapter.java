package com.example.mlistfragment.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mlistfragment.R;

import java.util.List;

public class CorseArrayAdapter extends ArrayAdapter<Course> {

    private Context context;
    private List<Course> courses;

    public CorseArrayAdapter(@NonNull Context context, int resource, List<Course> courses) {
        super(context, resource, courses);

        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Course course = courses.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.course_list_itm, null);

        ImageView imgView =  view.findViewById(R.id.courseImageId);
        imgView.setImageResource(course.getImgResId(context));

        TextView textView =  view.findViewById(R.id.courseName);
        textView.setText(course.getCourseName());

        return view;

        //return super.getView(position, convertView, parent);
    }
}
