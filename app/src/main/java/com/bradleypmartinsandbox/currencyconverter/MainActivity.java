package com.bradleypmartinsandbox.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("CurrencyDebug","Button pressed.");

        EditText editText = findViewById(R.id.editText);

        Log.i("CurrencyDebug", "editText text: " + editText.getText().toString());

        String amountInPounds = editText.getText().toString();

        double amtInPoundsDouble = Double.parseDouble(amountInPounds);
        double amtInDollarsDouble = amtInPoundsDouble * 1.3;

        String amountInDollarsStr = String.format(Locale.ENGLISH, "%.2f", amtInDollarsDouble);

        Log.i("CurrencyDebug", "Converted dollars (str): " + amountInDollarsStr);

        Toast.makeText(this, "You have $" + amountInDollarsStr + " worth of GBP.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
