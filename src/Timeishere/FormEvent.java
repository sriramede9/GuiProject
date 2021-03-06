package Timeishere;

import java.util.EventObject;

public class FormEvent extends EventObject{

	private String name;
	private String occupation;
	private AgeCategory ageCategory;
	private EmpStatus empStatus;
	private String taxid;
	private boolean uscitizen;
	private String gendergroup;
	
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}


	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}


	public FormEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		
	}
	

	public FormEvent(Object source, String name, String occupation, AgeCategory ageCategory2, EmpStatus empStatus, String taxid, boolean usCitizen, String gendergroup) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.ageCategory=ageCategory2;
		this.empStatus=empStatus;
		this.taxid=taxid;
		this.uscitizen=usCitizen;
		this.gendergroup=gendergroup;
	}

	

	public String getGendergroup() {
		return gendergroup;
	}


	public void setGendergroup(String gendergroup) {
		this.gendergroup = gendergroup;
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


	public EmpStatus getEmpStatus() {
		return empStatus;
	}


	public void setEmpStatus(EmpStatus empStatus) {
		this.empStatus = empStatus;
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

	
}
