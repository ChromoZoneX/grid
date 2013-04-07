package com.hades.grid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Level3 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_3);
		
		Button back = (Button) findViewById(R.id.backlevel3);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Activityfinish();
			}
		});
		
		final ImageButton[][] gridButton = new ImageButton[7][7];
		
		/*****************Populating the  grid*********************************/
		//First row
		gridButton[0][0] = (ImageButton) findViewById(R.id.imageButton1);
		gridButton[0][1] = (ImageButton) findViewById(R.id.ImageButton01);
		gridButton[0][2] = (ImageButton) findViewById(R.id.ImageButton24);
		gridButton[0][3] = (ImageButton) findViewById(R.id.ImageButton23);
		gridButton[0][4] = (ImageButton) findViewById(R.id.ImageButton22);
		gridButton[0][5] = (ImageButton) findViewById(R.id.ImageButton25);
		gridButton[0][6] = (ImageButton) findViewById(R.id.ImageButton42);
		
		
		gridButton[0][0].setImageResource(ButtonIcon.r7[0]);
		gridButton[0][1].setImageResource(ButtonIcon.s7[0]);
		gridButton[0][2].setImageResource(ButtonIcon.s7[1]);
		gridButton[0][3].setImageResource(ButtonIcon.s7[0]);
		gridButton[0][4].setImageResource(ButtonIcon.r7[2]);
		gridButton[0][5].setImageResource(ButtonIcon.r7[2]);
		gridButton[0][6].setImageResource(ButtonIcon.r7[2]);
		
		//Second row
		gridButton[1][0] = (ImageButton) findViewById(R.id.ImageButton21);
		gridButton[1][1] = (ImageButton) findViewById(R.id.ImageButton17);
		gridButton[1][2] = (ImageButton) findViewById(R.id.ImageButton13);
		gridButton[1][3] = (ImageButton) findViewById(R.id.ImageButton11);
		gridButton[1][4] = (ImageButton) findViewById(R.id.ImageButton10);
		gridButton[1][5] = (ImageButton) findViewById(R.id.ImageButton29);
		gridButton[1][6] = (ImageButton) findViewById(R.id.ImageButton41);
		
		gridButton[1][0].setImageResource(ButtonIcon.s7[0]);
		gridButton[1][1].setImageResource(ButtonIcon.r7[0]);
		gridButton[1][2].setImageResource(ButtonIcon.l7[2]);
		gridButton[1][3].setImageResource(ButtonIcon.r7[0]);
		gridButton[1][4].setImageResource(ButtonIcon.t7[3]);
		gridButton[1][5].setImageResource(ButtonIcon.s7[1]);
		gridButton[1][6].setImageResource(ButtonIcon.l7[3]);
		
		//Third row
		gridButton[2][0] = (ImageButton) findViewById(R.id.ImageButton20);
		gridButton[2][1] = (ImageButton) findViewById(R.id.ImageButton16);
		gridButton[2][2] = (ImageButton) findViewById(R.id.ImageButton12);
		gridButton[2][3] = (ImageButton) findViewById(R.id.ImageButton09);
		gridButton[2][4] = (ImageButton) findViewById(R.id.ImageButton08);
		gridButton[2][5] = (ImageButton) findViewById(R.id.ImageButton28);
		gridButton[2][6] = (ImageButton) findViewById(R.id.ImageButton40);
		
		gridButton[2][0].setImageResource(ButtonIcon.r7[1]);
		gridButton[2][1].setImageResource(ButtonIcon.t7[0]);
		gridButton[2][2].setImageResource(ButtonIcon.r7[3]);
		gridButton[2][3].setImageResource(ButtonIcon.r7[0]);
		gridButton[2][4].setImageResource(ButtonIcon.s7[0]);
		gridButton[2][5].setImageResource(ButtonIcon.r7[2]);
		gridButton[2][6].setImageResource(ButtonIcon.r7[3]);
		
		//Fourth row
		gridButton[3][0] = (ImageButton) findViewById(R.id.ImageButton19);
		gridButton[3][1] = (ImageButton) findViewById(R.id.ImageButton15);
		gridButton[3][2] = (ImageButton) findViewById(R.id.ImageButton07);
		gridButton[3][3] = (ImageButton) findViewById(R.id.ImageButton05);
		gridButton[3][4] = (ImageButton) findViewById(R.id.ImageButton03);
		gridButton[3][5] = (ImageButton) findViewById(R.id.ImageButton27);
		gridButton[3][6] = (ImageButton) findViewById(R.id.ImageButton39);
		
		gridButton[3][0].setImageResource(ButtonIcon.l7[1]);
		gridButton[3][1].setImageResource(ButtonIcon.s7[1]);
		gridButton[3][2].setImageResource(ButtonIcon.s7[0]);
		gridButton[3][3].setImageResource(ButtonIcon.p7[0]);
		gridButton[3][4].setImageResource(ButtonIcon.t7[3]);
		gridButton[3][5].setImageResource(ButtonIcon.t7[1]);
		gridButton[3][6].setImageResource(ButtonIcon.r7[3]);
		
		//Fifth row
		gridButton[4][0] = (ImageButton) findViewById(R.id.ImageButton18);
		gridButton[4][1] = (ImageButton) findViewById(R.id.ImageButton14);
		gridButton[4][2] = (ImageButton) findViewById(R.id.ImageButton06);
		gridButton[4][3] = (ImageButton) findViewById(R.id.ImageButton04);
		gridButton[4][4] = (ImageButton) findViewById(R.id.ImageButton02);
		gridButton[4][5] = (ImageButton) findViewById(R.id.ImageButton26);
		gridButton[4][6] = (ImageButton) findViewById(R.id.ImageButton38);
		
		gridButton[4][0].setImageResource(ButtonIcon.r7[0]);
		gridButton[4][1].setImageResource(ButtonIcon.t7[3]);
		gridButton[4][2].setImageResource(ButtonIcon.l7[0]);
		gridButton[4][3].setImageResource(ButtonIcon.l7[0]);
		gridButton[4][4].setImageResource(ButtonIcon.t7[2]);
		gridButton[4][5].setImageResource(ButtonIcon.t7[2]);
		gridButton[4][6].setImageResource(ButtonIcon.r7[3]);
		
		gridButton[5][0] = (ImageButton) findViewById(R.id.ImageButton35);
		gridButton[5][1] = (ImageButton) findViewById(R.id.ImageButton34);
		gridButton[5][2] = (ImageButton) findViewById(R.id.ImageButton33);
		gridButton[5][3] = (ImageButton) findViewById(R.id.ImageButton32);
		gridButton[5][4] = (ImageButton) findViewById(R.id.ImageButton31);
		gridButton[5][5] = (ImageButton) findViewById(R.id.ImageButton30);
		gridButton[5][6] = (ImageButton) findViewById(R.id.ImageButton37);
		
		gridButton[5][0].setImageResource(ButtonIcon.r7[0]);
		gridButton[5][1].setImageResource(ButtonIcon.r7[3]);
		gridButton[5][2].setImageResource(ButtonIcon.l7[0]);
		gridButton[5][3].setImageResource(ButtonIcon.l7[0]);
		gridButton[5][4].setImageResource(ButtonIcon.t7[2]);
		gridButton[5][5].setImageResource(ButtonIcon.l7[1]);
		gridButton[5][6].setImageResource(ButtonIcon.s7[0]);
		
		gridButton[6][0] = (ImageButton) findViewById(R.id.ImageButton48);
		gridButton[6][1] = (ImageButton) findViewById(R.id.ImageButton47);
		gridButton[6][2] = (ImageButton) findViewById(R.id.ImageButton46);
		gridButton[6][3] = (ImageButton) findViewById(R.id.ImageButton45);
		gridButton[6][4] = (ImageButton) findViewById(R.id.ImageButton44);
		gridButton[6][5] = (ImageButton) findViewById(R.id.ImageButton43);
		gridButton[6][6] = (ImageButton) findViewById(R.id.ImageButton36);
		
		gridButton[6][0].setImageResource(ButtonIcon.r7[0]);
		gridButton[6][1].setImageResource(ButtonIcon.s7[0]);
		gridButton[6][2].setImageResource(ButtonIcon.t7[0]);
		gridButton[6][3].setImageResource(ButtonIcon.r7[0]);
		gridButton[6][4].setImageResource(ButtonIcon.r7[0]);
		gridButton[6][5].setImageResource(ButtonIcon.l7[0]);
		gridButton[6][6].setImageResource(ButtonIcon.l7[0]);
		
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
		
		gridButton[0][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][5].getDrawable());
				gridButton[0][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[0][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[0][6].getDrawable());
				gridButton[0][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
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
		
		gridButton[1][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][5].getDrawable());
				gridButton[1][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[1][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[1][6].getDrawable());
				gridButton[1][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
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
		
		gridButton[2][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][5].getDrawable());
				gridButton[2][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[2][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[2][6].getDrawable());
				gridButton[2][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
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
		
		gridButton[3][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][5].getDrawable());
				gridButton[3][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[3][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[3][6].getDrawable());
				gridButton[3][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
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
		
		gridButton[4][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][5].getDrawable());
				gridButton[4][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[4][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[4][6].getDrawable());
				gridButton[4][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][0].setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][0].getDrawable());
				gridButton[5][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][1].getDrawable());
				gridButton[5][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][2].getDrawable());
				gridButton[5][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][3].getDrawable());
				gridButton[5][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][4].getDrawable());
				gridButton[5][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][5].getDrawable());
				gridButton[5][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[5][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[5][6].getDrawable());
				gridButton[5][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][0].getDrawable());
				gridButton[6][0].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][1].setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						int newId = changeIconId(gridButton[6][1].getDrawable());
						gridButton[6][1].setImageResource(newId); levelComplete(checkGrid(gridButton));
					}
				});
		
		gridButton[6][2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][2].getDrawable());
				gridButton[6][2].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][3].getDrawable());
				gridButton[6][3].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][4].getDrawable());
				gridButton[6][4].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][5].getDrawable());
				gridButton[6][5].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
		
		gridButton[6][6].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int newId = changeIconId(gridButton[6][6].getDrawable());
				gridButton[6][6].setImageResource(newId); levelComplete(checkGrid(gridButton));
			}
		});
	}
	
	private int changeIconId(Drawable drawable){
		Bitmap object = ((BitmapDrawable) drawable).getBitmap();
		if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load07)).getBitmap()){
			return R.drawable.load17;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load17)).getBitmap()){
			return R.drawable.load27;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load27)).getBitmap()){
			return R.drawable.load37;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.load37)).getBitmap()){
			return R.drawable.load07;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power07)).getBitmap()){
			return R.drawable.power17;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power17)).getBitmap()){
			return R.drawable.power27;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power27)).getBitmap()){
			return R.drawable.power37;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.power37)).getBitmap()){
			return R.drawable.power07;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.straight07)).getBitmap()){
			return R.drawable.straight17;
		}	
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return R.drawable.straight07;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t07)).getBitmap()){
			return R.drawable.t17;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t17)).getBitmap()){
			return R.drawable.t27;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t27)).getBitmap()){
			return R.drawable.t37;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.t37)).getBitmap()){
			return R.drawable.t07;
		}
		
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return R.drawable.right17;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return R.drawable.right27;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right27)).getBitmap()){
			return R.drawable.right37;
		}
		else if (object == ((BitmapDrawable) getResources().getDrawable(R.drawable.right37)).getBitmap()){
			return R.drawable.right07;
		}
		else return -1;
		
	}
	
	private boolean checkGrid(ImageButton[][] gridButton){
		if (((BitmapDrawable) gridButton[0][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[0][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right27)).getBitmap()){
			return false;
		}
		//second row
		if (((BitmapDrawable) gridButton[1][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[1][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load37)).getBitmap()){
			return false;
		}
		//third row
		if (((BitmapDrawable) gridButton[2][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[2][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right27)).getBitmap()){
			return false;
		}
		//fourth row
		if (((BitmapDrawable) gridButton[3][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.power07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[3][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right37)).getBitmap()){
			return false;
		}
		//fifth row
		if (((BitmapDrawable) gridButton[4][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[4][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right27)).getBitmap()){
			return false;
		}
		
		//sixth row
		if (((BitmapDrawable) gridButton[5][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load17)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[5][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight17)).getBitmap()){
			return false;
		}
		
		//seventh row
		if (((BitmapDrawable) gridButton[6][0].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][1].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.straight07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][2].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.t37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][3].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right37)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][4].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.right07)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][5].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load27)).getBitmap()){
			return false;
		}
		if (((BitmapDrawable) gridButton[6][6].getDrawable()).getBitmap() != ((BitmapDrawable) getResources().getDrawable(R.drawable.load37)).getBitmap()){
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
