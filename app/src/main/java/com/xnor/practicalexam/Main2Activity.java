package com.xnor.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = (TextView) findViewById(R.id.textView6);
        String para ="What Does Minicomputer Mean?\n"+
                "A minicomputer is a type of computer that possesses most of the features and capabilities of a large computer but " +
                "is smaller in physical size.\nA minicomputer fills the space between the mainframe and microcomputer, and is smaller than " +
                "the former but larger than the latter. Minicomputers are mainly used as small or mid-range servers " +
                "operating business and scientific applications. However, the use of the term minicomputer has diminished and has " +
                "merged with servers.\nA minicomputer may also be called a mid-range computer.\n" +
                "Minicomputers emerged in the mid-1960s and were first developed by IBM Corporation. They were primarily designed for business " +
                "applications and services that require the performance and efficiency of mainframe computers. " +
                "Minicomputers are generally used as mid-range servers, where they can operate mid-sized software applications " +
                "and support numerous users simultaneously.\nMinicomputers may contain one or more processors, support multiprocessing and " +
                "tasking, and are generally resilient to high workloads. Although they are smaller than mainframe or supercomputers, " +
                "minicomputers are more powerful than personal computers and workstations.\n";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
