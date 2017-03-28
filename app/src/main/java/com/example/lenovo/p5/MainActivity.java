package com.example.lenovo.p5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {
    final static int MENU_00= Menu.FIRST;
    final static int MENU_01=Menu.FIRST+1;
    final static int MENU_02=Menu.FIRST+2;
    final static int SUB_MENU_02_00=Menu.FIRST+3;
    final static int SUB_MENU_02_01=Menu.FIRST+4;
    final static int SUB_MENU_02_02=Menu.FIRST+5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,MENU_00,0,"新建");
        menu.add(0,MENU_01,0,"打开");

        SubMenu sub1=(SubMenu)menu.addSubMenu(0,MENU_02,1,"操作");
        sub1.add(0,SUB_MENU_02_00,0,"复制");
        sub1.add(0,SUB_MENU_02_01,1,"粘贴");
        sub1.add(0,SUB_MENU_02_02,2,"剪切");
        return true;
    }
}
