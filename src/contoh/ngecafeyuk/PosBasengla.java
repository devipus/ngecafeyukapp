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

public class PosBasengla extends Activity {
	static final LatLng BASENGLA = new LatLng(-2.9744509,104.7406423);
	private GoogleMap map;

	@Override  
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_basengla);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker chatimepim = map.addMarker(new MarkerOptions().position(BASENGLA).title("Basengla Resto n House of Joy"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(BASENGLA, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_basengla, menu);
		return true;
	}

}
