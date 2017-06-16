package com.prihanofficial.rabbit.helpers;


/**
 * Created by Prihan Nimsara on 6/14/2017.
 **/

public class FloatNullEmptyChecker {
    public static boolean floatNullOrEmpty(float floatValue){
       String floatStringValue = Float.toString(floatValue);
        if(floatStringValue == null || floatStringValue.equals("")){
            return true;
        }
        else {
            return false;
        }
    }
}
