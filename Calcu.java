import java.awt.*;
import java.awt.event.*;
public class Calcu extends Frame implements ActionListener
{
 TextField t; 
 Button b[]=new Button[10];
 Button b1[]=new Button[6];
 String op2[]={"+","-","*","%","=","C"};
 String str1="";
 int p=0,q=0;
 String oper;
 Calcu()
 {
 setLayout(new GridLayout(6,3));
 setSize(300, 400);
 setVisible(true);
 // setTitle("Simple Calculator");
 t=new TextField(200);
 setBackground(Color.pink);
 setFont(new Font("Arial",Font.BOLD,20));
 int k=0;
 t.setEditable(false);
 t.setBackground(Color.white); 
 t.setText("0");
 
 for(int i=0;i<10;i++) //creating buttons of 0 to 9
 {
 b[i]=new Button(""+k);
 add(b[i]);
 k++;
 b[i].setBackground(Color.pink);
 b[i].addActionListener(this);
 }
 
 for(int i=0;i<6;i++) //creating buttons for operators
 {
 b1[i]=new Button(""+op2[i]);
 add(b1[i]);
 b1[i].setBackground(Color.pink);
 b1[i].addActionListener(this);
 }
 add(t); 
 }// constructor closed
 public void actionPerformed(ActionEvent ae)
 {
 String str=ae.getActionCommand(); // stores button value
 
 if(str.equals("+")){ p=Integer.parseInt(t.getText()); 

 oper=str; 
 t.setText(str1=""); 
 }
 else if(str.equals("-")){ p=Integer.parseInt(t.getText());
 oper=str; 
 t.setText(str1=""); 
 } 
 else if(str.equals("*")){ p=Integer.parseInt(t.getText());
 oper=str; 
 t.setText(str1="");
 }
 else if(str.equals("%")){ p=Integer.parseInt(t.getText());
 oper=str; 
 t.setText(str1="");
} 
 else if(str.equals("=")) { str1=""; 
 if(oper.equals("+")) {
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p+q)));}
 else if(oper.equals("-")) {
 q=Integer.parseInt(t.getText());
 t.setText(String.valueOf((p-q))); }
 else if(oper.equals("*")){
 q=Integer.parseInt(t.getText());
 t.setText(String.valueOf((p*q))); }
 else if(oper.equals("%")){
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p%q))); }
 }
 else if(str.equals("C")){ p=0;q=0;
 t.setText("");
str1=""; 
t.setText("0");
 } 
 else{ t.setText(str1.concat(str));
 str1=t.getText(); 
 } 
 } 
public static void main(String args[])
{
Calcu c = new Calcu();
} 
}