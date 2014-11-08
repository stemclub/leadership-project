package uiInterface;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class RunUI extends JFrame{
	private JTabbedPane mainView = new JTabbedPane();
	private ProgressUI homeScreen = new ProgressUI();
	private ChoicesUI choicesScreen = new ChoicesUI();
	private JFrame frame = new JFrame();
	
	public RunUI(){
		mainView.addTab("Home", homeScreen);
		mainView.addTab("Choices", choicesScreen);
		//JFrame frame = new JFrame();
		frame.getContentPane().add(mainView);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);	
	}
	
	public void TabUIBuilder(String name, Component component){
		mainView.addTab(name, component);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
