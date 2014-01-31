package com.newteam.taskdown;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	} 
  
	public void onClickValidateUser(View v) {
        TextView usuario = (TextView)findViewById(R.id.txtEmail);
        TextView password = (TextView)findViewById(R.id.txtPass);
        if(validateUser(usuario.getText().toString(),password.getText().toString()))	{
        	AlertDialog errorDialog = new AlertDialog.Builder(this).create();
            errorDialog.setMessage("Usuario Correcto");
            errorDialog.show();
        }
        else	{
        	AlertDialog errorDialog = new AlertDialog.Builder(this).create();
            errorDialog.setMessage(this.getString(R.string.login_error));
            errorDialog.show();	
        }
	}
	private boolean validateUser(String username,String password)	{
		if(username.equals("1") && password.equals("1"))	{
			return true;
		}
		else{
			return false;
		}
	}
	
	
} 
  