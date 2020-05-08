package contoh.ngecafeyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class JamFragment extends Fragment {
	private LinearLayout jam1, jam2, jam3, jam4, jam5;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_jam, container, false);
		
		jam1 = (LinearLayout)rootView.findViewById(R.id.ljam1);
		jam1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent kfc = new Intent(getActivity(), KfcActivity.class);
				startActivity(kfc);
			}
		});
		
		jam2 = (LinearLayout)rootView.findViewById(R.id.ljam2);
		jam2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent tajmahal = new Intent(getActivity(), TajmahalActivity.class);
				startActivity(tajmahal);
			}
		});
		
		jam3 = (LinearLayout)rootView.findViewById(R.id.ljam3);
		jam3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent coffee = new Intent(getActivity(), CoffeeActivity.class);
				startActivity(coffee);
			}
		});
		
		jam4 = (LinearLayout)rootView.findViewById(R.id.ljam4);
		jam4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent dunkin = new Intent(getActivity(), DunkinActivity.class);
				startActivity(dunkin);
			}
		});
		
		jam5 = (LinearLayout)rootView.findViewById(R.id.ljam5);
		jam5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent donald = new Intent(getActivity(), DonaldActivity.class);
				startActivity(donald);
			}
		});
		
		return rootView;
	}
}
