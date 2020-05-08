package contoh.ngecafeyuk;

import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Menu;
import android.widget.ProgressBar;

public class SplashActivity extends Activity {
	ProgressBar loading;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		loading = (ProgressBar) findViewById(R.id.progg);
		loading.getIndeterminateDrawable().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
		
		new Timer().schedule(new TimerTask() {
			public void run(){
				Intent pindah = new Intent(SplashActivity.this, HomeActivity.class);
				startActivity(pindah);
				finish();
			}
		},2000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
