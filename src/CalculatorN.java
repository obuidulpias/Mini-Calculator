
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorN implements ActionListener {
	
	private JFrame frame = null;
	private JPanel topPanel = null;
	private JPanel buttonPanel = null;
	private JButton zero = null;
	private JButton one = null;
	private JButton two = null;
	private JButton three = null;
	private JButton four = null;
	private JButton five = null;
	private JButton six = null;
	private JButton seven = null;
	private JButton eight = null;
	private JButton nine = null;
	private JButton add = null;
	private JButton subtract = null;
	private JButton multiply = null;
	private JButton divide = null;
	private JButton equals = null;
	private JButton point = null;
	private JButton delete = null;
	private JButton exit = null;
	private JButton plusMinus = null;
	private JButton clear = null;
    private JTextField inputText = null;
    
    private double result = 0;
	private int operator;
	private double a;
	private double b;
    
    
    public CalculatorN(){
    	frame = new JFrame("Calculator");
    	
    	topPanel = new JPanel();
	    buttonPanel = new JPanel();
	    
	    inputText = new JTextField();
	    
	    zero = new JButton(" 0 ");
		one = new JButton("  1 ");
		two = new JButton(" 2 ");
		three = new JButton(" 3 ");
		four = new JButton(" 4 ");
		five = new JButton(" 5 ");
		six = new JButton(" 6 ");
		seven = new JButton(" 7 ");
		eight = new JButton(" 8 ");
		nine = new JButton(" 9 ");
		add = new JButton(" + ");
		subtract = new JButton("  -  ");
		multiply = new JButton("  *  ");
		divide = new JButton("  /  ");
		equals = new JButton(" = ");
		point = new JButton("  .  ");
		delete = new JButton("Delete");
		exit = new JButton("Exit");
		plusMinus = new JButton(" ± ");
		clear = new JButton("Clear");
	    
	  //------------------ Setting Up The buttonPanel -----
	   	 
    	buttonPanel.setLayout(new GridLayout(5,4));
    	buttonPanel.add(seven);
        buttonPanel.add(eight);
        buttonPanel.add(nine);
        buttonPanel.add(add);
        buttonPanel.add(four);
        buttonPanel.add(five);
        buttonPanel.add(six);
        buttonPanel.add(subtract);
        buttonPanel.add(one);
        buttonPanel.add(two);
        buttonPanel.add(three);
        buttonPanel.add(multiply);
        buttonPanel.add(point);
        buttonPanel.add(zero);
        buttonPanel.add(equals);
        buttonPanel.add(divide);
        buttonPanel.add(plusMinus);
        buttonPanel.add(delete);
        buttonPanel.add(clear);
        buttonPanel.add(exit);
    	
    	// -------------- Setting Up The topPanel --------------
      	 
    	topPanel.setLayout(new GridLayout(1,1));   	 
    	topPanel.add(inputText);   
    	
    	// --- adding the JPanels into the container frame ---   
    	
    	frame.setLayout(new GridLayout(2,1));
    	frame.add(topPanel);
    	frame.add(buttonPanel);
   	 
    	frame.setLocation(500,200);
    	frame.setSize(300,400);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   	 
    	frame.setVisible(true); 
    	frame.setResizable(false);
    	
    	one.addActionListener(this);
    	two.addActionListener(this);
    	three.addActionListener(this);
    	four.addActionListener(this);
    	five.addActionListener(this);
    	six.addActionListener(this);
    	seven.addActionListener(this);
    	eight.addActionListener(this);
    	nine.addActionListener(this);
    	zero.addActionListener(this);
    	add.addActionListener(this);
    	subtract.addActionListener(this);
    	multiply.addActionListener(this);
    	divide.addActionListener(this);
    	equals.addActionListener(this);
    	delete.addActionListener(this);
    	exit.addActionListener(this);
    	point.addActionListener(this);
    	clear.addActionListener(this);
    	plusMinus.addActionListener(this);
    }

   
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		if(e.getSource()==one)
            inputText.setText(inputText.getText().concat("1"));
        
        if(e.getSource()==two)
            inputText.setText(inputText.getText().concat("2"));
        
        if(e.getSource()==three)
            inputText.setText(inputText.getText().concat("3"));
        
        if(e.getSource()==four)
            inputText.setText(inputText.getText().concat("4"));
        
        if(e.getSource()==five)
            inputText.setText(inputText.getText().concat("5"));
        
        if(e.getSource()==six)
            inputText.setText(inputText.getText().concat("6"));
        
        if(e.getSource()==seven)
            inputText.setText(inputText.getText().concat("7"));
        
        if(e.getSource()==eight)
            inputText.setText(inputText.getText().concat("8"));
        
        if(e.getSource()==nine)
            inputText.setText(inputText.getText().concat("9"));
        
        if(e.getSource()==zero)
            inputText.setText(inputText.getText().concat("0"));
        
        if(e.getSource()==point)
            inputText.setText(inputText.getText().concat("."));
        
        if(e.getSource()==plusMinus){
        	 inputText.setText(inputText.getText().concat("-"));
        }
        
        if(e.getSource()==add)
        {
            a=Double.parseDouble(inputText.getText());
            operator=1;
            inputText.setText("");
        } 
        
        if(e.getSource()==subtract)
        {
            a=Double.parseDouble(inputText.getText());
            operator=2;
            inputText.setText("");
        }
        
        if(e.getSource()==multiply)
        {
            a=Double.parseDouble(inputText.getText());
            operator=3;
            inputText.setText("");
        }
        
        
        if(e.getSource()==divide)
        {
        	
            a=Double.parseDouble(inputText.getText());
            operator=4;
            inputText.setText("");
        }
        
        if(e.getSource()==equals)
        {
            b=Double.parseDouble(inputText.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
            inputText.setText(""+result);
        }
        
        if(e.getSource() == exit){
			System.exit(0);
		}
        
        if(e.getSource()==delete)
        {
            String s=inputText.getText();
            inputText.setText("");
            for(int i=0;i<s.length()-1;i++)
            inputText.setText(inputText.getText()+s.charAt(i));
        }
        
        if(e.getSource()==clear)
            inputText.setText("");
        
		  }catch(Exception ex){}
    } // actionPerformed method ends here
	
	
		
}