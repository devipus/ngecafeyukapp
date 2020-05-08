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

public class PosKfc extends Activity {
	static final LatLng KFC1 = new LatLng(-2.9629289,104.6974532);
	static final LatLng KFC2 =  new LatLng(-2.9629289,104.7237174);
	static final LatLng KFC3 = new LatLng(-2.975922,104.7519253);
	static final LatLng KFC4 =  new LatLng(-2.9833279,104.7421877);
	static final LatLng KFC5 = new LatLng(-2.9616003,104.7237174);
	static final LatLng KFC6 =  new LatLng(-2.9838849,104.7491087);
	static final LatLng KFC7 = new LatLng(-2.9514432,104.7524594);
	static final LatLng KFC8 =  new LatLng(-2.9904631,104.7395838);
	static final LatLng KFC9 = new LatLng(-2.996752,104.765672);
	static final LatLng KFC10 =  new LatLng(-2.9232917,104.7019837);
	static final LatLng KFC11 = new LatLng(-2.9495226,104.776378);
	static final LatLng KFC12 =  new LatLng(-2.9912657,104.7529258);
	
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pos_kfc);
		
		map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker kfc1 = map.addMarker(new MarkerOptions().position(KFC1).title("KFC Lia Palembang"));
		Marker kfc2 = map.addMarker(new MarkerOptions().position(KFC2).title("KFC PS"));
		Marker kfc3 = map.addMarker(new MarkerOptions().position(KFC3).title("KFC Royal Asia Palembang"));
		Marker kfc4 = map.addMarker(new MarkerOptions().position(KFC4).title("KFC Ramayana"));
		Marker kfc5 = map.addMarker(new MarkerOptions().position(KFC5).title("KFC Demang"));
		Marker kfc6 = map.addMarker(new MarkerOptions().position(KFC6).title("KFC International Plaza"));
		Marker kfc7 = map.addMarker(new MarkerOptions().position(KFC7).title("KFC PTC"));
		Marker kfc8 = map.addMarker(new MarkerOptions().position(KFC8).title("KFC Merdeka"));
		Marker kfc9 = map.addMarker(new MarkerOptions().position(KFC9).title("KFC Plaju"));
		Marker kfc10 = map.addMarker(new MarkerOptions().position(KFC10).title("KFC Simpang Bandara"));
		Marker kfc11 = map.addMarker(new MarkerOptions().position(KFC11).title("KFC The Basilica Bizpark "));
		Marker kfc12 = map.addMarker(new MarkerOptions().position(KFC12).title("KFC Bukit Kecil"));
		
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(KFC1, 15));
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pos_kfc, menu);
		return true;
	}

}
