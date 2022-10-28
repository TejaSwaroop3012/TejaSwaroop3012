
import java.awt.*; 
import java.awt.event.*; 
public class KeyEvents extends Frame implements KeyListener
{ 
 Label l; 
 TextArea area; 
KeyEvents()
{
 setSize(400,400); 
 setLayout(null);
 // setTitle("Keyboard Events");
 setVisible(true);
 l=new Label(); 
 l.setBounds(20,350,100,20); 
 area=new TextArea(); 
 area.setBounds(20,40,300, 300); 
 area.addKeyListener(this); //registers key listener to text area
 add(l);add(area); //adds components to frame
 
addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent we)
 { 
 System.exit(0); 
 } 
 }); //adapter class implementation
}//constructor closed
 
//key board event methods
public void keyPressed(KeyEvent e) { 
 l.setText("Key Pressed"); 
 }
 public void keyReleased(KeyEvent e) { 
 l.setText("Key Released"); 
 } 
 public void keyTyped(KeyEvent e) { 
 l.setText("Key Typed"); 
 } 
 public static void main(String[] args) 
 { 
 KeyEvents kle= new KeyEvents(); 
 } 
}