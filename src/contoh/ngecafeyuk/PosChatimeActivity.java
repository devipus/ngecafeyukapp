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

public class PosChatimeActivity extends Activity {
	static final LatLng CHATIMEPIM = new LatLng(-2.9848916,104.7514308);
	static final LatLng CHATIMEPS =  new LatLng(-2.9760516,104.7395028);
	static final LatLng CHATIMEPTC = new LatLng(-2.9503218,104.7601104);
	static final LatLng CHATIMEPOINT = new LatLng(-2.9912215,104.7592842);
	static final LatLng CHATIMEPI = new LatLng(-2.9784718,104.7436139);
	
	private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_chatime);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker chatimepim = map.addMarker(new MarkerOptions().position(CHATIMEPIM).title("Chatime PIM"));
		Marker chatimeps = map.addMarker(new MarkerOptions().position(CHATIMEPS).title("Chatime PS"));
		Marker chatimeptc= map.addMarker(new MarkerOptions().position(CHATIMEPTC).title("Chatime PTC"));
		Marker chatimepoint = map.addMarker(new MarkerOptions().position(CHATIMEPOINT).title("Chatime Dermaga Palembang"));
		Marker chatimepi = map.addMarker(new MarkerOptions().position(CHATIMEPI).title("Chatime PI"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(CHATIMEPIM, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10),2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_chatime, menu);
		return true;
	}

}
