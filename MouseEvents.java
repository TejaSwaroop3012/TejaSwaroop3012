import java.awt.*; 
import java.awt.event.*; 
public class MouseEvents extends Frame implements MouseListener
{ 
 Label l; 
 MouseEvents()
 { 
addMouseListener(this); 
l=new Label(); 
l.setBounds(20,50,300,20); 
add(l); 
setSize(300,300); 
setLayout(null); 
setVisible(true); 
 // setTitle("Mouse Events");
//window adapter
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{ 
System.exit(0); 
} 
}); 
 } 
//Mouse Events 
public void mouseClicked(MouseEvent e) 
{
 int x = e.getX();
 int y = e.getY(); 
 l.setText("Mouse Clicked ("+ x +","+ y +")"); 
} 
public void mouseEntered(MouseEvent e)
{ 
int x = e.getX();
int y = e.getY(); 
l.setText("Mouse Entered ("+ x +","+ y +")"); 
} 
public void mouseExited(MouseEvent e) 
{ 
int x = e.getX();
int y = e.getY(); 
l.setText("Mouse Exited ("+ x +","+ y +")"); 
} 
 public void mousePressed(MouseEvent e) 
 { 
 l.setText("Mouse Pressed"); 
 } 

 public void mouseReleased(MouseEvent e)
 { 
 l.setText("Mouse Released"); 
 } 
 public static void main(String[] args) 
 { 
 MouseEvents mle=new MouseEvents(); 
 } 
}