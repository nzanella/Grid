package com.neilzanella.grid;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.neilzanella.grid.*;

public class MainActivity extends Activity
 {
	private PixelGridView pixelGrid;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
   
		super.onCreate(savedInstanceState);
	
		LinearLayout parent = new LinearLayout(this);
		parent.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
		parent.setOrientation(LinearLayout.VERTICAL);
	
		LinearLayout canvasLayout = new LinearLayout(this);
		LinearLayout.LayoutParams canvasLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		canvasLayoutParams.weight = 1.0f;
		canvasLayout.setLayoutParams(canvasLayoutParams);
	    canvasLayout.setOrientation(LinearLayout.HORIZONTAL);
		
		//try placing this in a linear layout
		pixelGrid = new PixelGridView(this);
        pixelGrid.setNumColumns(4);
        pixelGrid.setNumRows(6);

		canvasLayout.addView(pixelGrid);
		
		LinearLayout buttonsLayout = new LinearLayout(this);
		LinearLayout.LayoutParams buttonsLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		//buttonsLayoutParams.weight = 1.0f;
		buttonsLayout.setLayoutParams(buttonsLayoutParams);
	    buttonsLayout.setOrientation(LinearLayout.HORIZONTAL);

		Button lessHButton = new Button(this);
		Button moreHButton = new Button(this);
		Button lessVButton = new Button(this);
		Button moreVButton = new Button(this);
		lessHButton.setText("less H");
		moreHButton.setText("more H");
		lessVButton.setText("less V");
		moreVButton.setText("more V");
		lessHButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				pixelGrid.setNumColumns(pixelGrid.getNumColumns() - 1);
				pixelGrid.invalidate();
			}
		});
		moreHButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				pixelGrid.setNumColumns(pixelGrid.getNumColumns() + 1);
				pixelGrid.invalidate();
			}
		});
		lessVButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				pixelGrid.setNumRows(pixelGrid.getNumRows() - 1);
				pixelGrid.invalidate();
			}
		});
		moreVButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				pixelGrid.setNumRows(pixelGrid.getNumRows() + 1);
				pixelGrid.invalidate();
			}
		});
		
		buttonsLayout.addView(lessHButton);
		buttonsLayout.addView(moreHButton);
		buttonsLayout.addView(lessVButton);
		buttonsLayout.addView(moreVButton);
		
		//parent.addView(buttonsLayout);
		//parent.addView(canvasLayout);
		
		parent.addView(canvasLayout);
		parent.addView(buttonsLayout);
		
        setContentView(parent);
    }
}
