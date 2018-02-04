package com.example.nancy.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void AudToRmb(View view){
        EditText curInput=findViewById(R.id.currencyInput);
        Double aud=new Double(curInput.getText().toString()).doubleValue();
        Toast.makeText(MainActivity.this, "¥"+convert(aud,5), Toast.LENGTH_SHORT).show();
    }

    // Make the convert function more general so that it can be reused in all the other currency conversions i.e USD->RMB
    public String convert(Double inputCurrency, int exchangeRate){
        Double convertCurrencyDouble = inputCurrency*exchangeRate;
        String convertCurrency= String.valueOf(convertCurrencyDouble);
        return convertCurrency;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
