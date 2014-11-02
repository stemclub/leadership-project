package uiInterface;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FXMediaPlayer{
     
    private static final String MEDIA_URL = "file:///Volumes/Eddie%20Li%202/STEM%20Club/Videos/LeadItUp/1/a.mp4";
     
    private static void initFxLater(JFXPanel panel){
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720);
         
        // create media player
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
         
        // create mediaView and add media player to the viewer
        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group)scene.getRoot()).getChildren().add(mediaView);
         
        panel.setScene(scene);
    }
 
    public JFrame main(String[] args) {
    	JFrame jFrame = new JFrame("LeadItUp");
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                jFrame.setSize(1280, 720);
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                final JFXPanel jFXPanel = new JFXPanel();
                jFrame.add(jFXPanel);
                 
                Platform.runLater(new Runnable(){
         
                    @Override
                    public void run() {
                        initFxLater(jFXPanel);
                    }
                });
            }
             
        });
        return jFrame;
    }
}