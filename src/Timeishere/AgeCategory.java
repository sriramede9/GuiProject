package Timeishere;

public class AgeCategory {
	private String agecategory;
	private int index;

	public AgeCategory(String agecategory, int index) {
		super();
		this.agecategory = agecategory;
		this.index = index;
	}

	public String getAgecategory() {
		return agecategory;
	}

	public void setAgecategory(String agecategory) {
		this.agecategory = agecategory;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
