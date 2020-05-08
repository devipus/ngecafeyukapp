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

public class PosUpnormal extends Activity {
	static final LatLng UPNORMAL1 = new LatLng(-2.9916869,104.7076684);
	static final LatLng UPNORMAL2 = new LatLng(-2.9680943,104.7381557);
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_upnormal);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker upnormal1 = map.addMarker(new MarkerOptions().position(UPNORMAL1).title("Warunk Upnormal" +
				"Jl. Radial"));
		Marker upnormal2 = map.addMarker(new MarkerOptions().position(UPNORMAL2).title("Warunk Upnormal" +
				"Jl. Sokamto"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(UPNORMAL1, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_upnormal, menu);
		return true;
	}

}
