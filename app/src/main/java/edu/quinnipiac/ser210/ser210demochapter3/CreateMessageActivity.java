package edu.quinnipiac.ser210.ser210demochapter3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this,ReceiveMessageActivity.class);

        EditText inputText = (EditText) findViewById(R.id.message);

        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,inputText.getText().toString());
        startActivity(intent);
    }
}