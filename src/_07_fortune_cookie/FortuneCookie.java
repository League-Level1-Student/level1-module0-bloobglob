package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    JButton button = new JButton("Click me!");
    public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == button) {
			JOptionPane.showMessageDialog(null, "Woohoo!");
			int rand = new Random().nextInt(5);
			if(rand==0) {
				JOptionPane.showMessageDialog(null, "You will soon be rich!");
			}else if(rand==1) {
				JOptionPane.showMessageDialog(null, "You will soon become famouse!");
			}else if(rand==2) {
				JOptionPane.showMessageDialog(null, "You will move to your dream house!");
			}else if(rand==3) {
				JOptionPane.showMessageDialog(null, "You will go on vacation!");
			}else if(rand==4) {
				JOptionPane.showMessageDialog(null, "You will get an A++++++ on your next test!");
			}
		}
	}
}