package controller;

import java.util.List;

import Timeishere.FormEvent;
import model.AgeCategory;
import model.Database;
import model.EmpStatus;
import model.Gender;
import model.Person;

public class Controller {

	Database database = new Database();
	
	public List<Person> getPeople(){
		
	return	database.getPeople();
	}

	public void accept(FormEvent e) {
		// TODO Auto-generated method stub
		String name = e.getName();
		String occupation = e.getOccupation();
		int agecat = e.getAgeCategory().getIndex();
		String empCat = e.getEmpStatus().getStatus();
		boolean isUscitizen = e.isUscitizen();
		String taxId = e.getTaxid();
		String gender = e.getGendergroup();

		AgeCategory ageCategory=null;
		
		if(agecat==0) { ageCategory= AgeCategory.child;}
		if(agecat==1) { ageCategory= AgeCategory.adult;}
		if(agecat==2) { ageCategory= AgeCategory.senior;}
		
		
		
		EmpStatus eStatus;
		
		if(empCat.equalsIgnoreCase("employeed")) {eStatus=EmpStatus.employed;}
		else if(empCat.equalsIgnoreCase("self-employeed")) {eStatus=EmpStatus.selfEmployed;}
		else if(empCat.equalsIgnoreCase("unemployeed")) {eStatus=EmpStatus.unEmployed;}
		else if(empCat.equalsIgnoreCase("employeed")) {eStatus=EmpStatus.employed;}
		else {eStatus=EmpStatus.other;}
		
		Gender gen=null;
		if(gender.equalsIgnoreCase("male")) {gen=Gender.male;}
		else if (gender.equalsIgnoreCase("female")) {gen=Gender.female;}
		//else (gender.equalsIgnoreCase("other")) {gen=Gender.;}
		
		Person person=new Person(name, occupation, ageCategory, eStatus, taxId, isUscitizen, gen);
		
		database.addPerson(person);

	}
}
