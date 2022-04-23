package java.android.androidlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonMainActivity2;
    private Button buttonCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMainActivity2 = findViewById(R.id.buttonMainActivity2);
        buttonCalendar = findViewById(R.id.buttonCalendar);

        buttonMainActivity2.setOnClickListener(this);
        buttonCalendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button)view;
        if(button == buttonMainActivity2){
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        }else
        if(button == buttonCalendar){
            startActivity(new Intent(MainActivity.this,Calendar.class));
        }
    }
}