package com.example.exercisemenu18a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.PopupMenu;

public class MenuActivity extends AppCompatActivity {
    Button btngmbrpersegi;
    Button btngmbrpersegipanjang;
    Button btngmbrlingkaran;
    Button btngmbrsegitiga;
    Button btngmbrtrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btngmbrpersegi = (Button) findViewById(R.id.gmbrpersegi);
        btngmbrpersegipanjang = (Button) findViewById(R.id.gmbrppanjang);
        btngmbrlingkaran = (Button)findViewById(R.id.gmbrlingkaran);
        btngmbrsegitiga = (Button)findViewById(R.id.gmbrsegitiga);
        btngmbrtrapesium = (Button) findViewById(R.id.gmbrtrapesium);

        btngmbrpersegi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),PersegiActivity.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), KelilingPersegiActivity.class));
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });
        btngmbrpersegipanjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btngmbrpersegipanjang);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),PPanjangActivity.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), KelilingPPanjangActivity.class));
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });
        btngmbrsegitiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btngmbrsegitiga);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),SegitigaActivity.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), KelilingSegitigaActivity.class));
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });
        btngmbrlingkaran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btngmbrlingkaran);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),LingkaranActivity.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), KelilingLingkaranActivity.class));
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });
        btngmbrtrapesium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(MenuActivity.this, btngmbrtrapesium);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas){
                            startActivity(new Intent(v.getContext(),TrapesiumActivity.class));
                        } else if (item.getItemId() == R.id.keliling){
                            startActivity(new Intent(v.getContext(), KelilingTrapesiumActivity.class));
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });

    }
}
