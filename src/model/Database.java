package model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private ArrayList<Person> people;

	public Database() {
		super();
		// TODO Auto-generated constructor stub

		people = new ArrayList<>();
	}

public void addPerson(Person person) {
		people.add(person);
		System.out.println(people);
	}

	public List<Person> getPeople() {
		return people;
	}

}
