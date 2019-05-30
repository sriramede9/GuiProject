 package Timeishere;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Person;



public class PersonTableModel extends AbstractTableModel {

	private List<Person> db;
	
	private String columnames[]= {"ID","Name","Occupation","AgeCategory","Us Citizen","Tax Id"};
	
	  public PersonTableModel() {
		// TODO Auto-generated constructor stub
		  
	}
	
	  public void setData(List<Person> db) {
		  this.db=db;
	  }
	  
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return super.getColumnName(column);
	}
	
	
	

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return db.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Person person=db.get(rowIndex);
		
		switch (columnIndex) {
		case 0:
			person.getId();
			break;
			
		case 1:
			person.getName();
			break;
			
		case 2:
			person.getOccupation();
			break;
			
		case 3:
			person.getAgeCategory();
			break;
			
		case 4:
			person.getEmpStatus();
			break;
			
		case 5:
			person.isUscitizen();
			break;
			
		case 6:
			person.getTaxid();
			break;

		default:
			break;
		}
		
		
		return null;
	}

}
