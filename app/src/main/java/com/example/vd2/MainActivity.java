package com.example.vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button btn;
   example exm;
   public static final String ACTION_T="thong.com";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                intent.putExtra(ACTION_T,"order");
                intent.setAction(ACTION_T);
               sendBroadcast(intent);
               // sendOrderedBroadcast(intent,"thong.com");
            }
        });

    }
    protected void onStart(){
        super.onStart();
        initBroadcast();
        // vì onsstart gọi đầu tiên nên initBroadcast chạy
    }
    protected  void onPause(){
        super.onPause();
        unregisterReceiver(exm);
    }
    private  void initBroadcast(){
       exm = new example();
        IntentFilter filter =new IntentFilter();
        filter.addAction("thong.com");
        registerReceiver(exm,filter);
    }


}