package paintWizard;

import java.util.ArrayList;
import java.util.List;

public class PaintBrands {

	private Paint CheapoMax = new Paint("CheapoMax", 19.99, 20, 10);
	private Paint AverageJoes = new Paint("AverageJoes", 17.99, 15, 11);
	private Paint DuluxourousPaints = new Paint("DuluxourousPaints", 25, 10, 20);

	public List<Paint> makePaintList() {
		List<Paint> paintList = new ArrayList<Paint>();
		paintList.add(CheapoMax);
		paintList.add(AverageJoes);
		paintList.add(DuluxourousPaints);
		return paintList;
	}
	
	public String findBestPaint(int roomSize, List<Paint> paintlist) {
		double bestPaintCost = 0.0;
		Paint bestPaintBrand = DuluxourousPaints;
		for (Paint paintBrand : paintlist) {
			if (paintBrand.calculateCost(roomSize, paintBrand) < bestPaintCost || bestPaintCost == 0.0){
				bestPaintBrand = paintBrand;
				bestPaintCost = paintBrand.calculateCost(roomSize, paintBrand);
			}
		}
		return "The best paint for the job is " + bestPaintBrand.getBrandName() + " at £" + bestPaintCost;
	}


}
