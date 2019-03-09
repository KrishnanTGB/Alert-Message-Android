package com.krish.Krishnan_Ex13;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        Context context=getApplicationContext();
        String text="Hello Krish!";
        int duration= Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(context,text,duration);
        toast.show();
        Toast.makeText(this,"Hello Buddy!",Toast.LENGTH_SHORT).show();
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id){
                        dialog.cancel();
                    }
                });
        AlertDialog alert=builder.create();
        alert.setTitle("AlertDemo");
        alert.show();
        setContentView(R.layout.main);
    }
}
