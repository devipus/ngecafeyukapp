package contoh.ngecafeyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class KekinianFragment extends Fragment {
	private LinearLayout keki1, keki2, keki3, keki4, keki5, keki6, keki7;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_kekinian, container, false);
		
		keki1 = (LinearLayout)rootView.findViewById(R.id.cafe1);
		keki1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent pindah = new Intent(getActivity(), ChatimeActivity.class);
				startActivity(pindah);
			}
		});
		
		keki2 = (LinearLayout)rootView.findViewById(R.id.cafe2);
		keki2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent jank = new Intent(getActivity(), JankActivity.class);
				startActivity(jank);
			}
		});
		
		keki3 = (LinearLayout)rootView.findViewById(R.id.cafe3);
		keki3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent lacasa = new Intent(getActivity(), LacasaActivity.class);
				startActivity(lacasa);
			}
		});
		
		keki4 = (LinearLayout)rootView.findViewById(R.id.cafe4);
		keki4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent taichanreng = new Intent(getActivity(), TaichanrengActivity.class);
				startActivity(taichanreng);
			}
		});
		
		keki5 = (LinearLayout)rootView.findViewById(R.id.cafe5);
		keki5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent taiwan = new Intent(getActivity(), TaiwanActivity.class);
				startActivity(taiwan);
			}
		});
		
		keki6 = (LinearLayout)rootView.findViewById(R.id.cafe6);
		keki6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent ganteng = new Intent(getActivity(), OmgantengActivity.class);
				startActivity(ganteng);
			}
		});
		
		keki7 = (LinearLayout)rootView.findViewById(R.id.cafe7);
		keki7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent burger = new Intent(getActivity(), BurgerActivity.class);
				startActivity(burger);
				
			}
		});
		
		return rootView;
	}

}
