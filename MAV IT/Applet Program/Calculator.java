/*<applet code=Calculator.class width=200 height=200></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener
{

TextField tf = new TextField(18);
Button bt=new Button("1");
Button bt1=new Button("2");
Button bt2=new Button("3");
Button bt3=new Button("4");
Button bt4=new Button("5");
Button bt5=new Button("6");
Button bt6=new Button("7");
Button bt7=new Button("8");
Button bt8=new Button("9");
Button bt9=new Button("0");
Button bt10=new Button("+");
Button bt11=new Button("-");
Button bt12=new Button("*");
Button bt13=new Button("/");
Button bt14=new Button("=");
Button bt15=new Button("Clear");
int x,y,z;
int op;

public void init()
{

add (tf);
add (bt);
add (bt1);
add (bt2);
add (bt3);
add (bt4);
add (bt5);
add (bt6);
add (bt7);
add (bt8);
add (bt9);
add (bt10);
add (bt11);
add (bt12);
add (bt13);
add (bt14);
add(bt15);

bt.addActionListener(this);
bt1.addActionListener(this);
bt2.addActionListener(this);
bt3.addActionListener(this);
bt4.addActionListener(this);
bt5.addActionListener(this);
bt6.addActionListener(this);
bt7.addActionListener(this);
bt8.addActionListener(this);
bt9.addActionListener(this);
bt10.addActionListener(this);
bt11.addActionListener(this);
bt12.addActionListener(this);
bt13.addActionListener(this);
bt14.addActionListener(this);
bt15.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{

if (e.getSource()==bt)
{
tf.setText(tf.getText()+"1");
}

if (e.getSource()==bt5)
{
tf.setText(tf.getText()+"6");
}

if (e.getSource()==bt1)
{
tf.setText(tf.getText()+"2");
}

if (e.getSource()==bt2)
{
tf.setText(tf.getText()+"3");
}

if (e.getSource()==bt3)
{
tf.setText(tf.getText()+"4");
}

if (e.getSource()==bt4)
{
tf.setText(tf.getText()+"5");
}

if (e.getSource()==bt6)
{
tf.setText(tf.getText()+"7");
}

if (e.getSource()==bt7)
{
tf.setText(tf.getText()+"8");
}

if (e.getSource()==bt8)
{
tf.setText(tf.getText()+"9");
}

if (e.getSource()==bt9)
{
tf.setText(tf.getText()+"0");
}

if (e.getSource()==bt10)
{
x=Integer.parseInt(tf.getText());
tf.setText("");
op=1;
}

if (e.getSource()==bt11)
{
x=Integer.parseInt(tf.getText());
tf.setText("");
op=2;
}
if (e.getSource()==bt12)
{
x=Integer.parseInt(tf.getText());
tf.setText("");
op=3;
}

if (e.getSource()==bt13)
{
x=Integer.parseInt(tf.getText());
tf.setText("");
op=4;
}
if (e.getSource()==bt15)
{
tf.setText("");
}

if (e.getSource()==bt14)
{

y=Integer.parseInt(tf.getText());
if(op==1)
z=x+y;
else if(op==2)
z=x-y;
else if(op==3)
z=x*y;
else if(op==4)
z=x/y;

tf.setText(""+ z);
}
}
}