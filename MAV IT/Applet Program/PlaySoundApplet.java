/*<applet code=PlaySoundApplet.class width=300 height=300></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PlaySoundApplet extends Applet implements ActionListener{
  Button play,stop;
  AudioClip a;

  public void init(){
  play = new Button("  Play in Loop  ");
  add(play);
  play.addActionListener(this);
  stop = new Button("  Stop  ");
  add(stop);
stop.addActionListener(this);
  a = getAudioClip(getCodeBase(), "new2.wav");
  }
  
  public void actionPerformed(ActionEvent ae)
 {
  Button source = (Button)ae.getSource();
System.out.println(source);
  if (source.getLabel() == "  Play in Loop  "){
  a.play();
  }
  else if(source.getLabel() == "  Stop  "){
  a.stop();
  }
  }
}