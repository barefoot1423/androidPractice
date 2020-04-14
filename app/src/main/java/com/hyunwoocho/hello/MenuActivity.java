package com.hyunwoocho.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackButtonClicked(View view) {
        Toast.makeText(getApplicationContext(), "Clicked back button", Toast.LENGTH_LONG).show();;
        finish();
    }
}
