package Timeishere;

import java.awt.BorderLayout;

import javax.swing.JFrame;


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
		
		formPanel=new FormPanel();
		
		formPanel.setStringListener(new StringListener() {
			
			@Override
			public void textEmitter(String s) {
				// TODO Auto-generated method stub
				textPanel.append(s);
			}
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccured(FormEvent e) {
				String nameString=e.getName();
				String occupationString=e.getOccupation();
				String ageCategory=e.getAgeCategory().getAgecategory();
				String empstatus=e.getEmpStatus().getStatus();
				textPanel.append("Name : "+nameString+" \t"+"Occupation: "+occupationString+"\t"+"AgeCategory:"+ageCategory+"\t"+"Emp-Status:"+empstatus+"\t"+"\n");
			}
		});

		toolbar.setStringListener(new StringListener() {

			@Override
			public void textEmitter(String s) {
				// TODO Auto-generated method stub
				textPanel.append(s);
			} 
		});
		add(formPanel,BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
