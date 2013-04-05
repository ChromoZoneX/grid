package com.hades.grid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SelectLevelActivity extends Activity{
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_level);
		
		Button back = (Button) findViewById(R.id.backButton);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finishActivity();
			}
		});
		
		ListView lv = (ListView) findViewById(R.id.levelList);
		ArrayList<String> levelList = new ArrayList<String>(); 
		levelList.add("One   (5 X 5)");
		levelList.add("Two   (6 X 6)");
		levelList.add("Three (7 X 4)");
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, levelList);
		lv.setAdapter(arrayAdapter);
	}
	
	private void finishActivity(){
		setResult(RESULT_OK);
		super.finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}

}