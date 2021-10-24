package com.swufestu.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CountActivity2 extends AppCompatActivity {

    TextView score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count2);

        score1 = (TextView) findViewById(R.id.score1);
        score2 = (TextView) findViewById(R.id.score2);
    }

    public void btnAdd3(View btn){
        if(btn.getId() == R.id.three1){  //用以区分不同按钮调用同一个方法
            showScore1(3);
        }else{
            showScore2(3);
        }
    }

    public void btnAdd2(View btn){
        if(btn.getId() == R.id.two1){  //用以区分不同按钮调用同一个方法
            showScore1(2);
        }else{
            showScore2(2);
        }
    }

    public void btnAdd1(View btn){
        if(btn.getId() == R.id.one1){  //用以区分不同按钮调用同一个方法
            showScore1(1);
        }else{
            showScore2(1);
        }
    }

    public void btnReset(View btn){
        score1.setText("0");
        score2.setText("0");
    }

    private void showScore1(int inc){
        Log.i("show1","inc1="+inc);
        String oldScore = score1.getText().toString();
        int newScore = Integer.parseInt(oldScore) + inc;
        score1.setText(""+newScore); //前面必须加“”，是的加入的是字符串形式，数值不行
    }

    private void showScore2(int inc){
        Log.i("show2","inc2="+inc);
        String oldScore = score2.getText().toString();
        int newScore = Integer.parseInt(oldScore) + inc;
        score2.setText(""+newScore); //前面必须加“”，是的加入的是字符串形式，数值不行
    }
}