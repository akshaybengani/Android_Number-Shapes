package com.akshaybengani.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number
    {
        double myNumber;
        public boolean isTriangular()
        {
            int x=1;
            int triangularNumber =1;
            while (triangularNumber < myNumber)
            {
                x++;
                triangularNumber = triangularNumber +x;
            }
            if(triangularNumber==myNumber)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        public boolean isSquare()
        {
            double squareRoot = Math.sqrt(myNumber);
            if(squareRoot == Math.floor(squareRoot))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }



    public void makeToast(String answer){
        Toast.makeText(MainActivity.this,answer, Toast.LENGTH_SHORT).show();
    }

    public void checkShape(View view)
    {

        EditText enteredValue=(EditText)findViewById(R.id.EnteredValue);

     if (enteredValue.getText().toString().isEmpty())
     {
         makeToast("Please Enter a Value");
     }
     else {

         double value2use=Double.parseDouble(enteredValue.getText().toString());
         Number numCheck=new Number();
         numCheck.myNumber=value2use;

         if (numCheck.isTriangular()) {
             if (numCheck.isSquare()) {
                 makeToast("The Entered value is Both Triangular Number and Square Number");
             } else {
                 makeToast("The Entered value is a Triangular Number but not a Square Number");
             }
         } else {
             if (numCheck.isSquare()) {
                 makeToast("The Entered value is a square Number but not a triangular Number");
             } else {
                 makeToast("The Entered Number is not a Triangular Number as well as Square Number");
             }
         }
     }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
