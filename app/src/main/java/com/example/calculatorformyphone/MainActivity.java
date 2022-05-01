package com.example.calculatorformyphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import org.mariuszgromada.math.mxparser.*;

import android.view.Display;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if
            }
        }

    });
    public void ZeroBTN( View view){

    }

    public void OneBTN( View view){

    }
    public void TwoBTN( View view){

    }

    public void ThreeBTN( View view){

    }

    public void FourBTN( View view){

    }

    public void FiveBTN( View view){

    }

    public void SixBTN( View view){

    }

    public void SevenBTN( View view){

    }

    public void EightBTN( View view){

    }

    public void NineBTN( View view){

    }

    public void ClearBTN( View view){




    }

    public void BackspaceBTN( View view){

    }

    public void ParenthesisBTN( View view){

    }

    public void EqualsBTN( View view){
        String userExp = display.getText().toString();

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());





    }

    public void SubtractBTN( View view){

    }

    public void AdditionBTN( View view){

    }

    public void MultiplyBTN( View view){

    }

    public void DivideBTN( View view){

    }

    public void PlusMinusBTN(View view){

    }

    public void PointBTN( View view){

    }

    public void ExponentBTN( View view){

    }

}