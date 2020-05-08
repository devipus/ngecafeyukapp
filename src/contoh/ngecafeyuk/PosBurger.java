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

public class PosBurger extends Activity {
	static final LatLng GERRAMBUTAN= new LatLng(-2.9487025,104.7396552);
	static final LatLng GERBIDAR= new LatLng(-2.9487025,104.7396552);
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_burger);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker gerrambutan = map.addMarker(new MarkerOptions().position(GERRAMBUTAN).title("Burger Time Palembang"));
		Marker gerbidar = map.addMarker(new MarkerOptions().position(GERBIDAR).title("Burger Time"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(GERRAMBUTAN, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_burger, menu);
		return true;
	}

}
