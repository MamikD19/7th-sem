/*<applet code=Blin.class width=400 height=300></applet>*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.Math;
public class Blin extends Applet implements Runnable
{
	Image imPic[];
	int i=0;
	Thread t;
	public void init()
	{
	imPic=new Image[2];
	imPic[0]=getImage(getCodeBase(),"1.gif");
	imPic[1]=getImage(getCodeBase(),"2.gif");
	}
	public void paint(Graphics g)
	{
	g.drawImage(imPic[i],10,20,this);
	}
	public void start()
	{
	t=new Thread(this);
	t.start();
	}
	public void stop()
	{
	t.stop();
	}
	public void run()
	{
	while(true)
	{
		repaint();
		i=(i==0)?1:0;
		try{
		t.sleep(2000);
		}
		catch(InterruptedException intr)
		{
		
		}
	
	}
	}
}