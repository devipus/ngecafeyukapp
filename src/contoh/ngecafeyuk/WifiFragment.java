package contoh.ngecafeyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class WifiFragment extends Fragment{
	private LinearLayout wifi1, wifi2, wifi3, wifi4, wifi5, wifi6, wifi7, wifi8, wifi9;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_wifi, container, false);
		
		wifi1 = (LinearLayout)rootView.findViewById(R.id.lwif1);
		wifi1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent hompiz = new Intent(getActivity(), HompizActivity.class);
				startActivity(hompiz);
			}
		});
		
		wifi2 = (LinearLayout)rootView.findViewById(R.id.lwif2);
		wifi2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent sriwijaya = new Intent(getActivity(), SriwijayaActivity.class);
				startActivity(sriwijaya);
			}
		});
		
		wifi3 = (LinearLayout)rootView.findViewById(R.id.lwif3);
		wifi3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent starbuck = new Intent(getActivity(), StarbuckActivity.class);
				startActivity(starbuck);
			}
		});
		
		wifi4 = (LinearLayout)rootView.findViewById(R.id.lwif4);
		wifi4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent narsis = new Intent(getActivity(), NarsisActivity.class);
				startActivity(narsis);
			}
		});
		
		wifi5 = (LinearLayout)rootView.findViewById(R.id.lwif5);
		wifi5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent upnormal = new Intent(getActivity(), UpnormalActivity.class);
				startActivity(upnormal);
			}
		});
		
		wifi6 = (LinearLayout)rootView.findViewById(R.id.lwif6);
		wifi6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent hotspot = new Intent(getActivity(), HotspotActivity.class);
				startActivity(hotspot);
			}
		});
		
		wifi7 = (LinearLayout)rootView.findViewById(R.id.lwif7);
		wifi7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent basengla = new Intent(getActivity(), BasenglaActivity.class);
				startActivity(basengla);
			}
		});
		
		wifi8 = (LinearLayout)rootView.findViewById(R.id.lwif8);
		wifi8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent aba = new Intent(getActivity(), AbaActivity.class);
				startActivity(aba);
			}
		});
		
		wifi9 = (LinearLayout)rootView.findViewById(R.id.lwif9);
		wifi9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent flower = new Intent(getActivity(), FlowerActivity.class);
				startActivity(flower);
			}
		});
		
		return rootView;
	}

}
