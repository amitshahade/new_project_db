package com.example.noteadder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class showall extends AppCompatActivity {
    ArrayList<Course> courses = Course.generateNRandomCourses(100);
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showall);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(showall.this));
        //customAdapter = new CustomAdapter(MainActivity.this,this, book_id, book_title, book_author,book_pages);
        recyclerView.setAdapter(customAdapter);

    }
}