package com.xnor.practicalexam;

import androidx.appcompat.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView textView = (TextView) findViewById(R.id.textView3);
        String para = "Supercomputing in India has a history going back to the 1980s. The Government of India created an indigenous development" +
                " programme as they had difficulty purchasing foreign supercomputers. As of June 2020, when ranking by number of supercomputer " +
                "systems in the TOP500 list, India is ranked 23rd in the world." +
                "As of June 2020 the Cray XC40-based Pratyush is the fastest supercomputer in India."+
                "India had faced difficulties in the 1980s when trying to purchase supercomputers for academic " +
                "and weather forecasting purposes. In 1986 the National Aerospace Laboratories (NAL) started the Flosolver project to develop a " +
                "computer for computational fluid dynamics and aerospace engineering." +
                "The Flosolver MK1, described as a parallel processing system, started operations in December 1986." +
                "In 1987 the Indian Government had requested to purchase a Cray X-MP supercomputer; " +
                "this request was denied by the United States government as the machine could have a dual use in weapons development." +
                " After this problem, in the same year, the Government of India decided to promote an indigenous supercomputer development programme." +
                "Multiple projects were commissioned from different groups including the Centre for Development of Advanced Computing (C-DAC), the Centre " +
                "for Development of Telematics (C-DOT), the National Aerospace Laboratories (NAL), the " +
                "Bhabha Atomic Research Centre (BARC), and the Advanced Numerical Research and Analysis Group (ANURAG)." +
                "C-DOT created. the C-DOT High-Performance Parallel Processing System. NAL had created the Flosolver in 1986." +
                "BARC created the Anupam series of supercomputers. ANURAG created the PACE series of supercomputers.";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
