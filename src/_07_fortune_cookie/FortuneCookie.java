package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    JButton button = new JButton();
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
		}
	}
}