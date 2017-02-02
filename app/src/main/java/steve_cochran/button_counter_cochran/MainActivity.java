package steve_cochran.button_counter_cochran;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import java.*;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public String stringTv;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView2);

        textView.setText(count.toString());
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


