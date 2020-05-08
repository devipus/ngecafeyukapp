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

public class PosDunkin extends Activity {
	static final LatLng DUNDEMANG = new LatLng(-2.9848916,104.7514308);
	static final LatLng DUNOPI =  new LatLng(-3.0357904,104.7899711);
	
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_dunkin);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker dundemang = map.addMarker(new MarkerOptions().position(DUNDEMANG).title("Dunkin Donuts"));
		Marker dunopi = map.addMarker(new MarkerOptions().position(DUNOPI).title("Dunkin Donuts OPI Mall"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(DUNDEMANG, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_dunkin, menu);
		return true;
	}

}
