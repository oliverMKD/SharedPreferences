package com.oli.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by oliver on 12/12/2017.
 */

public class PreferencesManager {
//    private static final String ISMALE = "ISMALE";
//    private static final String FIRSTNAME = "firstname";
//    private static final String LASTNAME = "lastname";
//    private static final String AGE = "age";

    private static SharedPreferences getPreferences(Context c){
        return c.getApplicationContext().getSharedPreferences("MySharedPreffsFile", Activity.MODE_PRIVATE);
    }

    public static String getFirstname(Context context){
        return getPreferences(context).getString("firstName","no name");
    }

    public static void setFirstName(Context context,String firstName){
        getPreferences(context).edit().putString("firstName",firstName).apply();
    }
    public static String getLastName(Context context){
        return getPreferences(context).getString("LastName","no name");
    }
    public static void setLastName(Context context,String lastname) {
        getPreferences(context).edit().putString("LastName", lastname).apply();
    }
    public static String getAge(Context context){
        return getPreferences(context).getString("Age","no age");
    }

    public static void setAge(Context context,String age) {
        getPreferences(context).edit().putString("Age", age).apply();
    }
    public static String getSex(Context context){
        return getPreferences(context).getString("Sex","no age");
    }

    public static void setSex(Context context,String sex) {
        getPreferences(context).edit().putString("Sex", sex).apply();
    }
}
