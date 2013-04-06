package com.hades.grid;

import android.app.Activity;
import android.graphics.drawable.Drawable;

public class ButtonIcon extends Activity{
	
	public static int[] l = {
		//Load sprite
		R.drawable.load0,
		R.drawable.load1,
		R.drawable.load2,
		R.drawable.load3
	};
	
	public static int[] p = {
		//Power sprite
		R.drawable.power0,
		R.drawable.power1,
		R.drawable.power2,
		R.drawable.power3,
		R.drawable.power4,
		R.drawable.power5
	};
	
	public static int[] r = {
		//Right angled wire sprite
		R.drawable.right0,
		R.drawable.right1,
		R.drawable.right2,
		R.drawable.right3
	};
	
	public static int[] s = {
		//Straight wire sprite
		R.drawable.straight0,
		R.drawable.straight1
	};
	
	public static int[] t = {
		//T-shaped wire sprite
		R.drawable.t0,
		R.drawable.t1,
		R.drawable.t2,
		R.drawable.t3
	};
	
	//Bitmap versions of the images
//	Bitmap[] bL = {
//			BitmapDrawable(getResources().getDrawable(R.drawable.load0)).getBitmap(),
//			
//	};
	
	public int changeIconId(Drawable object){
		if (object.equals(getResources().getDrawable(R.drawable.load0))){
			return R.drawable.load1;
		}
		else return R.drawable.straight0;
	}
}
