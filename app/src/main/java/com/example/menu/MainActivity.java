package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout c1;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.c1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        switch (item.getItemId()){


            case R.id.red :
            c1.setBackgroundColor(Color.RED);
            item.setEnabled(false);
            return true;

            case R.id.blue :
                c1.setBackgroundColor(Color.BLUE);
                item.setEnabled(false);
                return true;

            case R.id.green :
                c1.setBackgroundColor(Color.GREEN);
                item.setEnabled(false);
                return true;

            case R.id.yellow :
                c1.setBackgroundColor(Color.YELLOW);
                item.setEnabled(false);
                return true;
        }
        return true;
    }
}
