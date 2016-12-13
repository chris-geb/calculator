package Taschenrechner;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frontend extends JFrame implements ActionListener {
	private JTextField ergebnisFeld;

	private JButton zahl0;
	private JButton zahl1;
	private JButton zahl2;
	private JButton zahl3;
	private JButton zahl4;
	private JButton zahl5;
	private JButton zahl6;
	private JButton zahl7;
	private JButton zahl8;
	private JButton zahl9;

	private JButton komma;

	private JButton plus;
	private JButton minus;
	private JButton mal;
	private JButton geteillt;
	private JButton cleanButton;

	public void drawWindow() {
		this.setTitle("Taschenrechner");
		this.setSize(500, 500);

		JPanel content = new JPanel(new GridLayout(0, 3));

		ergebnisFeld = new JTextField();

		zahl7 = new JButton("7");
		zahl7.addActionListener(this);
		content.add(zahl7);

		zahl8 = new JButton("8");
		zahl8.addActionListener(this);
		content.add(zahl8);

		zahl9 = new JButton("9");
		zahl9.addActionListener(this);
		content.add(zahl9);

		zahl4 = new JButton("4");
		zahl4.addActionListener(this);
		content.add(zahl4);

		zahl5 = new JButton("5");
		zahl5.addActionListener(this);
		content.add(zahl5);

		zahl6 = new JButton("6");
		zahl6.addActionListener(this);
		content.add(zahl6);

		zahl1 = new JButton("1");
		zahl1.addActionListener(this);
		content.add(zahl1);

		zahl2 = new JButton("2");
		zahl2.addActionListener(this);
		content.add(zahl2);

		zahl3 = new JButton("3");
		zahl3.addActionListener(this);
		content.add(zahl3);

		zahl0 = new JButton("0");
		zahl0.addActionListener(this);
		content.add(zahl0);

		komma = new JButton(".");
		komma.addActionListener(this);
		content.add(komma);

		this.add(ergebnisFeld, BorderLayout.NORTH);
		this.add(content);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String eingabe = ergebnisFeld.getText();
		String zahl = "0";
		if (zahl0 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "0");
		} else if (zahl1 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "1");
		} else if (zahl2 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "2");
		} else if (zahl3 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "3");
		} else if (zahl4 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "4");
		} else if (zahl5 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "5");
		} else if (zahl6 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "6");
		} else if (zahl7 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "7");
		} else if (zahl8 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "8");
		} else if (zahl9 == e.getSource()) {
			ergebnisFeld.setText(eingabe + "9");
		} else if (komma == e.getSource()) {

		} else if (plus == e.getSource()) {

		}
	}
}