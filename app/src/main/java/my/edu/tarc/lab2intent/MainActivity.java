package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE = "my.edu.tarc.lab2intent.MESSAGE";
    public static final String TAG_MESSAGE2 = "my.edu.tarc.lab2intent.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText editTextMessage;
        EditText editTextMessage2;
        editTextMessage = findViewById(R.id.editTextMessage);
        editTextMessage2 = findViewById(R.id.editTextMessage2);
        //if no message was received, error message will be prompted
        if (TextUtils.isEmpty(editTextMessage.getText())){
            editTextMessage.setError(getString(R.string.error_message));
            return;
        }
        if (TextUtils.isEmpty(editTextMessage2.getText())){
            editTextMessage.setError(getString(R.string.error_message));
            return;
        }

        String heightMsg;
        String weightMsg;
        heightMsg = editTextMessage.getText().toString();
        weightMsg = editTextMessage2.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra(TAG_MESSAGE, heightMsg);
        intent.putExtra(TAG_MESSAGE2, weightMsg);
        startActivity(intent);
    }
}
