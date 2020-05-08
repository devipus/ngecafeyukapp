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

public class PosLacasa extends Activity {
	static final LatLng LACASA = new LatLng(-2.9666947,104.7675015);
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_lacasa);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker lacasa = map.addMarker(new MarkerOptions().position(LACASA).title("Lacasa Pizza"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(LACASA, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_lacasa, menu);
		return true;
	}

}
