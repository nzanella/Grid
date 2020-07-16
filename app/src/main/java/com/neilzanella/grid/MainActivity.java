package com.neilzanella.grid;

import android.app.*;
import android.os.*;
import com.neilzanella.grid.*;

public class MainActivity extends Activity
 {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PixelGridView pixelGrid = new PixelGridView(this);
        pixelGrid.setNumColumns(4);
        pixelGrid.setNumRows(6);

        setContentView(pixelGrid);
    }
}
