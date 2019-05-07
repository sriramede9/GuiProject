package Timeishere;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	private JButton hiButton;
	private JButton byeButton;

	public Toolbar() {
		super();
		// TODO Auto-generated constructor stub
		hiButton = new JButton("Hi");
		byeButton = new JButton("Bye");

		setLayout(new FlowLayout());

		add(hiButton);
		add(byeButton);

		hiButton.addActionListener(l);
		byeButton.addActionListener(l);

	}

	ActionListener l = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton clicked = (JButton) e.getSource();

			if (clicked == hiButton) {
				textPanel.append("HI ram\n");
			} else {
				textPanel.append("Bye ram\n");
			}
		}

	};
	private TextPanel textPanel;

	public void setTextPanel(TextPanel textPanel) {
		// TODO Auto-generated method stub
		this.textPanel = textPanel;
	}

}
