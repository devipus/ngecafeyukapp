package contoh.ngecafeyuk;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class PosDonald extends Activity {
	static final LatLng DSOKAMTO = new LatLng(-2.9518731,104.7534414);
	static final LatLng DANUGRAH =  new LatLng(-2.9741857,104.7503081);
	static final LatLng DPS = new LatLng(-2.9750093,104.7427045);
	static final LatLng DPIM = new LatLng(-2.9850602,104.7508534);
	
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_donald);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker dsokamto = map.addMarker(new MarkerOptions().position(DSOKAMTO).title("McDonald's R. Sukamto"));
		Marker danugrah = map.addMarker(new MarkerOptions().position(DANUGRAH).title("McDonald's Hotel Anugerah"));
		Marker dps = map.addMarker(new MarkerOptions().position(DPS).title("McDonald's PS"));
		Marker dpim = map.addMarker(new MarkerOptions().position(DPIM).title("McDonald's Palembang Indah Mall"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(DSOKAMTO, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_donald, menu);
		return true;
	}

}
