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

public class PosStarbucks extends Activity {
	static final LatLng STARBUCK1 = new LatLng(-2.9777496,104.7297883);
	static final LatLng STARBUCK2 =  new LatLng(-2.984606,104.7514526);
	static final LatLng STARBUCK3 = new LatLng(-2.8950809,104.6961237);
	
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_starbucks);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker starbuck1 = map.addMarker(new MarkerOptions().position(STARBUCK1).title("Starbucks Coffee"));
		Marker starbuck2 = map.addMarker(new MarkerOptions().position(STARBUCK2).title("Starbucks Coffee" +
				"Palembang Indah Mall"));
		Marker starbuck3= map.addMarker(new MarkerOptions().position(STARBUCK3).title("Starbucks Bandara" +
				"Sulsan Mahmud Badaruddin II"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(STARBUCK1, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_starbucks, menu);
		return true;
	}

}
