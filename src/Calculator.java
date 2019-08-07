import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator implements MouseListener
{
	
	private JFrame frame = null;
	
	private JPanel topPanel = null;
	private JPanel buttonPanel1 = null;
	
	
	private JTextField forIO = null;
	
	private JButton button1 = null;
	private JButton button2 = null;
	private JButton button3 = null;
	private JButton button4 = null;
	private JButton button5 = null;
	private JButton button6 = null;
	private JButton button7 = null;
	private JButton button8 = null;
	private JButton button9 = null;
	private JButton button10 = null;
	private JButton button11 = null;
	private JButton button12 = null;
	private JButton button13 = null;
	private JButton button14 = null;
	private JButton button15 = null;
	private JButton button16 = null;
	private JButton button17 = null;
	private JButton button18 = null;
	private JButton button19 = null;
	
	Border border = BorderFactory.createLineBorder(Color.BLACK,3);
	
	private boolean forAddition = false;
	
	
	public Calculator()
	{
		
		frame = new JFrame("Mini Calculator");
		
		topPanel = new JPanel();
		topPanel.setBorder(border);
		buttonPanel1 = new JPanel();
		buttonPanel1.setBorder(border);
		
		
		forIO = new JTextField();
		forIO.addMouseListener(this);
		forIO.setText("Please Use Space After Every Number");
		
		button1 = new JButton("7");
		button1.addMouseListener(this);
		
		button2 = new JButton("8");
		button2.addMouseListener(this);
		
		button3 = new JButton("9");
		button3.addMouseListener(this);
		
		button4 = new JButton("+");
		button4.addMouseListener(this);
		
		button5 = new JButton("4");
		button5.addMouseListener(this);
		
		button6 = new JButton("5");
		button6.addMouseListener(this);
		
		button7 = new JButton("6");
		button7.addMouseListener(this);
		
		button8 = new JButton("-");
		button8.addMouseListener(this);
		
		button9 = new JButton("1");
		button9.addMouseListener(this);
		
		button10 = new JButton("2");
		button10.addMouseListener(this);
		
		button11 = new JButton("3");
		button11.addMouseListener(this);
		
		button12 = new JButton("*");
		button12.addMouseListener(this);
		
		button13 = new JButton(".");
		button13.addMouseListener(this);
		
		button14 = new JButton("0");
		button14.addMouseListener(this);
		
		button15 = new JButton("=");
		button15.addMouseListener(this);
		
		button16 = new JButton("/");
		button16.addMouseListener(this);
		
		button17 = new JButton("+-");
		button17.addMouseListener(this);
		
		button18 = new JButton("DEL");
		button18.addMouseListener(this);
		
		button19 = new JButton("Exit");
		button19.addMouseListener(this);
		
		
		
		topPanel.setLayout(new GridLayout(1,1,10,10));
		topPanel.add(forIO);
		
		buttonPanel1.setLayout(new GridLayout(5,4,10,10));
		buttonPanel1.add(button1);
		buttonPanel1.add(button2);
		buttonPanel1.add(button3);
		buttonPanel1.add(button4);
		buttonPanel1.add(button5);
		buttonPanel1.add(button6);
		buttonPanel1.add(button7);
		buttonPanel1.add(button8);
		buttonPanel1.add(button9);
		buttonPanel1.add(button10);
		buttonPanel1.add(button11);
		buttonPanel1.add(button12);
		buttonPanel1.add(button13);
		buttonPanel1.add(button14);
		buttonPanel1.add(button15);
		buttonPanel1.add(button16);
		buttonPanel1.add(button17);
		buttonPanel1.add(button18);
		buttonPanel1.add(button19);
		
		
		
		frame.setLayout(new GridLayout(2,1,10,10));
		frame.add(topPanel);
		frame.add(buttonPanel1);
		
		
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1)
			forIO.setText(forIO.getText().concat("7"));
		
		if(e.getSource()==button2)
			forIO.setText(forIO.getText().concat("8"));
		
		if(e.getSource()==button3)
			forIO.setText(forIO.getText().concat("9"));
		
		if(e.getSource()==button4)
			forIO.setText(forIO.getText().concat("+"));	
		
		if(e.getSource()==button5)
			forIO.setText(forIO.getText().concat("4"));
		
		if(e.getSource()==button6)
			forIO.setText(forIO.getText().concat("5"));
		
		if(e.getSource()==button7)
			forIO.setText(forIO.getText().concat("6"));
		
		if(e.getSource()==button8)
			forIO.setText(forIO.getText().concat("-"));
		
		if(e.getSource()==button9)
			forIO.setText(forIO.getText().concat("1"));
		
		if(e.getSource()==button10)
			forIO.setText(forIO.getText().concat("2"));
		
		if(e.getSource()==button11)
			forIO.setText(forIO.getText().concat("3"));
		
		if(e.getSource()==button12)
			forIO.setText(forIO.getText().concat("*"));
		
		if(e.getSource()==button13)
			forIO.setText(forIO.getText().concat("."));
		
		if(e.getSource()==button14)
			forIO.setText(forIO.getText().concat("0"));
		
		if(e.getSource()==button15)
		{
		
			
			String textFieldValue = forIO.getText();
			if(textFieldValue!=null)
			{
				
				for(int i=0;i<textFieldValue.length();i++)
				
				{
					if(textFieldValue.charAt(i)=='+')
					{
						 String textFieldValues2 = forIO.getText();
						 String[] numbers = textFieldValues2.split(" "); // separating the two numbers into two strings
					    	
					    	String a,b;
					    	a=numbers[0];
					   	 	b=numbers[2];
					    	
					    	if(numbers.length==3)
					    	{
					        	double firstNumber = Double.parseDouble(a);
					            double secondNumber = Double.parseDouble(b);
					       	 
					        	forIO.setText(""+firstNumber+" + "+secondNumber+" = "+ (firstNumber+secondNumber) );
					    	}
					    	else
				        	{
				            	forIO.setText("Invalid Input Format Detected.");
				        	}

					}
					else if(textFieldValue.charAt(i)=='-')
					{
						 String textFieldValues2 = forIO.getText();
						 String[] numbers = textFieldValues2.split(" "); // separating the two numbers into two strings
					    	
					    	String a,b;
					    	a=numbers[0];
					   	 	b=numbers[2];
					    	
					    	if(numbers.length==3)
					    	{
					        	double firstNumber = Double.parseDouble(a);
					            double secondNumber = Double.parseDouble(b);
					       	 
					        	forIO.setText(""+firstNumber+" - "+secondNumber+" = "+ (firstNumber-secondNumber) );
					    	}
					    	else
				        	{
				            	forIO.setText("Invalid Input Format Detected.");
				        	}

					}
					 
					 else if(textFieldValue.charAt(i)=='/')
						{
							 String textFieldValues2 = forIO.getText();
							 String[] numbers = textFieldValues2.split(" "); // separating the two numbers into two strings
						    	
						    	String a,b;
						    	a=numbers[0];
						   	 	b=numbers[2];
						    	
						    	if(numbers.length==3)
						    	{
						        	double firstNumber = Double.parseDouble(a);
						        	double secondNumber =Double.parseDouble(b);
						       	 
						        	forIO.setText(""+firstNumber+" / "+secondNumber+" = "+ (firstNumber/secondNumber) );
						    	} 
						    	else
					        	{
					            	forIO.setText("Invalid Input Format Detected.");
					        	}

						}
					 else if(textFieldValue.charAt(i)=='*')
						{
							 String textFieldValues2 = forIO.getText();
							 String[] numbers = textFieldValues2.split(" "); // separating the two numbers into two strings
						    	
						    	String a,b;
						    	a=numbers[0];
						   	 	b=numbers[2];
						    	
						    	if(numbers.length==3)
						    	{
						        	double firstNumber = Double.parseDouble(a);
						        	double secondNumber =Double.parseDouble(b);
						       	 
						        	forIO.setText(""+firstNumber+" * "+secondNumber+" = "+ (firstNumber*secondNumber) );
						    	} 
						    	else
					        	{
					            	forIO.setText("Invalid Input Format Detected.");
					        	}

						}
					
					 
				}
				
				
				
				
			}
			else
	    	{
	        	forIO.setText("Null Input Detected.");
	    	}
	
		}
		
		if(e.getSource()==button16)
			forIO.setText(forIO.getText().concat("/"));
		
		if(e.getSource()==button17)
			forIO.setText(forIO.getText().concat("-"));
		
		if(e.getSource()==button18)
		{
			String s= forIO.getText();
			forIO.setText("");
			for(int i=0;i<s.length()-1;i++)
			{
				forIO.setText(forIO.getText()+s.charAt(i));
			}
		
		}	
			
		if(e.getSource()==button19)
			forIO.setText("");
		
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
