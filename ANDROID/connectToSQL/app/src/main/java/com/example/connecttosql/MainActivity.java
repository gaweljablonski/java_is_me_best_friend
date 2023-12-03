package com.example.connecttosql;

import androidx.appcompat.app.AppCompatActivity;
/*
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
*/
//import android.support.v4.app.ActionA;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText UsernameEt, PasssordEt;
    //conn.php & login.php are in C:\xampp\htdocs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        UsernameEt = (EditText)findViewById(R.id.etUserName);
//        PasssordEt = (EditText)findViewById(R.id.etPassword);
    }
    public void OnLogin(View view)
    {
//        String username = UsernameEt.getText().toString();
        String username = "123";
//        String password = PasssordEt.getText().toString();
        String password = "1232";
        String type = "login";


        BackgroudWorker backgroudWorker = new BackgroudWorker(this);
        backgroudWorker.execute(type, username, password);
    }
}