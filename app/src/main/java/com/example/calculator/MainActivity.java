package com.example.calculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import android.widget.Switch;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarView;
import androidx.core.view.ViewCompat;


public class MainActivity extends AppCompatActivity {

    EditText firstET;
    EditText secondET;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstET = findViewById(R.id.firstET);
        secondET = findViewById(R.id.secodET);
        resultTV = findViewById(R.id.resultTV);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("sum+");
        menu.add("subtract-");
        menu.add("multification*");
        menu.add("division:");
        menu.add("C");

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        String st = menuItem.getTitle().toString();
        String st1 = firstET.getText().toString();
        String st2 = secondET.getText().toString();

        try {

            int num1 = Integer.parseInt(st1);
            int num2 = Integer.parseInt(st2);
            int result;

            if (st.equals("sum+")) {
                result = num1 + num2;
                resultTV.setText(String.valueOf(result));
            } else if (st.equals("subtract-")) {
                result = num1 - num2;
                resultTV.setText(String.valueOf(result));
            } else if (st.equals("multification*")) {
                result = num1 * num2;
                resultTV.setText(String.valueOf(result));
            } else if (st.equals("division:")) {
                if (num2 != 0) {
                    result = num1 / num2;
                    resultTV.setText(String.valueOf(result));
                } else {
                    resultTV.setText("you cant divide by zero");
                }
            } else { // C
                resultTV.setText(" ");
                firstET.setText(" ");
                secondET.setText(" ");
            }
        } catch (NumberFormatException e) {
            resultTV.setText("enter numbers only");
        }

        return super.onOptionsItemSelected(menuItem);
    }
}



