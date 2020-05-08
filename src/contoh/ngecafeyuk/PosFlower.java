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

public class PosFlower extends Activity {
	static final LatLng FLOWER = new LatLng(-2.9922844,104.7446956);
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_flower);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker flower = map.addMarker(new MarkerOptions().position(FLOWER).title("Flowertage Cafe"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(FLOWER, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_flower, menu);
		return true;
	}

}
