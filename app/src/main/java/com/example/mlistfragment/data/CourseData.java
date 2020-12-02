package com.example.mlistfragment.data;

import java.util.ArrayList;

public class CourseData {

    private String[] courseNames = {"Index 1", "Index 2", "Index 3", "Index 4"};

    public ArrayList<Course> courseList(){
        ArrayList<Course> list = new ArrayList<>();
        for (int i=0; i<courseNames.length; i++){
            Course course = new Course(courseNames[i], courseNames[i].replace(" ", "").toLowerCase());
            list.add(course);
        }
        return list;
    }

}
