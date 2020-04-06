package com.example.exercisemenu18a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.PopupMenu;


public class Activity2 extends AppCompatActivity {
    Button btngmbrpersegi;
    Button btngmbrpersegipanjang;
    Button btngmbrlingkaran;
    Button btngmbrsegitiga;
    Button btngmbrtrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button gmbrpersegi = (Button) findViewById(R.id.gmbrpersegi);
        Button gmbrpersegipanjang = (Button) findViewById(R.id.gmbrppanjang);
        Button gmbrlingkaran = (Button)findViewById(R.id.gmbrlingkaran);
        Button gmbrsegitiga = (Button)findViewById(R.id.gmbrsegitiga);
        Button gmbrtrapesium = (Button) findViewById(R.id.gmbrtrapesium);

        gmbrpersegipanjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(Activity2.this, btngmbrpersegipanjang);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),ppanjang.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), kelilingppanjang.class));
                        }
                        return true;
                    }
                });

            }

        });

    }
}
