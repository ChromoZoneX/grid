package com.hades.grid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Level1 extends Activity {
	
	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_1);
		
		Button back = (Button) findViewById(R.id.backLevel1);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Activityfinish();
			}
		});
		
		final ImageButton[][] gridButton = new ImageButton[5][5];
		
		/*****************Populating the  grid*********************************/
		//First row
		gridButton[0][0] = (ImageButton) findViewById(R.id.imageButton1);
		gridButton[0][1] = (ImageButton) findViewById(R.id.ImageButton01);
		gridButton[0][2] = (ImageButton) findViewById(R.id.ImageButton24);
		gridButton[0][3] = (ImageButton) findViewById(R.id.ImageButton23);
		gridButton[0][4] = (ImageButton) findViewById(R.id.ImageButton22);
		
		gridButton[0][0].setImageResource(ButtonIcon.l[2]);
		gridButton[0][1].setImageResource(ButtonIcon.s[1]);
		gridButton[0][2].setImageResource(ButtonIcon.t[3]);
		gridButton[0][3].setImageResource(ButtonIcon.s[1]);
		gridButton[0][4].setImageResource(ButtonIcon.r[3]);
		
		//Second row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton21);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton17);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton13);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton11);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton10);
		
		gridButton[1][0].setImageResource(ButtonIcon.l[1]);
		gridButton[1][1].setImageResource(ButtonIcon.s[1]);
		gridButton[1][2].setImageResource(ButtonIcon.t[3]);
		gridButton[1][3].setImageResource(ButtonIcon.p[1]);
		gridButton[1][4].setImageResource(ButtonIcon.r[2]);
		
		//Third row
		gridButton[2][0] = (ImageButton) findViewById(R.id.ImageButton20);
		gridButton[2][1] = (ImageButton) findViewById(R.id.ImageButton16);
		gridButton[2][2] = (ImageButton) findViewById(R.id.ImageButton12);
		gridButton[2][3] = (ImageButton) findViewById(R.id.ImageButton09);
		gridButton[2][4] = (ImageButton) findViewById(R.id.ImageButton08);
		
		gridButton[2][0].setImageResource(ButtonIcon.r[3]);
		gridButton[2][1].setImageResource(ButtonIcon.s[1]);
		gridButton[2][2].setImageResource(ButtonIcon.t[2]);
		gridButton[2][3].setImageResource(ButtonIcon.s[1]);
		gridButton[2][4].setImageResource(ButtonIcon.r[3]);
		
		//Fourth row
		gridButton[3][0] = (ImageButton) findViewById(R.id.ImageButton19);
		gridButton[3][1] = (ImageButton) findViewById(R.id.ImageButton15);
		gridButton[3][2] = (ImageButton) findViewById(R.id.ImageButton07);
		gridButton[3][3] = (ImageButton) findViewById(R.id.ImageButton05);
		gridButton[3][4] = (ImageButton) findViewById(R.id.ImageButton03);
		
		gridButton[3][0].setImageResource(ButtonIcon.r[1]);
		gridButton[3][1].setImageResource(ButtonIcon.r[3]);
		gridButton[3][2].setImageResource(ButtonIcon.r[2]);
		gridButton[3][3].setImageResource(ButtonIcon.s[1]);
		gridButton[3][4].setImageResource(ButtonIcon.r[2]);
		
		//Fifth row
		gridButton[4][0] = (ImageButton) findViewById(R.id.ImageButton18);
		gridButton[4][1] = (ImageButton) findViewById(R.id.ImageButton14);
		gridButton[4][2] = (ImageButton) findViewById(R.id.ImageButton06);
		gridButton[4][3] = (ImageButton) findViewById(R.id.ImageButton04);
		gridButton[4][4] = (ImageButton) findViewById(R.id.ImageButton02);
		
		gridButton[4][0].setImageResource(ButtonIcon.l[1]);
		gridButton[4][1].setImageResource(ButtonIcon.r[2]);
		gridButton[4][2].setImageResource(ButtonIcon.r[3]);
		gridButton[4][3].setImageResource(ButtonIcon.s[1]);
		gridButton[4][4].setImageResource(ButtonIcon.l[2]);
		/**********************************************************************/
		
		gridButton[0][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][0].getDrawable());
				gridButton[0][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[0][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][1].getDrawable());
				gridButton[0][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[0][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][2].getDrawable());
				gridButton[0][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[0][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][3].getDrawable());
				gridButton[0][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[0][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][4].getDrawable());
				gridButton[0][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][0].getDrawable());
				gridButton[1][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][1].getDrawable());
				gridButton[1][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][2].getDrawable());
				gridButton[1][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][3].getDrawable());
				gridButton[1][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][4].getDrawable());
				gridButton[1][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][0].getDrawable());
				gridButton[2][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][1].getDrawable());
				gridButton[2][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][2].getDrawable());
				gridButton[2][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][3].getDrawable());
				gridButton[2][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][4].getDrawable());
				gridButton[2][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][0].getDrawable());
				gridButton[3][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][1].getDrawable());
				gridButton[3][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][2].getDrawable());
				gridButton[3][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][3].getDrawable());
				gridButton[3][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][4].getDrawable());
				gridButton[3][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][0].getDrawable());
				gridButton[4][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][1].getDrawable());
				gridButton[4][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][2].getDrawable());
				gridButton[4][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][3].getDrawable());
				gridButton[4][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][4].getDrawable());
				gridButton[4][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		
		
	}
	
	private int changeIconId(Drawable drawable){
		Bitmap object = ((BitmapDrawable) drawable).getBitmap();
		if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load0)).getBitmap()){
			return R.drawable.load1;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load1)).getBitmap()){
			return R.drawable.load2;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load2)).getBitmap()){
			return R.drawable.load3;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load3)).getBitmap()){
			return R.drawable.load0;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power0)).getBitmap()){
			return R.drawable.power1;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power1)).getBitmap()){
			return R.drawable.power2;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power2)).getBitmap()){
			return R.drawable.power3;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power3)).getBitmap()){
			return R.drawable.power0;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return R.drawable.straight1;
		}	
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.straight1)).getBitmap()){
			return R.drawable.straight0;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t0)).getBitmap()){
			return R.drawable.t1;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t1)).getBitmap()){
			return R.drawable.t2;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t2)).getBitmap()){
			return R.drawable.t3;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t3)).getBitmap()){
			return R.drawable.t0;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right0)).getBitmap()){
			return R.drawable.right1;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right1)).getBitmap()){
			return R.drawable.right2;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right2)).getBitmap()){
			return R.drawable.right3;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right3)).getBitmap()){
			return R.drawable.right0;
		}
		else return -1;
		
	}
	
	private boolean checkGrid(ImageButton[][] gridButton){
		if (((BitmapDrawable) gridButton[0][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t1)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right2)).getBitmap()){
			return false;
		}
		//second row
		if (((BitmapDrawable) gridButton[1][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t2)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.power0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right3)).getBitmap()){
			return false;
		}
		//third row
		if (((BitmapDrawable) gridButton[2][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right1)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t3)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right2)).getBitmap()){
			return false;
		}
		//fourth row
		if (((BitmapDrawable) gridButton[3][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right2)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right1)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right3)).getBitmap()){
			return false;
		}
		//fifth row
		if (((BitmapDrawable) gridButton[4][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right3)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight0)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load2)).getBitmap()){
			return false;
		}
		return true;
		
	}
	
	private void levelComplete(boolean decision){
		if (decision){
			displayToast("You have completed this level! Please press back to choose another.");
		}
	}
	
	private void displayToast(String s){
		Toast toast = Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
		toast.show();
	}
	
	private void Activityfinish(){
		super.finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}
}
