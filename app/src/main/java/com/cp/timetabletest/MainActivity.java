package com.cp.timetabletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CourseTableView courseTableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseTableView = (CourseTableView) findViewById(R.id.ctv);
        List<Course> list = new ArrayList<>();
        Course c1 = new Course();
        c1.setDay(1);
        c1.setDes("hahahah");
        c1.setJieci(1);
        list.add(c1);

        Course c2 = new Course();
        c2.setDay(2);
        c2.setDes("hahahah");
        c2.setJieci(6);
        list.add(c2);

        courseTableView.updateCourseViews(list);
    }
}
