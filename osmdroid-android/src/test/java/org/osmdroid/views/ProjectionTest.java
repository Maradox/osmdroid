package org.osmdroid.views;

import android.graphics.Point;
import android.graphics.Rect;
import org.junit.Test;
import junit.framework.Assert;
import org.osmdroid.util.GeoPoint;

/**
 * @author Martin Perebner
 */

public class ProjectionTest {

  @Test
  public void test_conversationFromPixelsToPixels() {
    Projection projection = new Projection(
        1.0,
        new Rect(0, 0, 1080, 1536),
        new GeoPoint(0.0, 0.0),
        0L, 0L,
        0,
        false, false
    );

    Point inputPoint = new Point(0, 0);
    GeoPoint geoPoint = (GeoPoint) projection.fromPixels(inputPoint.x, inputPoint.y);
    Point outputPoint = projection.toPixels(geoPoint, null);

    Assert.assertEquals(inputPoint.x, outputPoint.x);
    Assert.assertEquals(inputPoint.y, outputPoint.y);
  }

}
