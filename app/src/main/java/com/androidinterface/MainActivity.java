package com.androidinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Sandeep on 13/11/17.
 */

public  class MainActivity extends AppCompatActivity implements MainClassInterface {
    TextView tv_fname, tv_lname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_fname = (TextView) findViewById(R.id.text1);
        tv_lname = (TextView) findViewById(R.id.text2);
        excute();

    }


    private void excute() {
        firstname();
        lastname();
    }

    @Override
    public void firstname() {
        tv_fname.setText("Sandy");
    }

    @Override
    public void lastname() {
       tv_lname.setText("Devil");
    }
}
