package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9, buttonAdd,buttonSub,
            buttonDiv, buttonMul, button10, buttonC, buttonEqual;
    EditText CalEditText;

    float mValueOne, mValueTwo;

    boolean CalAdd, mSub, CalMul, CalDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        CalEditText = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(CalEditText == null)
                {
                    CalEditText.setText("");
                }else{
                    mValueOne = Float.parseFloat(CalEditText.getText() + "" );
                    CalAdd = true;
                    CalEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                mValueOne = Float.parseFloat(CalEditText.getText() + "");
                mSub = true;
                CalEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueOne = Float.parseFloat(CalEditText.getText() + "");
                CalMul = true;
                CalEditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueOne = Float.parseFloat(CalEditText.getText() + "");
                CalDiv = true;
                CalEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mValueTwo = Float.parseFloat(CalEditText.getText()+"");

                if(CalAdd == true)
                {
                    CalEditText.setText(mValueOne + mValueTwo+ "");
                    CalAdd = false;
                }

                if(mSub == true)
                {
                    CalEditText.setText(mValueOne - mValueTwo+ "");
                    mSub= false;
                }

                if(CalMul == true)
                {
                    CalEditText.setText(mValueOne * mValueTwo+ "");
                    CalMul= false;
                }

                if(CalDiv == true)
                {
                    CalEditText.setText(mValueOne / mValueTwo+ "");
                    CalDiv= false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CalEditText.setText(CalEditText.getText() + ".");
            }
        });
    }
}
