package Timeishere;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame {

	private TextPanel textPanel;

	private Toolbar toolbar;

	private StringListener stringListener;

	private FormPanel formPanel;

	public MainFrame() {
		super("Hello");
		// JFrame frame = new JFrame("Frame Name");

		setLayout(new BorderLayout());

		textPanel = new TextPanel();
		toolbar = new Toolbar();

		formPanel = new FormPanel();

		setJMenuBar(createMenuBar());

		formPanel.setStringListener(new StringListener() {

			@Override
			public void textEmitter(String s) {
				// TODO Auto-generated method stub
				textPanel.append(s);
			}
		});

		formPanel.setFormListener(new FormListener() {
			public void formEventOccured(FormEvent e) {
				String nameString = e.getName();
				String occupationString = e.getOccupation();
				String ageCategory = e.getAgeCategory().getAgecategory();
				String empstatus = e.getEmpStatus().getStatus();
				String taxID = e.getTaxid();
				boolean isUscitizen = e.isUscitizen();
				String gendergroup = e.getGendergroup();
				textPanel.append("Name : " + nameString + " \t" + "Occupation: " + occupationString + "\t"
						+ "AgeCategory:" + ageCategory + "\t" + "Emp-Status:" + empstatus + "\t" + "tax Id:" + taxID
						+ "\t" + "is UsCitizen:" + isUscitizen + "\t" + "Gender group:" + gendergroup + "\t" + "\n");
			}
		});

		toolbar.setStringListener(new StringListener() {

			@Override
			public void textEmitter(String s) {
				// TODO Auto-generated method stub
				textPanel.append(s);
			}
		});
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		setSize(600, 500);
		setMinimumSize(new Dimension(500,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu windowMenu = new JMenu("Window");

		JMenuItem exportdataItem = new JMenuItem("Export Data...");
		JMenuItem importdataItem = new JMenuItem("Import Data...");
		JMenuItem exitItem = new JMenuItem("Exit");

		fileMenu.add(exportdataItem);
		fileMenu.add(importdataItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		JMenu showMenu = new JMenu("Show");
		JCheckBoxMenuItem showFormItem = new JCheckBoxMenuItem("Person Form");

		showFormItem.setSelected(true);

		showMenu.add(showFormItem);
		windowMenu.add(showMenu);

		menuBar.add(fileMenu);
		menuBar.add(windowMenu);

		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

//				String text = JOptionPane.showInputDialog(MainFrame.this, "Enter your user name.", "Enter User Name",
//						JOptionPane.OK_OPTION | JOptionPane.INFORMATION_MESSAGE);

				//System.out.println(text);// we can retrieve text

				// TODO Auto-generated method stub
				int action = JOptionPane.showConfirmDialog(MainFrame.this, "Are you sure to exit?", "Confirm exit",
						JOptionPane.OK_CANCEL_OPTION);

				if (action == JOptionPane.OK_OPTION) {
					System.exit(0);
				}

				// System.exit(0);
			}
		});

		showFormItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JCheckBoxMenuItem menutItem = (JCheckBoxMenuItem) e.getSource();
				formPanel.setVisible(menutItem.isSelected());
			}
		});

		return menuBar;
	}
}
