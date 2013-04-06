package com.hades.grid;

public class ButtonIcon{
	
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
	
	public static int changeIconId(int[] id){
		if (id[0] == l[0]){
			return l[1];
		}
		else return -1;
	}
}
