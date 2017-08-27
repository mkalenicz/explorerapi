package com.kalenicz.maciej.explorerapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView nameTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //RECEIVE OUR DATA
        Intent i=getIntent();

        final String name=i.getExtras().getString("Name");
        //final String pos=i.getExtras().getString("Position");
     //   final int image=i.getExtras().getInt("Image");

        //REFERENCE VIEWS FROM XML
      //  img= (ImageView) findViewById(R.id.playerImage);
        nameTxt= (TextView) findViewById(R.id.activity_detail_text);
       // posTxt= (TextView) findViewById(R.id.posTxt);

        //ASSIGN DATA TO THOSE VIEWS
      //  img.setImageResource(image);
        nameTxt.setText("NAME :   "+name);
       // posTxt.setText("POSITION : "+pos);
    }
}
