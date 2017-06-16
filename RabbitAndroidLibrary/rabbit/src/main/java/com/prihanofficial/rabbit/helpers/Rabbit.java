package com.prihanofficial.rabbit.helpers;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

import com.prihanofficial.rabbit.library.BitmapModifier;
import com.prihanofficial.rabbit.library.BitmapNullEmptyChecker;
import com.prihanofficial.rabbit.library.FloatNullEmptyChecker;

/**
 * Created by Prihan Nimsara on 6/14/2017.
 **/

public class Rabbit {

    //region Variables Declare
    private static Rabbit rabbit;
    private static Context rabbitContext;
    private static Bitmap rabbitBitmap;
    private static float rabbitScale;
    private static  float rabbitRadius;
    private static float rabbitContrast;
    private static float rabbitBrightness;
    private static Bitmap modifiedRabbitBitmap;
    //endregion

    //region Main configuration code
    public static Rabbit setContext(Context context){
        rabbitContext = context.getApplicationContext();
        if(rabbit == null){
            rabbit = new Rabbit();
        }
        return rabbit;
    }

    public static Rabbit setBitMap(Bitmap bitMap){
        rabbitBitmap = bitMap;
        return rabbit;
    }

    public static Rabbit setScale(float scale){
        rabbitScale = scale;
        return rabbit;
    }
    public static Rabbit setRaius(float radius){
        rabbitRadius = radius;
        return  rabbit;
    }
    public static Rabbit setBrightnes(float contrast){
        rabbitContrast = contrast;
        return  rabbit;
    }
    public static Rabbit setConstarst(float brightnes){
        rabbitBrightness = brightnes;
        return  rabbit;
    }

    public static void build(){
        if(rabbitContext == null){
            throw new RuntimeException("Please set a context.");
        }
        if(BitmapNullEmptyChecker.checkBitmapNullOrEmpty(rabbitBitmap)){
            throw new RuntimeException("Please set a context.");
        }
        if(FloatNullEmptyChecker.floatNullOrEmpty(rabbitScale)){
            throw new RuntimeException("Please set a Scale.");
        }
        if(FloatNullEmptyChecker.floatNullOrEmpty(rabbitRadius)){
            throw new RuntimeException("Please set a Radius.");
        }
        if(FloatNullEmptyChecker.floatNullOrEmpty(rabbitContrast)){
            throw new RuntimeException("Please set a Contrast.");
        }
        if(FloatNullEmptyChecker.floatNullOrEmpty(rabbitBrightness)){
            throw new RuntimeException("Please set a Brightness.");
        }
    }
    //endregion

    //region main get method
    public static Bitmap getModifiedRabbitBitmap(){
        modifiedRabbitBitmap = BitmapModifier.modifyBitmap(rabbitContext,rabbitBitmap,rabbitScale,rabbitRadius,rabbitContrast,rabbitBrightness);
        return  modifiedRabbitBitmap;
    }
    //endregion
}
