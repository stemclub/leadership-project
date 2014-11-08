package uiInterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChoicesUI extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton Choice1 = new JButton("Choice 1");
	private JButton Choice2 = new JButton("Choice 2");
	private JButton Choice3 = new JButton("Choice 3");
	private JButton ReplayVideo = new JButton("Replay");
	private JPanel ChoicesPanel = new JPanel();
	public static char choice;
	private boolean replayVideo;
	private ButtonListener listener = new ButtonListener();
	
	public ChoicesUI(){
		GridLayout theLayout = new GridLayout(2,2,50,50);
		setLayout(theLayout);
		
		Choice1.setBackground(Color.ORANGE);
		add(Choice1);
		Choice1.addActionListener(listener);
		
		add(Choice2);
		Choice2.addActionListener(listener);
		
		add(Choice3);
		Choice3.addActionListener(listener);
		
		add(ReplayVideo);
		ReplayVideo.addActionListener(listener);
		
	}
	
	public JFrame runUI(){
		JFrame frame = new JFrame();
		frame.getContentPane().add(ChoicesPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(false);	
        return frame;
	}
	
	public JPanel getChoicesPanel() {
		return ChoicesPanel;
	}

	public void setChoicesPanel(JPanel choicesPanel) {
		ChoicesPanel = choicesPanel;
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
			System.out.println(choice);
			System.out.println(replayVideo);
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
