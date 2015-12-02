package app.warawat.svgsample;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import app.akexorcist.svgsample.R;

public class Main extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		SVG svg = SVGParser.getSVGFromResource(getResources(), R.raw.sample_image);		
		ImageView iv = (ImageView)findViewById(R.id.imageView1);
		iv.setImageDrawable(svg.createPictureDrawable());
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB) {
			iv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		}
	}
}
