package contoh.ngecafeyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class AllFragment  extends Fragment {
   private LinearLayout keki1, keki2, keki3, keki4, keki5, keki6, keki7, jam1, jam2, jam3, jam4, jam5, 
   wifi1, wifi2, wifi3, wifi4, wifi5, wifi6, wifi7, wifi8, wifi9, music1, music2, music3, music4, music5;
   
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_all, container, false);
		
		keki1=(LinearLayout)rootView.findViewById(R.id.cafe1);
		keki1.setOnClickListener(new View.OnClickListener() {
			
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent pindah= new Intent (getActivity(), ChatimeActivity.class);
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
	public void chatime (View v){
		Intent pindah= new Intent(getActivity(), ChatimeActivity.class);
		startActivity(pindah);
	}
}
