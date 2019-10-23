package com.e.swapselfie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imgView;
    private static Button buttonSwap;

    private int imgIndex;
    // int firstImage = R.drawable.fist_year;
    // int secondImage = R.drawable.final_year;

    int[] imageArray = {R.drawable.fist_year, R.drawable.final_year};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swapOnclick();
    }

    public void swapOnclick(){
        // if instead of button click choose to click on the image, then: imgView.setOnClickListener()
        imgView = (ImageView) findViewById(R.id.imageView);
        buttonSwap = (Button) findViewById(R.id.btnSwap);

        imgView.setTag(1);
        buttonSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imgView.getTag().equals(1)){
                    imgView.setImageResource(R.drawable.fist_year);
                    imgView.setTag(2);
                }else {
                    imgView.setImageResource(R.drawable.final_year);
                    imgView.setTag(1);
                }
            }
        });

        /*
        imgView = (ImageView) findViewById(R.id.imageView);
        buttonSwap = (Button) findViewById(R.id.button);
        buttonSwap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
             imgIndex++;
             imgIndex = imgIndex % imageArray.length;
             imgView.setImageDrawable(imageArray[imgIndex]);
            }
        });

         */
    }
}
// myImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.yourimageidhere)