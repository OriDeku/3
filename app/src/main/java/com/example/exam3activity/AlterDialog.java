package com.example.exam3activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
public class AlertDialog1 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog dialog = new AlertDialog.Builder(this).create();//创建对话框
        View view=View.inflate(AlertDialog1.this,R.layout.alterdialog,null);
        dialog.setIcon(R.mipmap.ic_launcher);//设置对话框icon
        dialog.setTitle("ANOROIO APP");//设置对话框标题
        dialog.setView(view);
        //分别设置三个button
        dialog.setButton(DialogInterface.BUTTON_POSITIVE,"cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();//关闭对话框
            }
        });
        dialog.setButton(DialogInterface.BUTTON_NEUTRAL,"Sign in", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }
        });

        dialog.show();//显示对话
    }

}
