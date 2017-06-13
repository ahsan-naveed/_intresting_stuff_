// Adapted from "Java Software Solutions"
import javax.swing.JFrame;

public class Button{
	public static void main(String[] args){
		JFrame frame = new JFrame("Click here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PushCounterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}