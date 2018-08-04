package com.example.imtiazaminsajid.sakib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText totalProduction, manPower, workHour, smv;
    private TextView efficency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalProduction = findViewById(R.id.total_productionET);
        manPower = findViewById(R.id.man_powerET);
        workHour = findViewById(R.id.work_hourET);
        smv = findViewById(R.id.smvET);
        efficency = findViewById(R.id.efficiencyTV);
    }

    public void efficiency(View view) {

        if (totalProduction.getText().toString().equals("")||manPower.getText().toString().equals("") || workHour.getText().toString().equals("") || smv.getText().toString().equals("")) {
            Toast.makeText(this, "Enter All Number", Toast.LENGTH_SHORT).show();
        } else {

            Float total_productionV = Float.valueOf(totalProduction.getText().toString());
            Float man_PowerV = Float.valueOf(manPower.getText().toString());
            Float work_hourV = Float.valueOf(workHour.getText().toString());
            Float smvV = Float.valueOf(smv.getText().toString());

            Float efficiencyResult = ((total_productionV*smvV)/(man_PowerV*work_hourV*60))*100;

            efficency.setText(efficiencyResult+"%");

        }

    }
}
