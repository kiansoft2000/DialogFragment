package com.example.dialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.MyDialogeventListener {

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
<<<<<<< HEAD
    public void onOkButtonClicked(final String data) {
        final TextView textView = findViewById(R.id.tv_main);
=======
    public void onOkButtonClicked(String data) {
        TextView textView=findViewById(R.id.tv_main_showText);
>>>>>>> master
        textView.setText(data);

    }

    @Override
    public void onCancelButtonClicked() {
<<<<<<< HEAD
        Toast.makeText(this,"Cancel Button Clicked!",Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(MainActivity.this,"Message was Canceled!",Toast.LENGTH_SHORT).show();

>>>>>>> master
    }
}