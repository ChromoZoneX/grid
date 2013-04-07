package com.hades.grid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hades.grid.R.layout;

public class InstructionsActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(layout.activity_instructions);
		
		Button back = (Button) findViewById(R.id.backInstructions);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Activityfinish();
			}
		});
	}
	
	private void Activityfinish(){
		super.finish();
	}
}
