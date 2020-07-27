package com.example.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    private MyDialogeventListener eventListener;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        View view = LayoutInflater.from(getContext()).inflate(R.layout.my_dialog, null, false);
        builder.setView(view);
        Button okBtn=view.findViewById(R.id.btn_dialog_ok);
        Button cancelBtn=view.findViewById(R.id.btn_dialog_cancel);
        final EditText editText=view.findViewById(R.id.et_dialog_input);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.length()>0){
                    eventListener.onOkButtonClicked(editText.getText().toString());
                    dismiss();
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventListener.onCancelButtonClicked();
                dismiss();
            }
        });

        return builder.create();
    }

    public  interface  MyDialogeventListener{
        void onOkButtonClicked(String data);
        void onCancelButtonClicked();
    }
}
