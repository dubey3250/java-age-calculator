import  java.util.*;
import java.text.*;  
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//import java.util.Date; 
//import java.text.SimpleDateFormat;  
public class myframe3 extends JFrame implements ActionListener //, Runnable
{
	String strcur,msg;
	String strd,strm,stry,str1,str2;
	JTextField t1;
	int d,m,y,d1,m1,y1,cd,cm,cy,f;
	JButton b1[]=new JButton[20];
	String ch1,ch2,ch3,res;
	char ch[]={'1','2','3','4','5','6','7','8','9','0','=','C','/','-',':'};
	myframe3()
	{
	//returns current time with including hour,minute,second... 
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd:MM:yyyy");  
		strcur=formatter.format(date); 
		
		strd=strcur.substring(0,2);
		strm=strcur.substring(3,5);
		stry=strcur.substring(6,10);
			cd=Integer.parseInt(strd);
			cm=Integer.parseInt(strm);
			cy=Integer.parseInt(stry);
		//System.out.println(cy);  
		t1=new JTextField("Enter your DOB.",10);
		add(t1);
		setForeground(Color.blue);
		t1.setBackground(Color.pink);
		setTitle("Age Calculator...");
		
		  addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}}); //for closing  frame window
		  
		
	    for(int i=0;i<ch.length;i++)
		{
			b1[i]=new JButton(String.valueOf(ch[i]));
			add(b1[i]);
		}
		for(int i=0;i<ch.length;i++)
		{
			b1[i].setBackground(Color.black);
			b1[i].setForeground(Color.white);
		}
		setLayout(new GridLayout(4,3,10,10));
		//t1.setBounds(0,0,500,50);
		for(int i=0;i<ch.length;i++)
		{
			b1[i].addActionListener(this);
		}		
		setSize(700,300);
		setVisible(true);
		setResizable(false);
	}	
	public void actionPerformed(ActionEvent e)
	{
		str1=e.getActionCommand();
		str2=t1.getText()+str1;
		t1.setText(str2);
		if(e.getSource()==b1[10])
		{
			//t1.setText(" ");
			try
			{
				ch1=str2.substring(0,2);
				ch2=str2.substring(3,5);
				ch3=str2.substring(6,10);	
				
				d=Integer.parseInt(ch1);
				m=Integer.parseInt(ch2);
				y=Integer.parseInt(ch3);
				d1=cd-d;
				m1=cm-m;
				y1=cy-y;
				if(d1<0)
				{
					m1=m1-1;
					d1=(30-(-d1));
				}
				else if(m1<0)
				{
					y1=y1-1;
					m1=(12-(-m1));
				}
				t1.setText("year="+y1+" month="+m1+" day="+d1);
			}
			catch(Exception siobe)
			{
				f=1;
			}
			if(f==1)
			{
				ch1=str2.substring(0,1);
				ch2=str2.substring(2,3);
				ch3=str2.substring(4,8);
				
				d=Integer.parseInt(ch1);
				m=Integer.parseInt(ch2);
				y=Integer.parseInt(ch3);
				d1=cd-d;
				m1=cm-m;
				y1=cy-y;
				if(d1<0)
				{
					m1=m1-1;
					d1=(30-(-d1));
				}
				else if(m1<0)
				{
					y1=y1-1;
					m1=(12-(-m1));
				}
				t1.setText("year="+y1+" month="+m1+" day="+d1);
			}	
		}
		else if(e.getSource()==b1[11])
		{
			t1.setText("");
			str2="0";
		}
	} 
	/*public void fun()
	{
		System.out.println(" ");
	}*/
	public static void main(String[] args) 
	{
		new myframe3();
	}
}	