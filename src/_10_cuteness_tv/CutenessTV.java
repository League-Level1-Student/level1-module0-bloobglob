package _10_cuteness_tv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	JButton ducks = new JButton("Duck");
	JButton frogs = new JButton("Frog");
	JButton unicorns = new JButton("Unicorn");
	public void setButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(ducks);
		panel.add(frogs);
		panel.add(unicorns);
		frame.pack();
		frame.setVisible(true);
	}
}
