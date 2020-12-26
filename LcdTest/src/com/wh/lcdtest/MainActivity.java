package com.wh.lcdtest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
/**
 * @author wh
 * @Date 2012-08-07
 * @version V0.0
 */
public class MainActivity extends Activity implements OnClickListener{

	TextView myTextView;
	int flag;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("»¶Ó­Ê¹ÓÃÆÁÄ»²âÊÔ³ÌÐò£¡£¡Çëµã»÷ÆÁÄ»¿ªÊ¼²âÊÔ£¡£¡");
        myTextView.setTextColor(Color.WHITE);
        myTextView.setOnClickListener(this);
        flag=1;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void onClick(View view){
 	   
 	   String mStr="LCD TEST!!";
 	   System.out.println(mStr);
 	   myTextView.setText("");

 	   flag = flag%5;
 	   
 	   switch(flag)
 	   {
	 	   case 0:
	 		   myTextView.setBackgroundColor(Color.WHITE); break;
	 		  
	 	   case 1:
	 		  myTextView.setBackgroundColor(Color.RED); break;
	 		  
	 	   case 2:
	 		   myTextView.setBackgroundColor(Color.GREEN); break;
	 		   
	 	   case 3:
	 		   myTextView.setBackgroundColor(Color.BLUE); break;
	 		  
	 	   case 4:
	 		   myTextView.setBackgroundColor(Color.BLACK); break;
 		   
 	   }
 	  flag++;

    }
}
