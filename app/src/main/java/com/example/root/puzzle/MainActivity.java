package com.example.root.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView i1 = (ImageView) findViewById(R.id.image1);
        final ImageView i2 = (ImageView) findViewById(R.id.image2);
        final ImageView i3 = (ImageView) findViewById(R.id.image3);

        Button b = (Button) findViewById(R.id.reload);
        final TextView t = (TextView) findViewById(R.id.count);

        final int[] i = {0};
        final Random rand = new Random();

        i1.setTag("pic");
        i2.setTag("pic");
        i3.setTag("pic");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            i1.setImageResource(R.drawable.pic);
            i2.setImageResource(R.drawable.pic);
            i3.setImageResource(R.drawable.pic);
            i1.setTag("pic");
            i2.setTag("pic");
            i3.setTag("pic");
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(i1.getTag()).equals("pic")){
                    int s = rand.nextInt(3);
                    if (s <= 1){
                        i1.setImageResource(R.drawable.pic1);
                        i1.setTag("pic1");
                    }else{
                        i1.setImageResource(R.drawable.pic2);
                        i1.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i2.setImageResource(R.drawable.pic1);
                        i2.setTag("pic1");
                    }else {
                        i2.setImageResource(R.drawable.pic2);
                        i2.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i3.setImageResource(R.drawable.pic1);
                        i3.setTag("pic1");
                    }else {
                        i3.setImageResource(R.drawable.pic2);
                        i3.setTag("pic2");
                    }

                    while(String.valueOf(i1.getTag()).equals(String.valueOf(i2.getTag())) && String.valueOf(i1.getTag()).equals(String.valueOf(i3.getTag()))){
                        s = rand.nextInt(3);
                        if (s <= 1){
                            i1.setImageResource(R.drawable.pic1);
                            i1.setTag("pic1");
                        }else{
                            i1.setImageResource(R.drawable.pic2);
                            i1.setTag("pic2");
                        }
                    }

                    if (!String.valueOf(i1.getTag()).equals(String.valueOf(i2.getTag())) && !String.valueOf(i1.getTag()).equals(String.valueOf(i3.getTag()))) {
                        i[0]++;
                        t.setText(i[0]+"");
                    } else {
                        i[0]--;
                        t.setText(i[0]+"");
                    }
                }else{
                    Toast.makeText(MainActivity.this , "Click reload to try again!" , Toast.LENGTH_LONG).show();
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(i2.getTag()).equals("pic")){
                    int s = rand.nextInt(3);
                    if (s <= 1){
                        i1.setImageResource(R.drawable.pic1);
                        i1.setTag("pic1");
                    }else {
                        i1.setImageResource(R.drawable.pic2);
                        i1.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i2.setImageResource(R.drawable.pic1);
                        i2.setTag("pic1");
                    }else {
                        i2.setImageResource(R.drawable.pic2);
                        i2.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i3.setImageResource(R.drawable.pic1);
                        i3.setTag("pic1");
                    }else {
                        i3.setImageResource(R.drawable.pic2);
                        i3.setTag("pic2");
                    }

                    while(String.valueOf(i2.getTag()).equals(String.valueOf(i1.getTag())) && String.valueOf(i2.getTag()).equals(String.valueOf(i3.getTag()))){
                        s = rand.nextInt(3);
                        if (s <= 1){
                            i2.setImageResource(R.drawable.pic1);
                            i2.setTag("pic1");
                        }else{
                            i2.setImageResource(R.drawable.pic2);
                            i2.setTag("pic2");
                        }
                    }

                    if (!String.valueOf(i2.getTag()).equals(String.valueOf(i1.getTag())) && !String.valueOf(i2.getTag()).equals(String.valueOf(i3.getTag()))) {
                        i[0]++;
                        t.setText(i[0]+"");
                    } else {
                        i[0]--;
                        t.setText(i[0]+"");
                    }
                }else{
                    Toast.makeText(MainActivity.this , "Click reload to try again!" , Toast.LENGTH_LONG).show();
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(i3.getTag()).equals("pic")){
                    int s = rand.nextInt(3);
                    if (s <= 1){
                        i1.setImageResource(R.drawable.pic1);
                        i1.setTag("pic1");
                    }else {
                        i1.setImageResource(R.drawable.pic2);
                        i1.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i2.setImageResource(R.drawable.pic1);
                        i2.setTag("pic1");
                    }else {
                        i2.setImageResource(R.drawable.pic2);
                        i2.setTag("pic2");
                    }

                    s = rand.nextInt(3);
                    if (s <= 1){
                        i3.setImageResource(R.drawable.pic1);
                        i3.setTag("pic1");
                    }else {
                        i3.setImageResource(R.drawable.pic2);
                        i3.setTag("pic2");
                    }

                    while(String.valueOf(i3.getTag()).equals(String.valueOf(i2.getTag())) && String.valueOf(i3.getTag()).equals(String.valueOf(i1.getTag()))){
                        s = rand.nextInt(3);
                        if (s <= 1){
                            i3.setImageResource(R.drawable.pic1);
                            i3.setTag("pic1");
                        }else{
                            i3.setImageResource(R.drawable.pic2);
                            i3.setTag("pic2");
                        }
                    }

                    if (!String.valueOf(i3.getTag()).equals(String.valueOf(i1.getTag())) && !String.valueOf(i3.getTag()).equals(String.valueOf(i2.getTag()))) {
                        i[0]++;
                        t.setText(i[0]+"");
                    } else {
                        i[0]--;
                        t.setText(i[0]+"");
                    }
                }else{
                    Toast.makeText(MainActivity.this , "Click reload to try again!" , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}