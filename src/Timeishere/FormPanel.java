package Timeishere;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel {

	private JLabel nameJLabel;
	private JLabel occupatoinJLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okButton;

	public FormPanel() {
		super();
		// TODO Auto-generated constructor stub

		nameJLabel = new JLabel("Name:");
		occupatoinJLabel = new JLabel("Occupation:");
		occupationField=new JTextField(10);
		nameField = new JTextField(10);
		okButton = new JButton("Submit");
		
		//grid bag layout
		
		
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gConstraints=new GridBagConstraints();
		
		///// first row ////////
		gConstraints.weightx=1;
		gConstraints.weighty=0.1;
		
		
		// name label
		gConstraints.gridx=0;
		gConstraints.gridy=0;
		
		gConstraints.fill=GridBagConstraints.NONE;
		gConstraints.anchor=gConstraints.LINE_END;
		gConstraints.insets=new Insets(0, 0, 0,5);
		add(nameJLabel,gConstraints);
		
		//name field
		gConstraints.gridx=1;
		gConstraints.gridy=0;
		
		gConstraints.fill=GridBagConstraints.NONE;
		gConstraints.anchor=gConstraints.LINE_START;
		gConstraints.insets=new Insets(0, 0, 0,0);
		
		add(nameField,gConstraints);
		
		
	///// Second row ////////
		gConstraints.weightx=1;
		gConstraints.weighty=0.1;
		
		//occupation label
		
		gConstraints.gridx=0;
		gConstraints.gridy=1;
		gConstraints.anchor=gConstraints.LINE_END;
		gConstraints.insets=new Insets(0, 0, 0,5);
		
		add(occupatoinJLabel,gConstraints);
		
		
		
		
		//occupation field
		gConstraints.gridx=1;
		gConstraints.gridy=1;
		gConstraints.anchor=gConstraints.LINE_START;
		gConstraints.insets=new Insets(0, 0, 0,0);
		add(occupationField,gConstraints);
		
		
		
		///// Thrid row ////////

		gConstraints.weightx=1;
		gConstraints.weighty=2.0;
		
		//add submit button
		
		gConstraints.gridx=1;
		gConstraints.gridy=2;
		gConstraints.anchor=gConstraints.FIRST_LINE_START;

		
		add(okButton,gConstraints);
		
		
		Dimension dimension = getPreferredSize();
		dimension.width = 250;
		setPreferredSize(dimension);
	}

}
