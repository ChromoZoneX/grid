package com.hades.grid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Level1 extends Activity {

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_1);
		
		final ImageButton[][] gridButton = new ImageButton[5][5];
		
		/*****************Populating the  grid*********************************/
		//First row
		gridButton[0][0] = (ImageButton) findViewById(R.id.imageButton1);
		gridButton[0][1] = (ImageButton) findViewById(R.id.ImageButton01);
		gridButton[0][2] = (ImageButton) findViewById(R.id.ImageButton24);
		gridButton[0][3] = (ImageButton) findViewById(R.id.ImageButton23);
		gridButton[0][4] = (ImageButton) findViewById(R.id.ImageButton22);
		
		gridButton[0][0].setImageResource(ButtonIcon.l[0]);
		gridButton[0][1].setImageResource(ButtonIcon.r[3]);
		gridButton[0][2].setImageResource(ButtonIcon.s[1]);
		gridButton[0][3].setImageResource(ButtonIcon.l[0]);
		gridButton[0][4].setImageResource(ButtonIcon.l[0]);
		
		//Second row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton21);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton17);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton13);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton11);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton10);
		
		gridButton[1][0].setImageResource(ButtonIcon.s[1]);
		gridButton[1][1].setImageResource(ButtonIcon.s[0]);
		gridButton[1][2].setImageResource(ButtonIcon.r[3]);
		gridButton[1][3].setImageResource(ButtonIcon.l[1]);
		gridButton[1][4].setImageResource(ButtonIcon.s[1]);
		
		//Third row
		gridButton[2][0] = (ImageButton) findViewById(R.id.ImageButton20);
		gridButton[2][1] = (ImageButton) findViewById(R.id.ImageButton16);
		gridButton[2][2] = (ImageButton) findViewById(R.id.ImageButton12);
		gridButton[2][3] = (ImageButton) findViewById(R.id.ImageButton09);
		gridButton[2][4] = (ImageButton) findViewById(R.id.ImageButton08);
		
		gridButton[2][0].setImageResource(ButtonIcon.t[2]);
		gridButton[2][1].setImageResource(ButtonIcon.r[0]);
		gridButton[2][2].setImageResource(ButtonIcon.s[0]);
		gridButton[2][3].setImageResource(ButtonIcon.r[2]);
		gridButton[2][4].setImageResource(ButtonIcon.t[1]);
		
		//Fourth row
		gridButton[3][0] = (ImageButton) findViewById(R.id.ImageButton19);
		gridButton[3][1] = (ImageButton) findViewById(R.id.ImageButton15);
		gridButton[3][2] = (ImageButton) findViewById(R.id.ImageButton07);
		gridButton[3][3] = (ImageButton) findViewById(R.id.ImageButton05);
		gridButton[3][4] = (ImageButton) findViewById(R.id.ImageButton03);
		
		gridButton[3][0].setImageResource(ButtonIcon.t[3]);
		gridButton[3][1].setImageResource(ButtonIcon.l[1]);
		gridButton[3][2].setImageResource(ButtonIcon.s[1]);
		gridButton[3][3].setImageResource(ButtonIcon.s[0]);
		gridButton[3][4].setImageResource(ButtonIcon.s[1]);
		
		//Fifth row
		gridButton[4][0] = (ImageButton) findViewById(R.id.ImageButton18);
		gridButton[4][1] = (ImageButton) findViewById(R.id.ImageButton14);
		gridButton[4][2] = (ImageButton) findViewById(R.id.ImageButton06);
		gridButton[4][3] = (ImageButton) findViewById(R.id.ImageButton04);
		gridButton[4][4] = (ImageButton) findViewById(R.id.ImageButton02);
		
		gridButton[4][0].setImageResource(ButtonIcon.r[2]);
		gridButton[4][1].setImageResource(ButtonIcon.p[5]);
		gridButton[4][2].setImageResource(ButtonIcon.t[2]);
		gridButton[4][3].setImageResource(ButtonIcon.r[0]);
		gridButton[4][4].setImageResource(ButtonIcon.l[1]);
		/**********************************************************************/
		
		gridButton[0][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ButtonIcon.changeIcon(gridButton[0][0].getDrawableState());
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}
}
