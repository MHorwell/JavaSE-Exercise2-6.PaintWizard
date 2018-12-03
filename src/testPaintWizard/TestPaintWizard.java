package testPaintWizard;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import paintWizard.Paint;
import paintWizard.PaintBrands;

public class TestPaintWizard {
	
	Paint testPaint = new Paint("CheapoMax", 19.99, 20, 10);
	PaintBrands testBrands = new PaintBrands();

	@Test
	public void testCalculateCost() {
		assertEquals(19.99 * 2, testPaint.calculateCost(400, testPaint),1);
	}
	
	@Test
	public void testBestPaint() {
		assertEquals("The best paint for the job is CheapoMax at £39.98",
				testBrands.findBestPaint(400, testBrands.makePaintList()));
	}
	

}
