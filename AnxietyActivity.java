package com.example.beyourbestselfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AnxietyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety);

        String[] anxietyTitle = {"How to Replace Anxiety with Purpose", "BE ANXIOUS FOR NOTHING | Overcoming Anxiety & Worry", "OVERCOME ANXIETY", "YOU ARE STRONG", "How to Cope with Anxiety", "Powerful Life Advice on Overcoming Depression and Anxiety"};
        ListView anxietyListView = findViewById(R.id.newListViewAnxiety);
        ArrayAdapter<String> aAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, anxietyTitle);
        anxietyListView.setAdapter(aAdapter);

        anxietyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> aParent, View aView, int aPosition, long aId) {
                switch (aPosition){
                    case 0:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo1.class));
                        break;
                    case 1:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo2.class));
                        break;
                    case 2:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo3.class));
                        break;
                    case 3:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo4.class));
                        break;
                    case 4:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo5.class));
                        break;
                    case 5:
                        startActivity(new Intent(AnxietyActivity.this, AnxietyVideo6.class));
                        break;
                }



            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.back){
            // Back icon has been selected
            Toast.makeText(this, "Back!!", Toast.LENGTH_SHORT).show();
            // Navigate to the previous activity
            Intent aIntent = new Intent(this, RadioButtonActivity.class);
            startActivity(aIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
