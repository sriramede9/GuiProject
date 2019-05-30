package Timeishere;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Person;



public class TablePanel extends JPanel {

	private JTable jTable;
	
	private PersonTableModel tableModel;
	
	public TablePanel() {
		
		tableModel=new PersonTableModel();
		
		jTable=new JTable(tableModel);
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(jTable),BorderLayout.CENTER);
		
	}
	
	
	
	public void setData(List<Person> db) {
		  tableModel.setData(db);  
	}
	
	public void refresh() {
		tableModel.fireTableDataChanged();
	}
	
}
