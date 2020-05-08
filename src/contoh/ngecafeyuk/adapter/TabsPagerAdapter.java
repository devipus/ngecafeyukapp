package contoh.ngecafeyuk.adapter;

import contoh.ngecafeyuk.AllFragment;
import contoh.ngecafeyuk.KekinianFragment;
import contoh.ngecafeyuk.JamFragment;
import contoh.ngecafeyuk.WifiFragment;
import contoh.ngecafeyuk.LiveMusicFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {
	
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new AllFragment();
		case 1:
			return new KekinianFragment();
		case 2:
			return new JamFragment();
		case 3:
			return new WifiFragment();
		case 4 :
			return new LiveMusicFragment();
			
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 5;
	}
}
