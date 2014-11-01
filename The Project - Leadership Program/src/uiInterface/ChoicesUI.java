package uiInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoicesUI extends JFrame{
	private JButton Choice1 = new JButton("Choice 1");
	private JButton Choice2 = new JButton("Choice 2");
	private JButton Choice3 = new JButton("Choice 3");
	private JButton ReplayVideo = new JButton("Replay");
	public JPanel ChoicesPanel = new JPanel();
	public static char choice;
	public static boolean replayVideo;
	
	public ChoicesUI(){
		ChoicesPanel.add(Choice1);
		JFrame frame = new JFrame();
		frame.add(ChoicesPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == Choice1){
				choice = 'a';
				replayVideo = false;
			}
			else if(arg0.getSource() == Choice2){
				choice = 'b';
				replayVideo = false;
			}
			else if(arg0.getSource() == Choice3){
				choice = 'c';
				replayVideo = false;
			}
			else if(arg0.getSource() == ReplayVideo){
				replayVideo = true;
			}
		}
	}
}
