package contoh.ngecafeyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class LiveMusicFragment extends Fragment {
	private LinearLayout music1, music2, music3, music4, music5;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_live_music, container, false);
		
		music1 = (LinearLayout)rootView.findViewById(R.id.lmus1);
		music1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent south = new Intent(getActivity(), SouthActivity.class);
				startActivity(south);
			}
		});
		
		music2 = (LinearLayout)rootView.findViewById(R.id.lmus2);
		music2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent meetup = new Intent(getActivity(), MeetupActivity.class);
				startActivity(meetup);
			}
		});
		
		music3 = (LinearLayout)rootView.findViewById(R.id.lmus3);
		music3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent gunz = new Intent(getActivity(), GunzActivity.class);
				startActivity(gunz);
			}
		});
		
		music4 = (LinearLayout)rootView.findViewById(R.id.lmus4);
		music4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent bingen = new Intent(getActivity(), BingenActivity.class);
				startActivity(bingen);
			}
		});
		
		music5 = (LinearLayout)rootView.findViewById(R.id.lmus5);
		music5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent york = new Intent(getActivity(), YorkActivity.class);
				startActivity(york);
			}
		});
		
		return rootView;
	}
}
