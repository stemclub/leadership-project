package uiInterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import objects.DataStorage;
import objects.Tier;
import services.ProgressInGame;

public class ChoicesUI extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton Choice1 = new JButton("Choice 1");
	private JButton Choice2 = new JButton("Choice 2");
	private JButton Choice3 = new JButton("Choice 3");
	//private JButton Choice1 = new JButton("Choice 1" + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][0]);
	//private JButton Choice2 = new JButton("Choice 2" + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][1]);
	//private JButton Choice3 = new JButton("Choice 3" + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][2]);
	private JButton ReplayVideo = new JButton("Replay");
	private JPanel ChoicesPanel = new JPanel();
	public static char choice;
	private boolean replayVideo;
	private ButtonListener listener = new ButtonListener();
	public static Tier Tier;
	
	private int tier;
	private ProgressInGame n;
	private int event;
	
	public ChoicesUI(){
		setBackground(new Color(95, 158, 160));
		GridLayout theLayout = new GridLayout(2,2,50,50);
		setLayout(theLayout);
		Choice1.setForeground(new Color(255, 0, 0));
		
		Choice1.setBackground(Color.ORANGE);
		add(Choice1);
		Choice1.addActionListener(listener);
		System.out.println(Tier.getTierNumber());
		System.out.println(Tier.getNumberOfEvents());
		int c = Tier.getNumberOfEvents()-1;
		System.out.println(c);
		//System.out.println(DataStorage.choicesSubtitles[Tier.getTierNumber()][c][0]);
		//System.out.println("Choice 1: " + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][0]);
		Choice2.setForeground(new Color(255, 0, 255));
		
		add(Choice2);
		Choice2.addActionListener(listener);
		//System.out.println("Choice 2" + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][1]);
		Choice3.setForeground(new Color(0, 0, 255));
		
		add(Choice3);
		Choice3.addActionListener(listener);
		//System.out.println("Choice 3" + DataStorage.choicesSubtitles[Tier.getTierNumber()][Tier.getNumberOfEvents()-1][2]);
		ReplayVideo.setBackground(new Color(0, 128, 0));
		
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
			n.setTierDone(tier, event, choice, n);
			System.out.println(Tier.getTierNumber()+1);
			System.out.println(DataStorage.filePaths[Tier.getTierNumber()+1].length);
			Tier newTier = new Tier(Tier.getTierNumber()+1, DataStorage.filePaths[Tier.getTierNumber()+1].length);
			Tier = newTier;
			ProgressUI.Tier = newTier;
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

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public ProgressInGame getN() {
		return n;
	}

	public void setN(ProgressInGame n) {
		this.n = n;
	}

	public int getEvent() {
		return event;
	}

	public void setEvent(int event) {
		this.event = event;
	}
	
	
}
