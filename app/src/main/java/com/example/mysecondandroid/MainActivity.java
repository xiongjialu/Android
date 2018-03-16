package com.example.mysecondandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //第一步01
    private AutoCompleteTextView acTextView;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    //这是第四步
    private String[] res={"beijing","shanghai","guangzhou","shenzhen"
                            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * 1.初始化控件
         * 2.适配器
         * 3.初始化数据源
         * 4.adapter与AutoCompleteTextView匹配
         * 5.设置分隔符
         */
        //第一步02
        acTextView=(AutoCompleteTextView)findViewById(R.id.actext);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);
        //第三步
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        acTextView.setAdapter(adapter);
        //第五步
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(adapter);
    }
}
