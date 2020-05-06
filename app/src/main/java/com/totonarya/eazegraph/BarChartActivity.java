package com.totonarya.eazegraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

import java.util.List;

public class BarChartActivity extends AppCompatActivity {

    private BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        barChart = findViewById(R.id.barChart);
        //  barChart.addBarList(List...);
        barChart.addBar(new BarModel("Sotoun-1", 2.3f, 0xFF123456));
        barChart.addBar(new BarModel("Sotoun-2", 2f, 0xFF343456));
        barChart.addBar(new BarModel("Sotoun-3", 2.3f, 0xFF123456));
        barChart.addBar(new BarModel(4.f,  0xFF1BA4E6));

        barChart.startAnimation();

    }
}
