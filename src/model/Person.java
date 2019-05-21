package model;



public class Person {
	private static int count=0;
	private int id;
	private String name;
	private String occupation;
	private AgeCategory ageCategory;
	private EmpStatus empStatus;
	private String taxid;
	private boolean uscitizen;
	private Gender gendergroup;
	public int getId() {
		return id;
	}
	
	public Person(String name, String occupation, AgeCategory ageCategory, EmpStatus empStatus, String taxid,
			boolean uscitizen, Gender gendergroup) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCategory;
		this.empStatus = empStatus;
		this.taxid = taxid;
		this.uscitizen = uscitizen;
		this.gendergroup = gendergroup;
		
		this.id=count;
		count++;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}
	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}
	public EmpStatus getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(EmpStatus empStatus) {
		this.empStatus = empStatus;
	}
	public String getTaxid() {
		return taxid;
	}
	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	public boolean isUscitizen() {
		return uscitizen;
	}
	public void setUscitizen(boolean uscitizen) {
		this.uscitizen = uscitizen;
	}
	public Gender getGendergroup() {
		return gendergroup;
	}
	public void setGendergroup(Gender gendergroup) {
		this.gendergroup = gendergroup;
	}
	
	
}
