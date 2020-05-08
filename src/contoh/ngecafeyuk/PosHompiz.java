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

public class PosHompiz extends Activity {
	static final LatLng HOMPIZ1 = new LatLng(-2.9555249,104.7202557);
	static final LatLng HOMPIZ2 = new LatLng(-2.9784247,104.7351193);
	private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_hompiz);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker hompiz1 = map.addMarker(new MarkerOptions().position(HOMPIZ1).title("Hompizz Cafe Palembang"));
		Marker hompiz2 = map.addMarker(new MarkerOptions().position(HOMPIZ2).title("Hompizz Cafe n Resto"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(HOMPIZ1, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_hompiz, menu);
		return true;
	}

}
