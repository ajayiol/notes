package com.example.nick_.notes;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText userTxt;
    EditText passTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userTxt = (EditText) findViewById(R.id.userTxt);
        passTxt = (EditText) findViewById(R.id.passTxt);
        TextView signUp = (TextView) findViewById(R.id.signUp);
        signUp.setMovementMethod(LinkMovementMethod.getInstance());
    }


    public void enter(View v){
        String username = userTxt.getText().toString();
        String password = passTxt.getText().toString();
        if(username.matches("nick_dammy2") && password.matches("damilola")) {
            Intent myIntent = new Intent(this, start.class);
            Bundle b1 = new Bundle();
            b1.putString("Name",username);
            myIntent.putExtras(b1);
            startActivity(myIntent);

        }
        else{
            AlertDialog alertDialog = new AlertDialog.Builder(login.this).create();
            alertDialog.setTitle("ERROR");
            alertDialog.setMessage("No name, Press OK and enter a name");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }
    }
}
