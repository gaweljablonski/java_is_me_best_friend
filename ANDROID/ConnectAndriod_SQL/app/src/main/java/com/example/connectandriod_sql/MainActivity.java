package com.example.connectandriod_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.ConnectionRequest;
import android.view.View;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    Connection connect;
    String connectionResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetTextFromSQL(View v)
    {
        TextView txt1 = (TextView) findViewById(R.id.textView);
        TextView txt2 = (TextView) findViewById(R.id.textView2);
//        System.out.println("czy to tu wchodzi");

        try
        {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionclass();
            if(connect != null)
            {
                String query = "Select * form product_setup_tab";        //"Select * form <table name>"
                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery(query);

                txt1.setText("czy to działa");

                while (rs.next())
                {
                    txt1.setText(rs.getString(1));
                    txt2.setText(rs.getString(2));
                }
            }
            else
            {
                connectionResult = "Check connection";
            }
        }
        catch (Exception ex)
        {

        }
    }

    public void testButton(View v)
    {
        TextView txt1 = (TextView) findViewById(R.id.textView2);
        txt1.setText("test");
    }

}