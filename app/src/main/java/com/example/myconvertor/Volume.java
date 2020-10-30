package com.example.myconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Volume extends AppCompatActivity {

    TextView tvFrom, tvTo, tvShow, tvLitres, tvLitres1, tvGallons1, tvGallons, tvQuarts, tvQuarts1, tvShow1, tvAnswer;
    EditText etEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        tvFrom = findViewById(R.id.tvFrom);
        tvTo = findViewById(R.id.tvTo);
        tvShow = findViewById(R.id.tvShow);
        tvLitres = findViewById(R.id.tvMetres);
        tvLitres1 = findViewById(R.id.tvMetres1);
        tvGallons1 = findViewById(R.id.tvMiles1);
        tvGallons = findViewById(R.id.tvMiles);
        tvQuarts = findViewById(R.id.tvYards);
        tvQuarts1 = findViewById(R.id.tvYards1);
        tvShow1 = findViewById(R.id.tvShow1);
        tvAnswer = findViewById(R.id.tvAnswer);
        etEnter = findViewById(R.id.etEnter);
    }

    public void showLitres(View view) {
        String unit = tvLitres.getText().toString();
        tvShow.setText(unit);
    }

    public void showLitres1(View view) {
        String unit = tvLitres1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showGallons(View view) {
        String unit = tvGallons.getText().toString();
        tvShow.setText(unit);
    }

    public void showQuarts(View view) {
        String unit = tvQuarts.getText().toString();
        tvShow.setText(unit);
    }

    public void showGallons1(View view) {
        String unit = tvGallons1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showQuarts1(View view) {
        String unit = tvQuarts1.getText().toString();
        tvShow1.setText(unit);
    }

    public void convert(View view) {
        if (tvShow1.getText().toString().equals("Gallons") && tvShow.getText().toString().equals("Litres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.26417206744237231586;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }

        else if (tvShow1.getText().toString().equals("Quarts") && tvShow.getText().toString().equals("Litres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1.05669;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Litres") && tvShow.getText().toString().equals("Litres")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Litres") && tvShow.getText().toString().equals("Quarts")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*3.7854120001470086265;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Gallons") && tvShow.getText().toString().equals("Quarts")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*0.25000001427499973783;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Quarts") && tvShow.getText().toString().equals("Quarts")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Litres") && tvShow.getText().toString().equals("Gallons")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*3.7854120001470086265;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Gallons") && tvShow.getText().toString().equals("Gallons")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Quarts") && tvShow.getText().toString().equals("Gallons")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*4.0000002283999958053;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else{
            tvAnswer.setText("Highlight the 'From' and 'To' Units");
        }
    }
}
