package steve_cochran.button_counter_cochran;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public TextView textView;

    public android.view.View button1;
    public android.view.View button2;
    public android.view.View button3;
    public Button button5;


    public android.view.View radio1;
    public android.view.View radio2;
    public android.view.View radio3;
    public android.view.View radio4;
    public android.view.View radio5;
    public android.view.View radio6;

    public String stringTv;
    private Integer count = 0;
    public boolean game = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView2);

        button1 = findViewById( R.id.button );
        button2 = findViewById( R.id.button2 );
        button3 = findViewById( R.id.button3 );
        button5 = (Button) findViewById( R.id.button5 );


        radio1 = findViewById( R.id.radioButton1 );
        radio2 = findViewById( R.id.radioButton2 );
        radio3 = findViewById( R.id.radioButton3 );
        radio4 = findViewById( R.id.radioButton4);
        radio5 = findViewById( R.id.radioButton5 );
        radio6 = findViewById( R.id.radioButton6 );

        radio1.setVisibility(View.INVISIBLE);
        radio2.setVisibility(View.INVISIBLE);
        radio3.setVisibility(View.INVISIBLE);
        radio4.setVisibility(View.INVISIBLE);
        radio5.setVisibility(View.INVISIBLE);
        radio6.setVisibility(View.INVISIBLE);


        textView.setText(count.toString());
    }

    public void doSomethingR(View v){


        count = count + 1;
        textView.setText(count.toString());

        radio1.setVisibility(View.INVISIBLE);
        radio2.setVisibility(View.INVISIBLE);
        radio3.setVisibility(View.INVISIBLE);
        radio4.setVisibility(View.INVISIBLE);
        radio5.setVisibility(View.INVISIBLE);
        radio6.setVisibility(View.INVISIBLE);

        Random rn = new Random();
        int Low = 1;
        int High = 6;

        int Result = rn.nextInt(5)+1;

        if(Result == 1){

            radio1.setVisibility(View.VISIBLE);

        }

        if(Result == 2){

            radio2.setVisibility(View.VISIBLE);

        }

        if(Result == 3){

            radio3.setVisibility(View.VISIBLE);

        }

        if(Result == 4){

            radio4.setVisibility(View.VISIBLE);

        }

        if(Result == 5){

            radio5.setVisibility(View.VISIBLE);

        }

        if(Result == 6){

            radio6.setVisibility(View.VISIBLE);

        }

        Log.d("VIVZ", textView.toString());

    }


    public void doSomething1(View v){


        count = count + 1;
        textView.setText(count.toString());


        Log.d("VIVZ", textView.toString());

    }


    public void doSomething2(View v){

        count = count - 1;
        textView.setText(count.toString());

        Log.d("VIVZ", textView.toString());

    }

    public void doSomething3(View v){

        count = 0;
        textView.setText(count.toString());


        textView.setText("0");
        Log.d("VIVZ", textView.toString());

    }

    public void doSomethingGAME(View v)throws Exception{

        if( game == false) {

            textView.setText("GAME");
            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE );


            Random rn = new Random();
            int Low = 1;
            int High = 6;

            int Result = rn.nextInt(5)+1;

            if(Result == 1){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);


                radio1.setVisibility(View.VISIBLE);

            }

            if(Result == 2){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);


                radio2.setVisibility(View.VISIBLE);

            }

            if(Result == 3){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);

                radio3.setVisibility(View.VISIBLE);

            }

            if(Result == 4){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);


                radio4.setVisibility(View.VISIBLE);

            }

            if(Result == 5){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);

                radio5.setVisibility(View.VISIBLE);

            }

            if(Result == 6){
                radio1.setVisibility(View.INVISIBLE);
                radio2.setVisibility(View.INVISIBLE);
                radio3.setVisibility(View.INVISIBLE);
                radio4.setVisibility(View.INVISIBLE);
                radio5.setVisibility(View.INVISIBLE);
                radio6.setVisibility(View.INVISIBLE);

                radio6.setVisibility(View.VISIBLE);

            }



            button5.setText("BACK");



            game = true;

        } else {

            textView.setText("BACK");

            button5.setText("GAME");
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);

            radio1.setVisibility(View.INVISIBLE);
            radio2.setVisibility(View.INVISIBLE);
            radio3.setVisibility(View.INVISIBLE);
            radio4.setVisibility(View.INVISIBLE);
            radio5.setVisibility(View.INVISIBLE);
            radio6.setVisibility(View.INVISIBLE);

            game = false;

        }
        Log.d("VIVZ", textView.toString());

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("countSave",count);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("countSave");
        textView.setText(count.toString());

    }
}


