package com.example.mlistfragment.data;

import android.content.Context;

public class Course {
    private String courseName;
    private String courseImg;

    public Course() {
    }

    public Course(String courseName, String courseImg) {
        this.courseName = courseName;
        this.courseImg = courseImg;
    }

    public int getImgResId(Context context){
        return context.getResources().getIdentifier(this.courseImg, "drawable", context.getPackageName());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }
}
