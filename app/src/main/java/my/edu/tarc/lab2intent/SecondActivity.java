package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textViewMsg;
        textViewMsg = findViewById(R.id.textViewMessage);
        //Read the intent extra value
        Intent intent = getIntent();

        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            if(intent.hasExtra(MainActivity.TAG_MESSAGE2)) {
                String HeightMsg;
                String WeightMsg;
                HeightMsg = intent.getStringExtra(MainActivity.TAG_MESSAGE);
                WeightMsg = intent.getStringExtra(MainActivity.TAG_MESSAGE2);

                double height, weight, BMI;

                height = Double.parseDouble(HeightMsg);
                weight = Double.parseDouble(WeightMsg);
                BMI = weight / (height * height);

                String finalMsg;
                finalMsg = "Your BMI is " + BMI;
                textViewMsg.setText(finalMsg);
            }
        }
        ImageView iamgeView;
    }
}
