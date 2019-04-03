import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private String country;
	private JButton btn1,btn2,btn3,btn4,btn5;
	private String str="vietnam.png";
	private JLabel pic = new JLabel(new ImageIcon(str));
	public static void main(String []args)
	{
		MyFrame m1=new MyFrame("Learn Java");
	}
	public MyFrame(String name) {
		this.setTitle(name);
		AddInterface();
		showView();
		addEvent();
	}
	public void showView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(500,400);
	}
	public void AddInterface() {
		Container con=getContentPane();
		JPanel pnMain=new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnOption=new JPanel();
		pnOption.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btnPrint=new JButton(new ImageIcon("icon.png"));
		JButton btnSave=new JButton(new ImageIcon("icon1.png"));
		pnOption.add(btnPrint);
		pnOption.add(btnSave);
		pnOption.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnMain.add(pnOption);
		pnOption.setSize(new Dimension(0,10));
		
		JPanel pnNext=new JPanel();
		pnNext.setLayout(new BoxLayout(pnNext, BoxLayout.X_AXIS));
		pnMain.add(pnNext);
		
		JPanel pnImage=new JPanel();
		pnImage.setLayout(new BoxLayout(pnImage, BoxLayout.X_AXIS));
		pnImage.add(pic);
		pnNext.add(pnImage);
		
		JPanel pnChange=new JPanel();
		pnChange.setLayout(new BoxLayout(pnChange, BoxLayout.Y_AXIS));
		btn1=new JButton("England");
		btn2=new JButton("France");
		btn3=new JButton("Viet Nam");
		btn4=new JButton("Swizerland");
		btn5=new JButton("Japan");
		pnChange.add(btn1);
		pnChange.add(btn2);
		pnChange.add(btn3);
		pnChange.add(btn4);
		pnChange.add(btn5);
		pnNext.add(pnChange);
	}
	public void addEvent() {
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				str="england.png";
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				str="France.png";
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				str="vietnam.png";
			}
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				str="swizerland.gif";
			}
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str="Japan.png";
			}
		});
	}
}
