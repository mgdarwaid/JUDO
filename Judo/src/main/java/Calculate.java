/*An interface for calculating total cost and comparing competition weight category.*/
public interface Calculate {
	
	public double calculateTotalCost(Athlete athlete);
	
	public double compareCompetitonWeightCat(Athlete athlete);

}

