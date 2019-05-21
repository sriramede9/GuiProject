package Timeishere;

public class EmpStatus {
	private int index;
	private String status;

	public EmpStatus(int index, String status) {
		super();
		this.index = index;
		this.status = status;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
