package Timeishere;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel {

	private JLabel nameJLabel;
	private JLabel occupatoinJLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okButton;
	private StringListener stringListener;
	private FormListener formlistener;
	private JList ageList;
	private JLabel ageCategoryLabel;
	private JComboBox empComboBox;
	private JLabel empstatusLabel;
	private JCheckBox citizenCheckBox;

	public FormPanel() {
		super();
		// TODO Auto-generated constructor stub

		nameJLabel = new JLabel("Name:");
		occupatoinJLabel = new JLabel("Occupation:");
		occupationField = new JTextField(10);
		nameField = new JTextField(10);
		okButton = new JButton("Submit");
		ageList = new JList();
		ageCategoryLabel = new JLabel("Age Category:");
		empComboBox = new JComboBox();
		empstatusLabel = new JLabel("Emp-status:");
		citizenCheckBox=new JCheckBox();
		// list componenets

		DefaultListModel ageModel = new DefaultListModel();

		ageModel.addElement("under 18");
		ageModel.addElement("18-65");
		ageModel.addElement("65 or over");
		ageList.setModel(ageModel);
		ageList.setPreferredSize(new Dimension(110, 60));
		// grid bag layout

		// set up list of compbo box.

		DefaultComboBoxModel emp = new DefaultComboBoxModel<>();
		emp.addElement("Employed");
		emp.addElement("Self-Employed");
		emp.addElement("UnEmployed");

		empComboBox.setModel(emp);

		layoutComponents();

	}

	public void setStringListener(StringListener stringListener) {
		this.stringListener = stringListener;
	}

	ActionListener I = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// name
			String name = nameField.getText();
			String occupation = occupationField.getText();
			AgeCategory ageCategory = new AgeCategory((String) ageList.getSelectedValue(), ageList.getSelectedIndex());
			EmpStatus empStatus=new EmpStatus(empComboBox.getSelectedIndex(),(String)empComboBox.getSelectedItem());
			
			FormEvent froEvent = new FormEvent(this, name, occupation, ageCategory,empStatus);
			// stringListener.textEmitter;
			
			

			if (formlistener != null) {
				formlistener.formEventOccured(froEvent);
			}
		}
	};

	public void layoutComponents() {

		setLayout(new GridBagLayout());

		GridBagConstraints gConstraints = new GridBagConstraints();

		gConstraints.gridy = 0;

		///// first row ////////
		gConstraints.weightx = 1;
		gConstraints.weighty = 0.1;

		// name label
		gConstraints.gridx = 0;

		gConstraints.fill = GridBagConstraints.NONE;
		gConstraints.anchor = gConstraints.LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);
		add(nameJLabel, gConstraints);

		// name field
		gConstraints.gridx = 1;
		gConstraints.gridy = 0;

		gConstraints.fill = GridBagConstraints.NONE;
		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);

		add(nameField, gConstraints);

		///// Second row ////////

		gConstraints.gridy++;

		gConstraints.weightx = 1;
		gConstraints.weighty = 0.1;

		// occupation label

		gConstraints.gridx = 0;
		gConstraints.anchor = gConstraints.LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);

		add(occupatoinJLabel, gConstraints);

		// occupation field
		gConstraints.gridx = 1;

		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gConstraints);

		///// Third Row/////

		gConstraints.gridy++;

		// list box
		gConstraints.gridx = 1;
		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);
		add(ageList, gConstraints);

		// list label

		gConstraints.gridx = 0;

		gConstraints.anchor = gConstraints.FIRST_LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);

		add(ageCategoryLabel, gConstraints);

		// Combo box Row

		gConstraints.gridy++;

		// combo box
		gConstraints.gridx = 1;
		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);
		add(empComboBox, gConstraints);

		// combo label
		gConstraints.gridx = 0;

		gConstraints.anchor = gConstraints.LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);

		add(empstatusLabel, gConstraints);
		
		
		/////check box row ///

		///// Button row ////////

		gConstraints.gridy++;

		gConstraints.weightx = 1;
		gConstraints.weighty = 2.0;

		// add submit button

		gConstraints.gridx = 1;
		gConstraints.anchor = gConstraints.FIRST_LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);

		add(okButton, gConstraints);

		// action listener to ok button

		okButton.addActionListener(I);

		Dimension dimension = getPreferredSize();
		dimension.width = 250;
		setPreferredSize(dimension);

	}

	public void setFormListener(FormListener formListener) {
		// TODO Auto-generated method stub
		this.formlistener = formListener;
	}
}

class AgeCategory {
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

class EmpStatus {

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
