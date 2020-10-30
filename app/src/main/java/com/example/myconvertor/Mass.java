package com.example.myconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Mass extends AppCompatActivity {
    TextView tvFrom, tvTo, tvKgs, tvKgs1, tvPounds, tvPounds1, tvOunces, tvOunces1;
    TextView tvCarats, tvCarats1, tvShow, tvShow1, tvAnswer;
    EditText etEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);;
        tvCarats = findViewById(R.id.tvFoot);
        tvCarats1 = findViewById(R.id.tvFoot1);
        tvKgs = findViewById(R.id.tvMetres);
        tvKgs1 = findViewById(R.id.tvMetres1);
        tvOunces = findViewById(R.id.tvYards);
        tvOunces1 = findViewById(R.id.tvYards1);
        tvPounds = findViewById(R.id.tvMiles);
        tvPounds1 = findViewById(R.id.tvMiles1);
        tvFrom = findViewById(R.id.tvFrom);
        tvTo = findViewById(R.id.tvTo);
        tvShow = findViewById(R.id.tvShow);
        tvShow1 = findViewById(R.id.tvShow1);
        tvAnswer = findViewById(R.id.tvAnswer);
        etEnter = findViewById(R.id.etEnter);
    }

    public void showCarats(View view) {
        String unit = tvCarats.getText().toString();
        tvShow.setText(unit);
    }

    public void showCarats1(View view) {
        String unit = tvCarats1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showKgs(View view) {
        String unit = tvKgs.getText().toString();
        tvShow.setText(unit);
    }

    public void showKgs1(View view) {
        String unit = tvKgs1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showPounds(View view) {
        String unit = tvPounds.getText().toString();
        tvShow.setText(unit);
    }

    public void showOunces(View view) {
        String unit = tvOunces.getText().toString();
        tvShow.setText(unit);
    }

    public void showPounds1(View view) {
        String unit = tvPounds1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showOunces1(View view) {
        String unit = tvOunces1.getText().toString();
        tvShow1.setText(unit);
    }

    public void convert(View view) {
        if (tvShow1.getText().toString().equals("Kilograms") && tvShow.getText().toString().equals("Kilograms")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }

        else if (tvShow1.getText().toString().equals("Pounds") && tvShow.getText().toString().equals("Kilograms")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*2.20462;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Ounces") && tvShow.getText().toString().equals("Kilograms")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*35.274;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Carats") && tvShow.getText().toString().equals("Kilograms")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*5000;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Kilograms") && tvShow.getText().toString().equals("Pounds")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.453592;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Pounds") && tvShow.getText().toString().equals("Pounds")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Ounces") && tvShow.getText().toString().equals("Pounds")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*16;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Carats") && tvShow.getText().toString().equals("Pounds")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*2267.96;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Kilograms") && tvShow.getText().toString().equals("Carats")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.0002000005424;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(answer)+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Pounds") && tvShow.getText().toString().equals("Carats")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.00044092572015706516398;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Ounces") && tvShow.getText().toString().equals("Carats")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.00705479;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Carats") && tvShow.getText().toString().equals("Carats")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Kilograms") && tvShow.getText().toString().equals("Ounces")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.0283495;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Pounds") && tvShow.getText().toString().equals("Ounces")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.0625;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Ounces") && tvShow.getText().toString().equals("Ounces")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2/1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Carats") && tvShow.getText().toString().equals("Ounces")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*141.748;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else{
            tvAnswer.setText("Highlight the 'From' and 'To' Units");
        }
    }
}