package com.arjun.user.alert;

import android.content.DialogInterface;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnalrt1=(Button)findViewById(R.id.btnalert1);
        Button btnalrt2=(Button)findViewById(R.id.btnalert2);
        Button btnalrt3=(Button)findViewById(R.id.btnalert3);

        btnalrt1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            AlertDialog alrt1 = new AlertDialog.Builder(MainActivity.this).create();
                                            alrt1.setTitle("one button alert");
                                            alrt1.setMessage("one button alere");
                                            alrt1.setIcon(R.drawable.pencil);
                                            alrt1.setButton(DialogInterface.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    Toast.makeText(MainActivity.this, "OK pressed for cancell", Toast.LENGTH_SHORT).show();
                                                }
                                            });
                                            alrt1.show();

                                        }
                                    });





        btnalrt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alrt2=new AlertDialog.Builder(MainActivity.this).create();
                alrt2.setTitle("two button alert");
                alrt2.setMessage("two button alere");
                alrt2.setIcon(R.drawable.pencil);
                alrt2.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "press yes to continue", Toast.LENGTH_SHORT).show();
                    }
                });
                alrt2.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, " press no to cancell", Toast.LENGTH_SHORT).show();
                    }
                });

                alrt2.show();



            }
        });
        btnalrt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alrt3=new AlertDialog.Builder(MainActivity.this).create();
                alrt3.setTitle("three button alert");
                alrt3.setMessage("three button alere");
                alrt3.setIcon(R.drawable.pencil);
                alrt3.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "press yes to continue", Toast.LENGTH_SHORT).show();
                    }
                });
                alrt3.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, " press no to cancell", Toast.LENGTH_SHORT).show();
                    }
                });
                alrt3.setButton(DialogInterface.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "OK pressed for cancell", Toast.LENGTH_SHORT).show();
                    }
                });
                alrt3.show();



            }
        });

    }
}
