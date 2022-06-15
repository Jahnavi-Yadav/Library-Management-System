package library_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.sql.*;

public class Home extends JFrame implements ActionListener{
private JPanel contentpane;
private JButton b1,b2,b3,b4,b5,b6;
public static void main(String[] args) {
	// TODO Auto-generated method stub
new Home().setVisible(true);
}
public Home()
{
	setBounds(100,150,500,150);
	contentpane=new JPanel();
	contentpane.setLayout(null);
	setContentPane(contentpane);
	
	JMenuBar menubar=new JMenuBar();
	menubar.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
	menubar.setBackground(Color.cyan);
	menubar.setBounds(0,10,1000,35);
	contentpane.add(menubar);
	
	JMenu mnexit=new JMenu("Exit");
	mnexit.setFont(new Font("Trebuchet MS",Font.BOLD,17));
	

	
	

	JMenuItem mlogout=new JMenuItem("Logout");
	mlogout.setBackground(new Color(211,211,211));
	mlogout.setForeground(new Color(105,105,105));
	mlogout.addActionListener((ActionListener) this);
	mnexit.add(mlogout);
	
	JMenuItem mexit=new JMenuItem("Exit");
	mexit.setBackground(new Color(211,211,211));
	mexit.setForeground(new Color(105,105,105));
	mexit.addActionListener((ActionListener)this);
	mnexit.add(mexit);
	
	JMenu mhelp=new JMenu("Help");
	mhelp.setFont(new Font("Trebuchet MS",Font.BOLD,17));
	
	JMenuItem mreadme=new JMenuItem("Read Me");
	mreadme.setBackground(new Color(211,211,211));
	mreadme.setForeground(new Color(105,105,105));
	mreadme.addActionListener((ActionListener)this);
	mhelp.add(mreadme);
	
	JMenuItem maboutus=new JMenuItem("About Us");
	maboutus.setBackground(new Color(211,211,211));
	maboutus.setForeground(new Color(105,105,105));
	maboutus.addActionListener((ActionListener)this);
	mhelp.add(maboutus);
	
	JMenu mrecord=new JMenu("Record");
	mrecord.setFont(new Font("Trebuchet MS",Font.BOLD,17));
	
	JMenuItem mbookdetails=new JMenuItem("Book Details");
	mbookdetails.setBackground(new Color(211,211,211));
	mbookdetails.setForeground(Color.DARK_GRAY);
	mbookdetails.addActionListener((ActionListener)this);
	mrecord.add(mbookdetails);
	
	JMenuItem mstudetails=new JMenuItem("Student Details");
	mstudetails.setBackground(new Color(211,211,211));
	mstudetails.setForeground(Color.DARK_GRAY);
	mstudetails.addActionListener((ActionListener)this);
	mrecord.add(mstudetails);
	
	menubar.add(mrecord);
	menubar.add(mhelp);
	menubar.add(mnexit);
	
	JLabel L1=new JLabel("Library Management System");
	L1.setForeground(new Color(204,51,102));
	L1.setFont(new Font("Segoe UI Semilight",Font.BOLD,30));
	L1.setBounds(268,30,701,80);
	contentpane.add(L1);
	
	JLabel L2=new JLabel("");
	L2.setVerticalAlignment(SwingConstants.TOP);
	ImageIcon i1=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\second.png");
	Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	L2=new JLabel(i3);
	L2.setBounds(60,140,159,152);
	contentpane.add(L2);
	
	JLabel L3=new JLabel("");
	ImageIcon i4=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\third.png");
	Image i5=i4.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
	ImageIcon i6=new ImageIcon(i5);
	L3=new JLabel(i6);
	L3.setBounds(300,160,134,128);
	contentpane.add(L3);
	
	JLabel L4=new JLabel("");
	ImageIcon i7=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\fourth.png");
	Image i8=i7.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	ImageIcon i9=new ImageIcon(i8);
	L4=new JLabel(i9);
	L4.setBounds(530,140,225,152);
	contentpane.add(L4);
	
	b1=new JButton("Add Books");
	b1.addActionListener((ActionListener)this);
	b1.setForeground(Color.white);
	b1.setBackground(Color.black);
	b1.setBounds(60,320,159,44);
	contentpane.add(b1);
	
	b2=new JButton("Statistics");
	b2.addActionListener((ActionListener)this);
	b2.setForeground(Color.white);
	b2.setBackground(Color.black);
	b2.setBounds(313,320,139,44);
	contentpane.add(b2);
	
	b3=new JButton("Add Student");
	b3.addActionListener((ActionListener)this);
	b3.setBackground(Color.black);
	b3.setForeground(Color.white);
    b3.setBounds(562,320,167,44);
	contentpane.add(b3);
	
	JPanel p10=new JPanel();
	p10.setBorder(new TitledBorder(new LineBorder(new Color(250,128,114),2),"Operation",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(220,20,60)));
	p10.setBounds(20,120,750,260);
	p10.setBackground(Color.white);
	contentpane.add(p10);
	
	b4=new JButton("Issue Book");
	b4.addActionListener((ActionListener)this);
	b4.setForeground(Color.white);
	b4.setBackground(Color.black);
	b4.setBounds(76,620,143,41);
	contentpane.add(b4);
	
	b5=new JButton("Return Book");
	b5.addActionListener((ActionListener)this);
	b5.setForeground(Color.white);
	b5.setBackground(Color.black);
	b5.setBounds(310,620,159,41);
	contentpane.add(b5);
	
	b6=new JButton("About Us");
	b6.addActionListener((ActionListener)this);
	b6.setForeground(Color.white);
	b6.setBackground(Color.black);
	b6.setBounds(562,620,159,41);
	contentpane.add(b6);
	
	JLabel L5=new JLabel("");
	ImageIcon i10=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\fifth.png");
	Image i11=i10.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	ImageIcon i12=new ImageIcon(i11);
	L5=new JLabel(i12);
	L5.setBounds(60,440,159,163);
	contentpane.add(L5);
	
	JLabel L6=new JLabel("");
	ImageIcon i13=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\sixth.png");
	Image i14=i13.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	ImageIcon i15=new ImageIcon(i14);
	L6=new JLabel(i15);
	L6.setBounds(332,440,139,152);
	contentpane.add(L6);
	
	JLabel L7=new JLabel("");
	ImageIcon i16=new ImageIcon("C:\\Users\\jahna\\Downloads\\Library-Management-System-master\\Library-Management-System\\src\\library\\management\\system\\icons\\seventh.png");
	Image i17=i16.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	ImageIcon i18=new ImageIcon(i17);
	L7=new JLabel(i18);
	L7.setBounds(562,440,157,152);
	contentpane.add(L7);
	
	JPanel p11=new JPanel();
	p11.setBorder(new TitledBorder(new LineBorder(new Color(205,133,63),2),"Action",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(233,150,122)));
	p11.setBounds(20,420,750,270);
	p11.setBackground(Color.white);
	contentpane.add(p11);
	
	getContentPane().setBackground(Color.white);
	contentpane.setBackground(Color.white);
}
public void actionPerformed(ActionEvent ae)
{
	String msg=ae.getActionCommand();
	if(msg.equals("Logout")) 
	{
		setVisible(false);
		new Login_user().setVisible(true);
	}else if(msg.equals("Exit"))
	{
		System.exit(ABORT);
	}
	else if(msg.equals("Read Me"))
	{
	
	}else if(msg.equals("About Us"))
	{
		new Aboutus().setVisible(true);
	}else if(msg.equals("Book Details"))
	{
		setVisible(false);
		new BookDetails().setVisible(true);
	}else if(msg.equals("Student Details"))
	{
		setVisible(false);
		new StudentDetails().setVisible(true);
	}
	if(ae.getSource()==b1)
	{
		this.setVisible(false);
		new AddBook().setVisible(true);
	}
	if(ae.getSource()==b2)
	{
		this.setVisible(false);
		new Statistics().setVisible(true);
	}
	if(ae.getSource()==b3)
	{
		this.setVisible(false);
		new AddStudent().setVisible(true);
	}
	if(ae.getSource()==b4)
	{
		this.setVisible(false);
		new IssueBook().setVisible(true);
	}
	if(ae.getSource()==b5)
	{
		this.setVisible(false);
		new ReturnBook().setVisible(true);
	}
	if(ae.getSource()==b6)
	{
		this.setVisible(false);
		new Aboutus().setVisible(true);
	}
}


	
	
}

