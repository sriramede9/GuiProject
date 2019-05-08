package Timeishere;

import java.util.EventObject;

public class FormEvent extends EventObject{

	private String name;
	private String occupation;
	private Integer ageCategory;
	
	public Integer getAgeCategory() {
		return ageCategory;
	}


	public void setAgeCategory(Integer ageCategory) {
		this.ageCategory = ageCategory;
	}


	public FormEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		
	}
	

	public FormEvent(Object source, String name, String occupation, Integer ageCategory) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.ageCategory=ageCategory;
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
