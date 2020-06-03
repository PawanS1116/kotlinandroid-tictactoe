package com.example.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class func {
    public static void main(){}
    public static String changepl( String pl){
        if(pl=="X")
            pl="O";
                    else
            pl="X";
                    return pl;
    }
    public static void hide(Context context, View view){
        InputMethodManager i=(InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        i.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
