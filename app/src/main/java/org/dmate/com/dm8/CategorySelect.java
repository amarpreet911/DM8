package org.dmate.com.dm8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.dmate.com.dm8.maps.DriverMap1;

/**
 * Created by amarpreet911 on 29/11/16.
 */

public class CategorySelect extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_select);
        System.out.println("reached goal");
    }
    public void layMidClk(View view){
        Intent intent = new Intent(CategorySelect.this, DriverMap1.class);
        startActivity(intent);
    }
}
