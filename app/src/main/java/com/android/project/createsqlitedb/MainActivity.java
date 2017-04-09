package com.android.project.createsqlitedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Sql_data sql_database;
    TextView textView;
    Sql_data db= new Sql_data(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display_textview);
        db.deleteAllItems();
        sql_database = new Sql_data(this);

        sql_database.insertName("Abdul","Kalam");
        sql_database.insertName("Zaheer","Khan");
        sql_database.insertName("Judy","Simons");
        sql_database.insertName("Sachin","Tendulkar");
        sql_database.insertName("John","Hopkins");
        sql_database.insertName("Desmond","Mills");

        sql_database.getName(textView);
    }
}
