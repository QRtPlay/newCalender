package com.example.newcalender;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to handle click on "Add Task" button
    public void addTaskOnClick(View view) {
        Toast.makeText(this, "Add Task button clicked", Toast.LENGTH_SHORT).show();
        // Add logic to add a new task
    }

    // Method to handle click on "Add Reminder" button
    public void addReminderOnClick(View view) {
        Toast.makeText(this, "Add Reminder button clicked", Toast.LENGTH_SHORT).show();
        // Add logic to add a new reminder
    }
}
