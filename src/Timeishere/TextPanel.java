package Timeishere;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	
	private JTextArea textArea;

	public TextPanel() {
		super();
		// TODO Auto-generated constructor stub
		textArea=new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}

	public void append(String string) {
		// TODO Auto-generated method stub
		textArea.append(string);
	}
	
	

}
