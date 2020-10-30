package com.example.myconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    TextView tvTo, tvFrom, tvShow, tvShow1, tvMetres, tvMetres1, tvMiles, tvMiles1, tvFoot, tvFoot1;
    TextView tvYards, tvYards1, tvAnswer, tvInches, tvInches1;
    EditText etEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        tvTo = findViewById(R.id.tvTo);
        tvFrom = findViewById(R.id.tvFrom);
        tvShow = findViewById(R.id.tvShow);
        tvShow1 = findViewById(R.id.tvShow1);
        tvMetres = findViewById(R.id.tvMetres);
        tvMetres1 = findViewById(R.id.tvMetres1);
        tvMiles = findViewById(R.id.tvMiles);
        tvMiles1 = findViewById(R.id.tvMiles1);
        tvYards = findViewById(R.id.tvYards);
        tvYards1 = findViewById(R.id.tvYards1);
        tvAnswer = findViewById(R.id.tvAnswer);
        tvInches = findViewById(R.id.tvInches);
        tvInches1 = findViewById(R.id.tvInches1);
        tvFoot = findViewById(R.id.tvFoot);
        tvFoot1 = findViewById(R.id.tvFoot1);
        etEnter = findViewById(R.id.etEnter);
    }

    public void showMetres(View view) {
        String unit = tvMetres.getText().toString();
        tvShow.setText(unit);
    }

    public void showMetres1(View view) {
        String unit = tvMetres1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showYards(View view) {
        String unit = tvYards.getText().toString();
        tvShow.setText(unit);
    }

    public void showMiles(View view) {
        String unit = tvMiles.getText().toString();
        tvShow.setText(unit);
    }

    public void showMiles1(View view) {
        String unit = tvMiles1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showYards1(View view) {
        String unit = tvYards1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showInches(View view) {
        String unit = tvInches.getText().toString();
        tvShow.setText(unit);
    }

    public void showInches1(View view) {
        String unit = tvInches1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showFoot(View view) {
        String unit = tvFoot.getText().toString();
        tvShow.setText(unit);
    }

    public void showFoot1(View view) {
        String unit = tvFoot1.getText().toString();
        tvShow1.setText(unit);
    }

    public void convert(View view) {
        if (tvShow1.getText().toString().equals("Metres") && tvShow.getText().toString().equals("Metres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Miles") && tvShow.getText().toString().equals("Metres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.000621371;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Yards") && tvShow.getText().toString().equals("Metres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1.09361296;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Foot") && tvShow.getText().toString().equals("Metres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*3.2808388799999997;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Inches") && tvShow.getText().toString().equals("Metres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*39.3701102362;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Yards") && tvShow.getText().toString().equals("Inches")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.0277778;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Miles") && tvShow.getText().toString().equals("Inches")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1.57828E-5;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Metres") && tvShow.getText().toString().equals("Inches")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2/39.3701102362;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Inches") && tvShow.getText().toString().equals("Inches")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Foot") && tvShow.getText().toString().equals("Inches")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2/12.00000959999375993;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Foot") && tvShow.getText().toString().equals("Yards")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*5280;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Inches") && tvShow.getText().toString().equals("Yards")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*63360;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Miles") && tvShow.getText().toString().equals("Yards")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.000568182;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Metres") && tvShow.getText().toString().equals("Yards")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.914400292608;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Yards") && tvShow.getText().toString().equals("Yards")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2/1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(answer)+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Foot") && tvShow.getText().toString().equals("Miles")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*5280;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Inches") && tvShow.getText().toString().equals("Miles")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*63360;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Miles") && tvShow.getText().toString().equals("Miles")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Metres") && tvShow.getText().toString().equals("Miles")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1609.344869046;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Yards") && tvShow.getText().toString().equals("Miles")) {
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1760;
            tvAnswer.setText(etEnter.getText().toString() + " " + tvShow.getText().toString() + " = " + String.valueOf(answer) + " " + tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Foot") && tvShow.getText().toString().equals("Foot")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Inches") && tvShow.getText().toString().equals("Foot")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*12;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Miles") && tvShow.getText().toString().equals("Foot")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.000189394;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Metres") && tvShow.getText().toString().equals("Foot")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.304800097536;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Yards") && tvShow.getText().toString().equals("Foot")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2/0.33333344000000003637;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(answer)+ " " +tvShow1.getText().toString());
        }
        else{
            tvAnswer.setText("Highlight the 'From' and 'To' Units");
        }
    }
}