package paintWizard;


public class Main {
	
	public static void main (String[] args) {
		
		PaintBrands brands = new PaintBrands();
		
		System.out.println(brands.findBestPaint(160, brands.makePaintList()));
		
	}

}
