package com.example.homework2_rbg_draketermors;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // setting up variables
    Button btn_j_save;
    SeekBar sb_j_red;
    SeekBar sb_j_green;
    SeekBar sb_j_blue;
    ListView lv_j_colorlist;
    TextView tv_j_red;
    TextView tv_j_green;
    TextView tv_j_blue;
    TextView tv_j_hex;
    ConstraintLayout main_2;
    ArrayList<ColorInfo> listOfColors;
    int red=255,green=255,blue=255;
    String Hred;
    String Hgreen;
    String Hblue;
    //String hex = String.format("%02x%02x%02x", red, green, blue);
    String hex;
    ColorListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //declaring items
        btn_j_save = findViewById(R.id.btn_v_save);
        sb_j_red = findViewById(R.id.sb_v_red);
        sb_j_green = findViewById(R.id.sb_v_green);
        sb_j_blue = findViewById(R.id.sb_v_blue);
        lv_j_colorlist = findViewById(R.id.lv_v_colorlist);
        tv_j_red = findViewById(R.id.tv_v_red_label);
        tv_j_green = findViewById(R.id.tv_v_green_label);
        tv_j_blue = findViewById(R.id.tv_v_blue_label);
        tv_j_hex = findViewById(R.id.tv_v_hr_label);
        main_2 = findViewById(R.id.main);
        //setting background color at start
        tv_j_red.setText("Red:     " + red);
        tv_j_green.setText("Green: " + green);
        tv_j_blue.setText("Blue:    " + blue);
        main_2.setBackgroundColor(Color.rgb(red,green,blue));
        //translating RGB to hex
        Hred = Integer.toHexString(sb_j_red.getProgress());
        Hgreen = Integer.toHexString(sb_j_green.getProgress());
        Hblue = Integer.toHexString(sb_j_blue.getProgress());
        hex =  Hred + Hgreen + Hblue;
        tv_j_hex.setText("Hex Representation:   " + hex.toUpperCase());

        //code for Seek bars and respective activity
        sb_j_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = sb_j_red.getProgress();
                tv_j_red.setText("Red:     " + red);
                main_2.setBackgroundColor(Color.rgb(red,green,blue));
                Hred = Integer.toHexString(sb_j_red.getProgress());
                Hgreen = Integer.toHexString(sb_j_green.getProgress());
                Hblue = Integer.toHexString(sb_j_blue.getProgress());
                hex =  Hred + Hgreen + Hblue;
                tv_j_hex.setText("Hex Representation:   " + hex.toUpperCase());
                if (red < 150 && green < 150 &&blue < 150)
                {
                    tv_j_red.setTextColor(Color.WHITE);
                    tv_j_green.setTextColor(Color.WHITE);
                    tv_j_blue.setTextColor(Color.WHITE);
                    tv_j_hex.setTextColor(Color.WHITE);
                }
                else
                {
                    tv_j_red.setTextColor(Color.BLACK);
                    tv_j_green.setTextColor(Color.BLACK);
                    tv_j_blue.setTextColor(Color.BLACK);
                    tv_j_hex.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        sb_j_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green = sb_j_green.getProgress();
                tv_j_green.setText("Green: " + green);
                main_2.setBackgroundColor(Color.rgb(red,green,blue));
                Hred = Integer.toHexString(sb_j_red.getProgress());
                Hgreen = Integer.toHexString(sb_j_green.getProgress());
                Hblue = Integer.toHexString(sb_j_blue.getProgress());
                hex =  Hred + Hgreen + Hblue;
                tv_j_hex.setText("Hex Representation:   " + hex.toUpperCase());
                if (red < 150 && green < 150 &&blue < 150)
                {
                    tv_j_red.setTextColor(Color.WHITE);
                    tv_j_green.setTextColor(Color.WHITE);
                    tv_j_blue.setTextColor(Color.WHITE);
                    tv_j_hex.setTextColor(Color.WHITE);
                }
                else
                {
                    tv_j_red.setTextColor(Color.BLACK);
                    tv_j_green.setTextColor(Color.BLACK);
                    tv_j_blue.setTextColor(Color.BLACK);
                    tv_j_hex.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        sb_j_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = sb_j_blue.getProgress();
                tv_j_blue.setText("Blue:    " + blue);
                main_2.setBackgroundColor(Color.rgb(red,green,blue));
                Hred = Integer.toHexString(sb_j_red.getProgress());
                Hgreen = Integer.toHexString(sb_j_green.getProgress());
                Hblue = Integer.toHexString(sb_j_blue.getProgress());
                hex =  Hred + Hgreen + Hblue;
                tv_j_hex.setText("Hex Representation:   " + hex.toUpperCase());
                if (red < 150 && green < 150 &&blue < 150)
                {
                    tv_j_red.setTextColor(Color.WHITE);
                    tv_j_green.setTextColor(Color.WHITE);
                    tv_j_blue.setTextColor(Color.WHITE);
                    tv_j_hex.setTextColor(Color.WHITE);
                }
                else
                {
                    tv_j_red.setTextColor(Color.BLACK);
                    tv_j_green.setTextColor(Color.BLACK);
                    tv_j_blue.setTextColor(Color.BLACK);
                    tv_j_hex.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        saveColorButtonListener();

        //Setting up array
        listOfColors = new ArrayList<ColorInfo>();
        fillListView();
    }
    //code for save button
    private void saveColorButtonListener(){
        btn_j_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //test code
                //Log.d("Red:" , red + "");
                //Log.d("Green", green + "");
                //Log.d("Blue", blue + "");
                //end test code
                addColorToList();
                adapter.notifyDataSetChanged();
                sb_j_red.setProgress(255);
                sb_j_green.setProgress(255);
                sb_j_blue.setProgress(255);


            }
        });
    }
    //function for adding colors to the array and list
    private void  addColorToList()
    {
        //creating color object
        ColorInfo colorToAdd = new ColorInfo();

        colorToAdd.setStoreRed(String.valueOf(sb_j_red.getProgress()));
        colorToAdd.setStoreGreen(String.valueOf(sb_j_green.getProgress()));
        colorToAdd.setStoreBlue(String.valueOf(sb_j_blue.getProgress()));
        colorToAdd.setStoreHex(hex.toUpperCase().toString());

        listOfColors.add(colorToAdd);

    }
    //adapter call
    private void fillListView ()
    {
        adapter = new ColorListAdapter(this, listOfColors);
        lv_j_colorlist.setAdapter(adapter);
    }


}