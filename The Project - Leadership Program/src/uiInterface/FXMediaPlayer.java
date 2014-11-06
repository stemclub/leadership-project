package uiInterface;

import java.net.URL;
import java.net.URLDecoder;
import java.util.logging.Logger;

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
	private String mediaURLInput, binMediaURLInput;
	public String getMediaURLInput() {
		return mediaURLInput;
	}

	public void setMediaURLInput(String mediaURLInput) {
		this.mediaURLInput = mediaURLInput;
	}

	public String getBinMediaURLInput() {
		return binMediaURLInput;
	}

	public void setBinMediaURLInput(String binMediaURLInput) {
		this.binMediaURLInput = binMediaURLInput;
	}

	final static Logger logger = Logger.getLogger("test");
    //private static final String MEDIA_URL = "file:///Volumes/Eddie%20Li%202/STEM%20Club/Videos/LeadItUp/1/a.mp4";
	//private static final String MEDIA_URL = "";
     
    private void initFxLater(JFXPanel panel){
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720);
         
        // create media player
        
        URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
        int index = url.getFile().lastIndexOf("/");
        String path = url.getFile().substring(0, index);
        String mediaURL = "file://" + path + mediaURLInput;
        if(path.endsWith("bin")) {
        	int index2 = path.lastIndexOf("/");
        	path = path.substring(0,  index2);
        	mediaURL = "file://" + path + binMediaURLInput;
        }
        Media media = new Media(mediaURL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
         
        // create mediaView and add media player to the viewer
        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group)scene.getRoot()).getChildren().add(mediaView);
         
        panel.setScene(scene);
    }
 
    public JFrame main(String[] args) {
    	URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
    	logger.info(url.getFile());
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