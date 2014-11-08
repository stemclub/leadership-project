package uiInterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import objects.DataStorage;
import objects.Tier;
import services.ProgressInGame;

public class ProgressUI extends JPanel{
	private final JLabel scoreLead = new JLabel("Your Score:");
	private final JLabel score = new JLabel("Score");
	private final Tier testTier = new Tier(0,0);
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
					testTier.initializeEvents();
					testTier.openVideo(n, DataStorage.hi);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add(play);
	}

}
