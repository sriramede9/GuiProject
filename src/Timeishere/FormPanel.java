package Timeishere;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
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

	public FormPanel() {
		super();
		// TODO Auto-generated constructor stub

		nameJLabel = new JLabel("Name:");
		occupatoinJLabel = new JLabel("Occupation:");
		occupationField = new JTextField(10);
		nameField = new JTextField(10);
		okButton = new JButton("Submit");
		ageList = new JList();
		ageCategoryLabel=new JLabel("Age Category:");

		// list componenets

		DefaultListModel ageModel = new DefaultListModel();

		ageModel.addElement("under 18");
		ageModel.addElement("18-65");
		ageModel.addElement("65 or over");
		ageList.setModel(ageModel);
		ageList.setPreferredSize(new Dimension(110,60));
		// grid bag layout

		setLayout(new GridBagLayout());

		GridBagConstraints gConstraints = new GridBagConstraints();

		///// first row ////////
		gConstraints.weightx = 1;
		gConstraints.weighty = 0.1;

		// name label
		gConstraints.gridx = 0;
		gConstraints.gridy = 0;

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
		gConstraints.weightx = 1;
		gConstraints.weighty = 0.1;

		// occupation label

		gConstraints.gridx = 0;
		gConstraints.gridy = 1;
		gConstraints.anchor = gConstraints.LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);

		add(occupatoinJLabel, gConstraints);

		// occupation field
		gConstraints.gridx = 1;
		gConstraints.gridy = 1;
		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gConstraints);
		
		
		/////Third Row/////
		
		// list box
		gConstraints.gridx = 1;
		gConstraints.gridy = 2;
		gConstraints.anchor = gConstraints.LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);
		add(ageList, gConstraints);
		
		// list label
		
		gConstraints.gridx = 0;
		gConstraints.gridy = 2;
		gConstraints.anchor = gConstraints.FIRST_LINE_END;
		gConstraints.insets = new Insets(0, 0, 0, 5);

		add(ageCategoryLabel, gConstraints);
		
		
		
		

		///// Fourth row ////////

		gConstraints.weightx = 1;
		gConstraints.weighty = 2.0;

		// add submit button

		gConstraints.gridx = 1;
		gConstraints.gridy = 3;
		gConstraints.anchor = gConstraints.FIRST_LINE_START;
		gConstraints.insets = new Insets(0, 0, 0, 0);

		add(okButton, gConstraints);

		// action listener to ok button

		okButton.addActionListener(I);

		Dimension dimension = getPreferredSize();
		dimension.width = 250;
		setPreferredSize(dimension);
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
			Integer ageCategory=ageList.getSelectedIndex();

			FormEvent froEvent = new FormEvent(this, name, occupation,ageCategory);
			// stringListener.textEmitter;

			if (formlistener != null) {
				formlistener.formEventOccured(froEvent);
			}
		}
	};

	public void setFormListener(FormListener formListener) {
		// TODO Auto-generated method stub
		this.formlistener = formListener;
	}
}
