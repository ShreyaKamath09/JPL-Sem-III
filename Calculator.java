import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	Frame f1;
	Label l1, l2, l3, l4;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4, b5;
	
	Calculator()
	{
		f1 = new Frame("Calculator");
		
		Font fn1 = new Font("Arial",Font.BOLD, 26);
		
		l1 = new Label("CALCULATOR");
		l1.setBounds(100,50,200,40);
		l1.setFont(fn1);
		f1.add(l1);
		
		l2 = new Label("Enter First No:");
		l2.setBounds(50,150,100,20);
		f1.add(l2);
		
		t1 = new TextField();
		t1.setBounds(200,150,100,20);
		f1.add(t1);
		
		l3 = new Label("Enter Second No:");
		l3.setBounds(50,190,100,20);
		f1.add(l3);
		
		t2 = new TextField();
		t2.setBounds(200,190,100,20);
		f1.add(t2);
		
		l4 = new Label("Result:");
		l4.setBounds(50,230,100,20);
		f1.add(l4);
		
		t3 = new TextField();
		t3.setBounds(200,230,100,20);
		f1.add(t3);
		
		b1 = new Button("Add");
		b1.setBounds(50,250,50,20);
		f1.add(b1);
		b1.addActionListener(this);
		
		b2 = new Button("Subtract");
		b2.setBounds(110,250,50,20);
		f1.add(b2);
		b2.addActionListener(this);
		
		b3 = new Button("Multiply");
		b3.setBounds(170,250,50,20);
		f1.add(b3);
		b3.addActionListener(this);
		
		b4 = new Button("Divide");
		b4.setBounds(220,250,50,20);
		f1.add(b4);
		b4.addActionListener(this);
		
		b5 = new Button("Cancel");
		b5.setBounds(280,250,50,20);
		f1.add(b5);
		b5.addActionListener(this);
		
		f1.setSize(400,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		
		if(e.getSource() == b1)
		{
			t3.setText(String.valueOf(n1+n2));
		}
		if(e.getSource() == b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		if(e.getSource() == b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
		if(e.getSource() == b4)
		{
			t3.setText(String.valueOf(n1/n2));
		}
		if(e.getSource() == b5)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		Calculator obj = new Calculator();
	}
}