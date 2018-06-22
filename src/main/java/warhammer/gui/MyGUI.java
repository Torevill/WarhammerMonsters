package warhammer.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kryzhov, <a href="mailto:Konstantin.Ryzhov@returnonintelligence.com">Konstantin Ryzhov</a>
 * @since 22-Jun-18
 */


public class MyGUI extends JFrame {
	private JButton toMonsters = new JButton("Roll their Fate");
	private JButton exit = new JButton("Exit");
	//private JTextField input = new JTextField("", 5);
	//private JLabel label = new JLabel("Input:");
	private JRadioButton radio1 = new JRadioButton("Pink Horror normal (total random)");
	//private JRadioButton radio2 = new JRadioButton("Pink Horror cheated (random 20-75)");
	//private JCheckBox check = new JCheckBox("Check", false);

	public MyGUI() {
		super("Simple Example");
		this.setBounds(100, 100, 250, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
		//container.add(label);
		//container.add(input);

		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		//group.add(radio2);
		container.add(radio1);

		radio1.setSelected(true);

		//container.add(radio2);
		//container.add(check);
		toMonsters.addActionListener(new ToMonsterButtonEventListener());
		exit.addActionListener(new ExitButtonEventListener());
		container.add(toMonsters);
		container.add(exit);
	}



}
