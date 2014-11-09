package uiInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class RunUI extends JFrame{
	private JTabbedPane mainView = new JTabbedPane();
	private ProgressUI homeScreen = new ProgressUI();
	public static ChoicesUI choicesScreen = new ChoicesUI();
	JFrame frame = new JFrame();
	
	public RunUI(){
		mainView.addTab("Home", homeScreen);
		mainView.addTab("Choices", choicesScreen);
		frame.getContentPane().add(mainView);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);	
 
	}
	
	public void TabUIBuilder(String name, JPanel component){
		mainView.addTab(name, component);
		frame.setVisible(false);
		frame.getContentPane().remove(mainView);
		frame.getContentPane().add(mainView);
		frame.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
