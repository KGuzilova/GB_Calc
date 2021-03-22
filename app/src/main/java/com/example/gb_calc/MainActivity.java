package com.example.gb_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.gb_calc.logic.PressButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity{

    private Double value1 = null;

    public TextView result;
    public EditText enterValues;
    public Switch switchTheme;

    private static final String ADD = "+";
    private static final String MIN = "-";
    private static final String MULT = "*";
    private static final String DIV = "/";
    public String equalOperation = "=";

//    private static final String appTheme​= "APP_THEME";
//​   private static final int​LightTheme = 1;
//​   private​static​final​int​DarkTheme = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(R.style.GB_Calc_Dark);
        setContentView(R.layout.activity_calculator);

        enterValues = (EditText) findViewById(R.id.enter_values);
        result = (TextView) findViewById(R.id.result);
        switchTheme = (Switch) findViewById(R.id.switchTheme);

//        switchTheme.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick (View v) {
//                boolean checked = ((Switch) v).isChecked();
//                if (checked){
//                    setTheme(R.style.GB_Calc_Light);
//                }
//                else{
//                    setTheme(R.style.GB_Calc_Dark);
//                }
//            }
//        });

        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)  {
                    setTheme(R.style.GB_Calc_Light);
                } else {
                    setTheme(R.style.GB_Calc_Dark);
                }
            }
        });
    }

    public void ButClick(View view){
        Button button = (Button)view;
        enterValues.append(button.getText());
    }

    public void ButOperationClick(View view){
        Button button = (Button)view;
        result.setText(button.getText());
//        String value1S = enterValues.getText().toString();
//        String operation = button.getText().toString();
//        if(value1S.length()>0){
//            value1S = value1S.replace(',', '.');
//            try{
//                operationWithValues(Double.valueOf(value1S), operation);
//            }catch (NumberFormatException ex){
//                result.setText("");
//            }
//        }
//        equalOperation = operation;
    }

//    public void operationWithValues (Double value1S, String operation){
//        if (value1==0){
//            value1 = value1S;
//        }
//        else{
//            if(equalOperation.equals("=")){
//                equalOperation=operation;
//            }
//            switch (equalOperation){
//                case "=":
//                    value1 = value1S;
//                    break;
//                case ADD:
//                    value1 += value1S;
//                    break;
//                case MIN:
//                    value1 -= value1S;
//                    break;
//                case MULT:
//                    value1 *=value1S;
//                    break;
//                case DIV:
//                    if (value1S==0){
//                       value1 = 0.0;
//                    }
//                    else {
//                        value1 /= value1S;
//                    }
//                    break;
//            }
//        }
//        result.setText(value1.toString());
//    }

}