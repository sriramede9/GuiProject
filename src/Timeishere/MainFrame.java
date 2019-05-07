package Timeishere;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private TextPanel textPanel;

	private Toolbar toolbar;

	public MainFrame() {
		super("Hello");
		// JFrame frame = new JFrame("Frame Name");

		setLayout(new BorderLayout());

		textPanel = new TextPanel();
		toolbar = new Toolbar();

		toolbar.setTextPanel(textPanel);

		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
