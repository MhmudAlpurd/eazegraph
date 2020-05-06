package com.totonarya.eazegraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bar_Chart, stacked_Bar_Chart, pie_Chart, line_Chart, vertical_Bar_Chart;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

        bar_Chart.setOnClickListener(this);
        stacked_Bar_Chart.setOnClickListener(this);
        pie_Chart.setOnClickListener(this);
        line_Chart.setOnClickListener(this);
        vertical_Bar_Chart.setOnClickListener(this);


    }

    private void setupViews() {
        bar_Chart = findViewById(R.id.bar_Chart);
        stacked_Bar_Chart = findViewById(R.id.stacked_Bar_Chart);
        pie_Chart = findViewById(R.id.pie_Chart);
        line_Chart = findViewById(R.id.line_Chart);
        vertical_Bar_Chart = findViewById(R.id.vertical_Bar_Chart);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.bar_Chart:
                Intent intent_One = new Intent(getApplicationContext(), BarChartActivity.class);
                startActivity(intent_One);

            case R.id.stacked_Bar_Chart:
                Intent intent_Two = new Intent(getApplicationContext(), StackedBarChartActivity.class);
                startActivity(intent_Two);
                break;

            case R.id.pie_Chart:
                Intent intent_Three = new Intent(getApplicationContext(), PieChartActivity.class);
                startActivity(intent_Three);
                break;

            case R.id.line_Chart:
                Intent intent_Four = new Intent(getApplicationContext(), LineChartActivity.class);
                startActivity(intent_Four);
                break;

            case R.id.vertical_Bar_Chart:
                Intent intent_Five = new Intent(getApplicationContext(), VerticalBarChartActivity.class);
                startActivity(intent_Five);
                break;

            default:
                Toast.makeText(this, "Mistake", Toast.LENGTH_SHORT).show();


        }

    }


}
