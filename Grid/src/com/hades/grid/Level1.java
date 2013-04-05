package com.hades.grid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;

public class Level1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_1);

		ImageButton[][] gridButton = new ImageButton[5][5];
		//First row
		gridButton[0][0] = (ImageButton) findViewById(R.id.imageButton1);
		gridButton[0][1] = (ImageButton) findViewById(R.id.ImageButton01);
		gridButton[0][2] = (ImageButton) findViewById(R.id.ImageButton24);
		gridButton[0][3] = (ImageButton) findViewById(R.id.ImageButton23);
		gridButton[0][4] = (ImageButton) findViewById(R.id.ImageButton22);
		//Second row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton21);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton17);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton13);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton11);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton10);
		//Third row
		gridButton[2][0] = (ImageButton) findViewById(R.id.ImageButton20);
		gridButton[2][1] = (ImageButton) findViewById(R.id.ImageButton16);
		gridButton[2][2] = (ImageButton) findViewById(R.id.ImageButton12);
		gridButton[2][3] = (ImageButton) findViewById(R.id.ImageButton09);
		gridButton[2][4] = (ImageButton) findViewById(R.id.ImageButton08);
		//Fourth row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton19);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton15);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton07);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton05);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton03);
		//Fifth row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton18);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton14);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton06);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton04);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton02);
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}
}
