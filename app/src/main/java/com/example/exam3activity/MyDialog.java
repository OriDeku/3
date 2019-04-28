package com.example.exam3activity;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
public class MyDialog extends Dialog {
    private String dialogname;
    public Mydialog(Context context,String dialogname){
        super(context);
        this.dialogname=dialogname;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // LayoutInflater inflater = LayoutInflater.from(this);
        // View layout=inflater.inflate(R.layout.alertdialog111,null);
        // AlertDialog.Builder builder =new AlertDialog.Builder(this);


    }
}
