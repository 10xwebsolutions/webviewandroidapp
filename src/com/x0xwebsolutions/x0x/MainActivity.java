package com.x0xwebsolutions.x0x;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity {
	WebView myBrowser;
	Button btn1,btn2,btn3,btn4,btn5,btn6 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myBrowser=(WebView)findViewById(R.id.webView1);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn4=(Button)findViewById(R.id.button4);
		btn5=(Button)findViewById(R.id.button5);
		btn6=(Button)findViewById(R.id.button6);
		
		myBrowser.setWebViewClient(new WebViewClient()
		{
			public boolean shouldOverrideUrlLoading(WebView view, String url)
			{
				view.loadUrl(url);
				return true;
			}
		}
				);
		
	}

	 public void OpenSite(View a)
	 {
		 Button btn=(Button)a;
		 if(btn.getId()==R.id.button1)
		 myBrowser.loadUrl("http://www.10xweb.wordpress.com/home/");
		 else if(btn.getId()==R.id.button2)
			 myBrowser.loadUrl("http://www.10xweb.wordpress.com/workshop/");
		 else if(btn.getId()==R.id.button3)
			 myBrowser.loadUrl("http://www.10xweb.wordpress.com/learn-web-design-at-proffesional-level-first-time-in-jodhpur/");
		 else if(btn.getId()==R.id.button4)
			 myBrowser.loadUrl("http://www.10xweb.wordpress.com/contact-us/");
		 else if(btn.getId()==R.id.button5)
			 myBrowser.loadUrl("http://www.10xweb.wordpress.com/careers/");
		 else if(btn.getId()==R.id.button6)
			 myBrowser.loadUrl("http://www.10xweb.wordpress.com/developer-zone/");
		 
		
	 }

}
