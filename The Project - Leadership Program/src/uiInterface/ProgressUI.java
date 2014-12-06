package uiInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import objects.DataStorage;
import objects.Tier;
import services.ProgressInGame;

public class ProgressUI extends JPanel{
	private final JLabel scoreLead = new JLabel("Your Score:");
	private final JLabel score = new JLabel("Score");
	public static Tier Tier;
	public static int tierNumber;
	public static int d;
	public static JFrame frame;
	public static boolean done;
	private final ProgressInGame n = new ProgressInGame();
	public ProgressUI() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel welcome = new JLabel("Your Progress:");
		add(welcome);
		
		JLabel progress = new JLabel("Progress");
		add(progress);
		add(scoreLead);
		add(score);
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println(Tier.getTierNumber());
					Tier.initializeEvents();
					frame = Tier.openVideo(n, DataStorage.hi);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				done = true;
			}
		});
		add(play);
	}
	public Tier getTier() {
		return Tier;
	}
	public void setTier(Tier tier) {
		Tier = tier;
	}

}
