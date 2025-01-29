package com.saadi.messpabna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView jan,feb, mar,apr,may,jun,jul,aug,sep,oct,nov,dec,saadi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // january setup

        jan = findViewById(R.id.jan);
        jan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1s-D-yZQ80kYuFApOO7KpqIVH61ZIaS-dqZxzbprVIZY/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });
        
        
        //february

        feb = findViewById(R.id.feb);
        feb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1VI-td7T8eDfOO0nLAZ2CFQ939jNYHgzGnogIpPuQWsQ/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //march


        mar = findViewById(R.id.mar);
        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1SbrDLu-MB1PPiRp4qFIB8YOxXv5eEd5JtA6kkV4X0M4/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //april

        apr = findViewById(R.id.apr);
        apr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1N93Bd515n5cEOmI73eQyL7PeZgcngJiR5RR9x5ZCKNo/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //may

        may = findViewById(R.id.may);
        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1AsW_efmN3bK0_aP3LM6omfkYfFNCxnpBgcocvSrczUs/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });

        //june

        jun = findViewById(R.id.jun);
        jun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1btL4xcBhR4-Hi9xrJZZSnFW1YK1WtnmfRIupWOsIlqA/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //july

        jul = findViewById(R.id.jul);
        jul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1NDG-1FDRBeXW0erhXXH8MYFIr-ddkG0yQDbBpje-bcw/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //august

        aug = findViewById(R.id.aug);
        aug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/11h7ZCR8yjBeLRjVtt3RVq-7CtJTxRTJeneDrzWF2dXo/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //september

        sep = findViewById(R.id.sep);
        sep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1d6K6sHhX6J0IpdmzsPK_CJvLr0D2HSNltp-DWFlnUio/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //october

        oct = findViewById(R.id.oct);
        oct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1aG_1aOygS0a_0pbx8XmKZ4qJqlsB4wPJkmsRAM_8als/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //november

        nov = findViewById(R.id.nov);
        nov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1B1f6jK5R9ndjRH4Ll2zbqtKSkO4H73Rqsps2xq19vRA/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });


        //December

        dec = findViewById(R.id.dec);
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleSheetUrl = "https://docs.google.com/spreadsheets/d/1uz-_w-x1nFGD1su2MC7lw97gOBtVTpw0AF3jODB9FkE/edit?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSheetUrl));
                startActivity(intent);
            }
        });



        // Developer

        saadi = findViewById(R.id.saadi);
        saadi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookUrl = "https://www.facebook.com/ShahnewazSaadi?mibextid=ZbWKwL";
                    String facebookAppUrl = "fb://facewebmodal/f?href=" + facebookUrl;
                    Intent intent = new Intent();
                    try {
                        getPackageManager().getPackageInfo("com.facebook.katana",0);
                    } catch (Exception e)
                    {
                        intent = new Intent(Intent.ACTION_VIEW,Uri.parse(facebookAppUrl));
                    }
                    startActivity(intent);
                }
            });



    }
}