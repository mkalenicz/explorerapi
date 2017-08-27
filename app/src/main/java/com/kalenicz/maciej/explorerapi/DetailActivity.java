package com.kalenicz.maciej.explorerapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DetailActivity extends Activity {
    TextView nameTxt;
   ImageView imageView;
    //public List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);

        //RECEIVE OUR DATA
        Intent i=getIntent();

        final String name=i.getExtras().getString("Name");

        //final String pos=i.getExtras().getString("Position");
      final String img =i.getExtras().getString("Image");

        //REFERENCE VIEWS FROM XML
      imageView= (ImageView) findViewById(R.id.image_activity_detail);
        nameTxt= (TextView) findViewById(R.id.activity_detail_text);
       // posTxt= (TextView) findViewById(R.id.posTxt);

       // Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(img);

        Picasso.with(this).load("https://image.tmdb.org/t/p/w300"+img).into(imageView);

        //movies.getPosterPath()).into(imageView)

        //ASSIGN DATA TO THOSE VIEWS
      //img.setImageResource(image);
        nameTxt.setText("NAME :   "+name);
       // posTxt.setText("POSITION : "+pos);
    }

}
