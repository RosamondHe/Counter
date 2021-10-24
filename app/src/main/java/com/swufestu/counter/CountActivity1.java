package com.swufestu.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CountActivity1 extends AppCompatActivity {

    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count1);

        score = (TextView) findViewById(R.id.score);
    }

    public void btnAdd3(View btn){
        showScore(3);
    }

    public void btnAdd2(View btn){
        showScore(2);
    }

    public void btnAdd1(View btn){
        showScore(1);
    }

    public void btnReset(View btn){
        score.setText("0");
    }

    private void showScore(int inc){
        Log.i("show","inc="+inc);
        String oldScore = score.getText().toString();
        int newScore = Integer.parseInt(oldScore) + inc;
        score.setText(""+newScore); //前面必须加“”，是的加入的是字符串形式，数值不行
    }
}