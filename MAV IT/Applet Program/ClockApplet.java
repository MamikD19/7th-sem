/*<applet code=ClockApplet.class width=150 height=150></applet>*/
import java.applet.*;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable{
  Thread t;
  public void start(){
  t = new Thread(this);
  t.start();
  }
  
  public void run(){

  while(true){
  repaint();
  try{
  t.sleep(1000);  
  }catch(InterruptedException e){}
  }
  }

  public void paint(Graphics g){
  Calendar cal = new GregorianCalendar();
  String hour = String.valueOf(cal.get(Calendar.HOUR));
  String minute = String.valueOf(cal.get(Calendar.MINUTE));
  String second = String.valueOf(cal.get(Calendar.SECOND));
  g.drawString(hour + ":" + minute + ":" + second, 20, 30);
  }
}