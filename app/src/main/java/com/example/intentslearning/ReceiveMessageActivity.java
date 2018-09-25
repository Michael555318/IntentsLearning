package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    private TextView displayMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        wireWidgets();
        displayMsg.setText(getIntent().getStringExtra(SendMessageActivity.EXTRA_SENT_MESSAGE));
    }

    private void wireWidgets() {
        displayMsg = findViewById(R.id.textView_receivemessage_displayMsg);
    }
}
