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

				if (stringListener != null) {

					stringListener.textEmitter("HI ram\n");
				}
			} else {
				if (stringListener != null) {

					stringListener.textEmitter("Byeram\n");
				}
			}
		}

	};

	private StringListener stringListener;

	public void setStringListener(StringListener stringListener) {
		// TODO Auto-generated method stub
		this.stringListener = stringListener;
	}

}
