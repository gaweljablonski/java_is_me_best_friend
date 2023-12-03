package com.example.connectandriod_sql;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection connection;
    String uname, pass, ip, port, database;

    @SuppressLint("NewApi")

    public Connection connectionclass()
    {
        /*
        ip = "<datebase ip>";
        database = "<database name>";
        uname = "<username for database>";
        pass = "<username's passwords for database>";
        port = "<probably: 1433>";
        */
        ip = "127.0.0.1";
        database = "testtutorialhindusa";
        uname = "";
        pass = "";
        port = "3306";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Connection connection = null;
        String connectionURL = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            connectionURL = "jdbc:mysql://"+ ip + ":"+ port+";"+ "databasename="+ database+";user="+uname+";password="+pass+";";
//            connectionURL = ip + " " + uname + "  " + pass + "  " + database + ";";

//            connection = DriverManager.getConnection(connectionURL);
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testtutorialhindusa", "root", "");
        }
        catch (Exception ex)
        {
            Log.e("Error ", ex.getMessage());
        }


        return connection;
    }
}
