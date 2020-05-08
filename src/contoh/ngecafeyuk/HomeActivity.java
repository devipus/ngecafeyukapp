package contoh.ngecafeyuk;

import contoh.ngecafeyuk.adapter.TabsPagerAdapter;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class HomeActivity extends FragmentActivity implements ActionBar.TabListener {
	
	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "All", "Kekinian", "24 Jam", "Wifi", "Live Music" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	
	//Jika tekan tombol back
    public void onBackPressed(){
    	exit(); //pergi ke method exit
    }
    
    private void exit(){
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage("Yakin Ingin Keluar ?").setCancelable(false)//tidak bisa tekan tombol back
    	
    	//jika pilih yes
    	.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				finish();
				
			}
		})
		// jika pilih no
		.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
			}
		}).show();
    }

}
