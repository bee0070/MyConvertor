package com.example.myconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    TextView tvKelvins, tvKelvins1, tvFahrenheits, tvFahrenheits1, tvCelsius;
    TextView tvCelsius1, tvShow, tvShow1, tvAnswer, tvFrom, tvTo;
    EditText etEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        tvAnswer = findViewById(R.id.tvAnswer);
        tvCelsius = findViewById(R.id.tvMetres);
        tvCelsius1 = findViewById(R.id.tvMetres1);
        tvKelvins = findViewById(R.id.tvYards);
        tvKelvins1 = findViewById(R.id.tvYards1);
        tvFahrenheits = findViewById(R.id.tvMiles);
        tvFahrenheits1 = findViewById(R.id.tvMiles1);
        tvShow = findViewById(R.id.tvShow);
        tvShow1 = findViewById(R.id.tvShow1);
        tvTo = findViewById(R.id.tvTo);
        tvFrom = findViewById(R.id.tvFrom);
        etEnter = findViewById(R.id.etEnter);
    }


    public void showCelsius(View view) {
        String unit = tvCelsius.getText().toString();
        tvShow.setText(unit);
    }

    public void showCelsius1(View view) {
        String unit = tvCelsius1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showFahrenheits(View view) {
        String unit = tvFahrenheits.getText().toString();
        tvShow.setText(unit);
    }

    public void showKelvins(View view) {
        String unit = tvKelvins.getText().toString();
        tvShow.setText(unit);
    }

    public void showKelvins1(View view) {
        String unit = tvKelvins1.getText().toString();
        tvShow1.setText(unit);
    }

    public void showFahrenheits1(View view) {
        String unit = tvFahrenheits1.getText().toString();
        tvShow1.setText(unit);
    }

    public void convert(View view) {
        if (tvShow1.getText().toString().equals("Kelvins") && tvShow.getText().toString().equals("Kelvins")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }

        else if (tvShow1.getText().toString().equals("Fahrenheits") && tvShow.getText().toString().equals("Kelvins")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = (n2*9/5)-459.67;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Degrees Celsius") && tvShow.getText().toString().equals("Kelvins")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2-273.15;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Fahrenheits") && tvShow.getText().toString().equals("Degrees Celsius")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = (n2*9/5)+32;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Degrees Celsius") && tvShow.getText().toString().equals("Degrees Celsius")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Kelvins") && tvShow.getText().toString().equals("Degrees Celsius")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2+273.15;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Fahrenheits") && tvShow.getText().toString().equals("Fahrenheits")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = n2*1;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Degrees Celsius") && tvShow.getText().toString().equals("Fahrenheits")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = (n2-32)*5/9;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else if (tvShow1.getText().toString().equals("Kelvins") && tvShow.getText().toString().equals("Fahrenheits")){
            double n2 = Double.parseDouble(etEnter.getText().toString());
            double answer = (n2+459.67)*5/9;
            tvAnswer.setText( etEnter.getText().toString() +" "  +tvShow.getText().toString() +" = "+String.valueOf(String.format("%.2f", answer))+ " " +tvShow1.getText().toString());
        }
        else{
            tvAnswer.setText("Highlight the 'From' and 'To' Units");
        }
    }
}