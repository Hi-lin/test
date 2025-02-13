package module6;

import java.util.*;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<AirportMarker> routes = new ArrayList<>();;
	public boolean dis = true;
	public boolean track = false;
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	public void add(AirportMarker a) {
		routes.add(a);
	}
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
			pg.fill(11);
			pg.ellipse(x, y, 3, 3);
			if(track) {
				for(AirportMarker m: routes) {
					m.setHidden(false);
				}
			}
		}
		
		

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		
		// show routes
		
		
	}
	
}
