package com.swufestu.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText cg;
    TextView fg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cg = (EditText) findViewById(R.id.cg);
        fg = (TextView) findViewById(R.id.fg);

        btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i("Main","click msg...");
        String input = cg.getText().toString();
        double c, f;
        c = Double.parseDouble(input);
        f = c*1.8+32;
        fg.setText("结果是：" + f);
    }
}