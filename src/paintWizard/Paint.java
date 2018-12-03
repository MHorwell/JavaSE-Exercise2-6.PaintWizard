package paintWizard;


public class Paint {
	
	//attributes
	private String brandName;
	private double costPerTin;
	private int litresPerTin;
	private int metresPerLitre;
	
	//Constructors
	public Paint(String brandName, double costPerTin, int litresPerTin, int metresPerLitre) {
		this.brandName = brandName;
		this.costPerTin = costPerTin;
		this.litresPerTin = litresPerTin;
		this.metresPerLitre = metresPerLitre;
	}
	
	//Methods
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public double getCostPerTin() {
		return this.costPerTin;
	}
	
	public int getLitresPerTin() {
		return this.litresPerTin;
	}
	
	public int metresPerLitre() {
		return this.metresPerLitre;
	}
	
	public double calculateCost(int roomSize, Paint brand){
		double metersCovered = brand.litresPerTin * brand.metresPerLitre;
		int numberOfTins = 1;
		while (metersCovered < roomSize) {
			metersCovered += brand.litresPerTin * brand.litresPerTin;
			numberOfTins ++;
		}
		return (numberOfTins * brand.costPerTin);
	}
	

}
