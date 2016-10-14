package com.example.deepika;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.deepika.now.MapsActivity;

public class sellerDet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_det);


        ImageButton phnBtn = (ImageButton) findViewById(R.id.phnBtn);
        ImageButton mapBtn = (ImageButton) findViewById(R.id.mapBtn);
        Button chatBtn = (Button) findViewById(R.id.chatBtn);

        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent redirect = new Intent(sellerDet.this, MapsActivity.class);
                startActivity(redirect);
                finish();
            }
        });


        phnBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:8167458953"));
                startActivity(callIntent);
            }
        });


    }
}
