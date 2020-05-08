package contoh.ngecafeyuk;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import android.net.Uri;
import android.content.Intent;

public class JankActivity extends Activity {
 
	int mFlipping = 0; //initially flipping is off
	TextView mTv, text;
	Button call, clock, money, place;
	LinearLayout detail;
	// reference to button available in the layout to start and stop the flipper

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jank);
	
		String customFont = "OpenSans_CondLight.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setTypeface(typeface);
		
		OnClickListener listener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ViewFlipper flipper = (ViewFlipper)findViewById(R.id.flipper1);
				
				if(mFlipping==0){
					//start flipping
					flipper.startFlipping();
					mFlipping = 1;
					mTv.setText(R.string.str_tv_stop);
				} else {
					//stop flipping
					flipper.stopFlipping();
					mFlipping = 0;
					mTv.setText(R.string.str_tv_start);
				}
				
			}
		};
		
		// getting a reference to the button available in the resource
		mTv = (TextView)findViewById(R.id.tv);
		
		//setting click event listne for the button
		mTv.setOnClickListener(listener);
		
		text = (TextView)findViewById(R.id.text);
		detail = (LinearLayout)findViewById(R.id.detail);
		
		call = (Button)findViewById(R.id.call);
		call.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent call = new Intent (Intent.ACTION_CALL);
				call.setData(Uri.parse("tel:082177700412"));
				startActivity(call);
			}
		});
		
		clock = (Button)findViewById(R.id.clock);
		clock.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(clock.isEnabled()){
					detail.setVisibility(View.VISIBLE);
					text.setText("JAM BUKA : 11:00-21:00 WIB");
				} else {
					detail.setVisibility(View.GONE);
				}
			}
		});
		
		money = (Button)findViewById(R.id.money);
		money.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(money.isEnabled()){
					detail.setVisibility(View.VISIBLE);
					text.setText("MULAI DARI : 12K-98K");
				} else {
					detail.setVisibility(View.GONE);
				}
			}
		});
		
		place = (Button)findViewById(R.id.place);
		place.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah = new Intent(JankActivity.this, PosJank.class);
				startActivity(pindah);
				
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jank, menu);
		return true;
	}

}
