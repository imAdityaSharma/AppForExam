package com.xnor.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView = (TextView) findViewById(R.id.textView4);
        String para =" A mainframe computer, informally called a mainframe or big iron,[1] is a computer used " +
                "primarily by large organizations for critical applications, bulk data processing (such as the " +
                "census and industry and consumer statistics, enterprise resource planning, and large-scale transaction processing). " +
                "A mainframe computer is larger and has more processing power than some other classes of computers, such as minicomputers, " +
                "servers, workstations, and personal computers. Most large-scale computer-system architectures were established in the " +
                "1960s, but they continue to evolve. Mainframe computers are often used as servers."+
                "The term mainframe derived from the large cabinet, called a main frame,[citation needed] that houses the central processing " +
                "unit and main memory of early computers.[2][full citation needed][3] Later, the term mainframe was used to " +
                "distinguish high-end commercial computers from less powerful machines.[4] ";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
