package uiInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoicesUI extends JPanel{
	private JButton Choice1 = new JButton("Choice 1");
	private JButton Choice2 = new JButton("Choice 2");
	private JButton Choice3 = new JButton("Choice 3");
	private JButton ReplayVideo = new JButton("Replay");
	//public static JPanel ChoicesPanel = new JPanel();
	private char choice;
	private boolean replayVideo;
	private ButtonListener listener = new ButtonListener();
	
	public ChoicesUI(){
		Choice1.setBackground(Color.ORANGE);
		this.add(Choice1);
		Choice1.addActionListener(listener);
		this.add(Choice2);
		Choice2.addActionListener(listener);
		this.add(Choice3);
		this.add(ReplayVideo);
		ReplayVideo.addActionListener(listener);
		Choice3.addActionListener(listener);
	}
	
	public static void runUI(ChoicesUI x){
		JFrame frame = new JFrame();
		//frame.getContentPane().add(ChoicesUI());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);	
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == Choice1){
				choice = 'a';
				replayVideo = false;
				System.out.println("CHOSEN: Choice 1");
			}
			else if(arg0.getSource() == Choice2){
				choice = 'b';
				replayVideo = false;
				System.out.println("CHOSEN: Choice 2");
			}
			else if(arg0.getSource() == Choice3){
				choice = 'c';
				replayVideo = false;
				System.out.println("CHOSEN: Choice 3");
			}
			else if(arg0.getSource() == ReplayVideo){
				replayVideo = true;
				System.out.println("CHOSEN: Replay");
			}
		}
	}
	public boolean isReplayVideo() {
		return replayVideo;
	}
	public void setReplayVideo(boolean replayVideo) {
		this.replayVideo = replayVideo;
	}
	public ButtonListener getListener() {
		return listener;
	}
	public void setListener(ButtonListener listener) {
		this.listener = listener;
	}
}
