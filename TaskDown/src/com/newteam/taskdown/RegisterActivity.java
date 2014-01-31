package com.newteam.taskdown;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onClickRegisterUser(View view)	{
        TextView userName = (TextView)findViewById(R.id.txtUserName);
        TextView email = (TextView)findViewById(R.id.txtEmail);
        TextView password = (TextView)findViewById(R.id.txtPass);
		boolean registerUser = registerUser(userName.getText().toString(), password.getText().toString(), email.getText().toString());

		
	}

	private boolean registerUser(String name, String passwd, String email) {
		if(name.equals("1") && passwd.equals("1") && email.equals("1"))	{
        	AlertDialog errorDialog = new AlertDialog.Builder(this).create();
            errorDialog.setMessage(this.getString(R.string.register_error));
            errorDialog.show();	
			return false;
		}
		else{
			return true;
		}
	}
}
