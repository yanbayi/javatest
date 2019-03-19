package ti;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InterruptibleSocketTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			JFrame frame = new InterruptibleSocketFrame();
			frame.setTitle("interrupt");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);		
			});
	}
}

class InterruptibleSocketFrame extends JFrame{
	private Scanner in;
	private JButton interruptibleButton;
	private JButton blockingButton;
	private JButton cancelButton;
	private JTextArea messages;

	private Thread connectThread;
	public InterruptibleSocketFrame() {
		
		
		
	}
}
