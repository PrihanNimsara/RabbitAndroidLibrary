package com.prihanofficial.rabbit.library;


import android.graphics.Bitmap;
import android.util.Base64;

import java.io.ByteArrayOutputStream;

/**
 * Created by Prihan Nimsara on 6/14/2017.
 **/

public class BitmapNullEmptyChecker {
    public static boolean checkBitmapNullOrEmpty(Bitmap bitmapValue){
        ByteArrayOutputStream byteArrayOutputStream=new  ByteArrayOutputStream();
        bitmapValue.compress(Bitmap.CompressFormat.PNG,100, byteArrayOutputStream);
        byte [] byteArray=byteArrayOutputStream.toByteArray();
        String bitmapStringValue= Base64.encodeToString(byteArray, Base64.DEFAULT);
        if(bitmapStringValue == null || bitmapStringValue.equals("")){
            return true;
        }
        else {
            return false;
        }
    }
}
