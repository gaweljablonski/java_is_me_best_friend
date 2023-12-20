package com.mojitoproject.testyhindusow;

import com.mojitoproject.testyhindusow.Popup.OnSubmitListener;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomPopupWindowActivity extends AppCompatActivity implements OnSubmitListener {

    Context context;
    Popup popup;

    TextView mTextView1, mTextView2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mTextView1 = (TextView) findViewById(R.id.textView1);
        mTextView2 = (TextView) findViewById(R.id.textView2);

        context = this;
        popup = new Popup(context, this);
    }

    public void showPopup(View v) {
        popup.show(v);
    }

    @Override
    public void valueChanged(String name, String number) {
        mTextView1.setText(name);
        mTextView2.setText(number);
        Toast.makeText(this, "Values updated", Toast.LENGTH_SHORT).show();
    }
}