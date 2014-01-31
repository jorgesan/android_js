package com.newteam.taskdown;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;

public class TaskActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task);
		//Creamos el adaptador del menu
		String[] arrayString = new String[2];
		arrayString[0] = "HOLA1";
		arrayString[1] = "HOLA2";
       setListAdapter(new ArrayAdapter<String>(this,
                R.layout.item_list_tasks,
                arrayString));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.task, menu);
	    return super.onCreateOptionsMenu(menu);
	}

}
