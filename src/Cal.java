
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculater extends JFrame 
{
JPanel northpanel,eastpanel,panel,southpanel;
JButton button[];
JButton operators[];
JTextArea area;
int op1,op2;
char oper;
Calculater(){

button=new JButton[10];//0-9 numericals
operators=new JButton[6];//for operaotrs
area=new JTextArea(5,25);
go();
}
public static void main(String arf[]){
Calculater c=new Calculater();

}
public void go(){
setTitle("ba-programmer.blogspot.in");
setLayout(new BorderLayout());
northpanel=new JPanel();//adding north pannel 
northpanel.add(area);
add(northpanel,BorderLayout.NORTH);
panel=new JPanel(new GridLayout(4,3));
button[0]=new JButton(0+"");
button[0].addActionListener(new Numbers(0));
for(int i=1;i<10;i++)
{
button[i]=new JButton(i+"");
panel.add(button[i]);
button[i].addActionListener(new Numbers(i));
}
eastpanel=new JPanel(new GridLayout(4,1));
//c for clear
	operators[0]=new JButton("c");
	panel.add(operators[0]);
	operators[0].addActionListener(new Operations('C'));
	panel.add(button[0]);
//equal operation
operators[1]=new JButton("=");
panel.add(operators[1]);
operators[1].addActionListener(new Operations('='));
add(panel,BorderLayout.CENTER);//adding panel

//addtion
	operators[2]=new JButton("+");
	eastpanel.add(operators[2]);
	operators[2].addActionListener(new Operations('+'));
//substraction
operators[3]=new JButton("-");
eastpanel.add(operators[3]);
operators[3].addActionListener(new Operations('-'));
//divident
	operators[4]=new JButton("/");
	eastpanel.add(operators[4]);
	operators[4].addActionListener(new Operations('/'));
//multiplication
operators[5]=new JButton("*");
eastpanel.add(operators[5]);
operators[5].addActionListener(new Operations('*'));
add(eastpanel,BorderLayout.EAST);
setVisible(true);
op1=op2=0;
setSize(300,300);
}
class Numbers implements ActionListener{
int i;
Numbers(int i){
this.i=i;
}
public void actionPerformed(ActionEvent e){
if(op1==0)
{	op1=i;
		area.setText(area.getText()+op1);
}
else if(op2==0)
{	op2=i;
	area.setText(area.getText()+op2);
}
}
}
class Operations implements ActionListener{
char ch;
Operations(char ch){
this.ch=ch;
}
public void actionPerformed(ActionEvent ee){
if((op1!=0 )&&(op2==0)){
oper=ch;area.setText(area.getText()+oper);}
else if(op2!=0 && (ch=='=' || ch=='C'))
{if(ch=='C')oper='C';
operators[1].setEnabled(false);
switch(oper){
case '+':
	area.setText(area.getText()+"="+(op1+op2));
	break;
case '-':
	area.setText(area.getText()+"="+(op1-op2));
	break;
case '*':
	area.setText(area.getText()+"="+(op1*op2));
	break;
case '/':
	area.setText(area.getText()+"="+(float)(op1/op2));
	break;
case 'C':
operators[1].setEnabled(true);
	area.setText("");op1=op2=0;
	break;
}
}
}
}

}
