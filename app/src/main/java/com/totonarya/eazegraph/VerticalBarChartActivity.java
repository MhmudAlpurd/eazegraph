package com.totonarya.eazegraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.eazegraph.lib.charts.VerticalBarChart;
import org.eazegraph.lib.models.BarModel;

public class VerticalBarChartActivity extends AppCompatActivity {
    VerticalBarChart verticalBarChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_bar_chart);
        verticalBarChart = findViewById(R.id.vertical_Bar_Chart);

        //  verticalbarChart.addBarList(List...);
        verticalBarChart.addBar(new BarModel("Sotoun-1", 2.3f, 0xFF123456));
        verticalBarChart.addBar(new BarModel("Sotoun-2", 2f, 0xFF343456));
        verticalBarChart.addBar(new BarModel("Sotoun-3", 2.3f, 0xFF123456));
        verticalBarChart.addBar(new BarModel(4.f, 0xFF1BA4E6));

        verticalBarChart.startAnimation();
    }
}
