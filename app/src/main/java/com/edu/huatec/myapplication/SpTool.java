package com.edu.huatec.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class SpTool {
 private final static String SPNAME="my_sp" ;
    public static void putString(String key, String value){
        SharedPreferences my_sp =MyApp.getContext().getSharedPreferences(SPNAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=my_sp.edit();
        edit.putString(key,value);
        edit.apply();
    }

    public static String getString(String key, String deValue){
        SharedPreferences my_sp =getSharedPreferences();
       return my_sp.getString(key,deValue);
    }

    public static void putLong(String key,long value){
        SharedPreferences.Editor edit=getEdit();
        edit.putLong(key,value);
        edit.apply();

    }
    public static Long getLong(String key,long deValue){
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getLong(key,deValue);
    }
    public static void putBoolean(String key,boolean value){
        SharedPreferences.Editor edit=getEdit();
        edit.putBoolean(key,value);
        edit.apply();
    }
    public static Boolean getBoolean(String key,boolean deValue){
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getBoolean(key,deValue);
    }
    public static void putFloat(String key,float value){
        SharedPreferences.Editor edit=getEdit();
        edit.putFloat(key,value);
        edit.apply();
    }
    public static Float getFloat(String key,float deValue){
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getFloat(key,deValue);
    }
    public static void putInt(String key,int value){
        SharedPreferences.Editor edit=getEdit();
        edit.putInt(key,value);
        edit.apply();
    }
    public static Integer getInt(String key,int deValue){
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences.getInt(key,deValue);
    }

    public static SharedPreferences getSharedPreferences(){
        SharedPreferences my_sp =MyApp.getContext().getSharedPreferences(SPNAME,Context.MODE_PRIVATE);
        return my_sp;
    }



    public static SharedPreferences.Editor getEdit(){
        SharedPreferences my_sp =getSharedPreferences();
        SharedPreferences.Editor edit=my_sp.edit();
        return edit;
    }
}
