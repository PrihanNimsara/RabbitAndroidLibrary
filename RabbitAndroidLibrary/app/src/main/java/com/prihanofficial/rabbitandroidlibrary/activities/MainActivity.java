package com.prihanofficial.rabbitandroidlibrary.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ImageView;

import com.prihanofficial.rabbit.logics.Rabbit;
import com.prihanofficial.rabbitandroidlibrary.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.iv_imageView);
        System.out.println(SystemClock.currentThreadTimeMillis());
        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.images);
        System.out.println(SystemClock.currentThreadTimeMillis());

        Rabbit.setContext(this)
                .setBitMap(bitmap1)
                .setScale(1.1f)
                .setRaius(24.0f)
                .setConstarst(0.0f)
                .setBrightnes(1.0f)
                .build();

        Rabbit.getModifiedRabbitBitmap();
        imageView.setImageBitmap(Rabbit.getModifiedRabbitBitmap());
    }
}
