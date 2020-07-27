package com.example.dialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MyDialog.MyDialogeventListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogBtn = findViewById(R.id.btn_main_showDialog);
        showDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog();
                //myDialog.setCancelable(false);
                myDialog.show(getSupportFragmentManager(), null);

            }
        });
    }

    @Override
    public void onOkButtonClicked(String data) {

    }

    @Override
    public void onCancelButtonClicked() {

    }
}