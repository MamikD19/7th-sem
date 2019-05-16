/*<applet code=TimerApplet.class width=150 height=150></applet>*/
import java.applet.*;
import java.awt.*;
import java.util.*;

public class TimerApplet extends Applet implements Runnable{
  Thread t;int Count;String s;
 
  public void start(){
  t=new Thread(this);
  Count=5;
  t.start();
  }
  public void run()
  {
   while(Count!=0)
   {
    try{
   t.sleep(1000);
  }catch(InterruptedException e){}
   Count--;
   repaint();
  }
   t.stop(); 
   
    }
   public void paint(Graphics g)
{
   if(Count!=0){
   s=String.valueOf(Count);
   g.drawString("Time Remain :"+s,20,30);}
	else
   g.drawString("Time UP",20,30);

  }
   
}