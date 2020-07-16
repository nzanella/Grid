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
		parent.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		parent.setOrientation(LinearLayout.VERTICAL);
   
		pixelGrid = new PixelGridView(this);
        pixelGrid.setNumColumns(4);
        pixelGrid.setNumRows(6);

		LinearLayout buttonsLayout = new LinearLayout(this);

		buttonsLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
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
		
		parent.addView(buttonsLayout);
		parent.addView(pixelGrid);
		
		//parent.addView(pixelGrid);
		//parent.addView(buttonsLayout);
		
        setContentView(parent);
    }
}
