package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String imageAdress1 = "https://imgix.ranker.com/user_node_img/50026/1000504352/original/high-five-photo-u1?w=650&q=50&fm=pjpg&fit=crop&crop=faces;";
		// 2. create a variable of type "Component" that will hold your image
Component picture1;
		// 3. use the "createImage()" method below to initialize your Component
picture1=createImage(imageAdress1);
		// 4. add the image to the quiz window
quizWindow.add(picture1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans1 = JOptionPane.showInputDialog("What kind of dog is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(ans1.equalsIgnoreCase("pomeranian")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(picture1);
		// 10. find another image and create it (might take more than one line
		// of code)
String imageAdress2 = "https://images-na.ssl-images-amazon.com/images/I/510K%2BmJcGML._AC_SX425_.jpg";
		// 11. add the second image to the quiz window
Component picture2 = createImage(imageAdress2);
quizWindow.add(picture2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question

String ans2 = JOptionPane.showInputDialog("What kind of dog is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if(ans2.equalsIgnoreCase("pug")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
