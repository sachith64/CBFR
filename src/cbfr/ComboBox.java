package cbfr;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

//public class ComboBox extends Applet implements Runnable{ 
class cbfr 
//public class cbfr1 extends date
{ 
  JComboBox combo;
//  JButton find;

  JPanel p = new JPanel(); 
  
	JLabel lblData = new JLabel("Select Type");
  JTextField txt2 = new JTextField(20);
  
 
  JTextField txt3 = new JTextField(15);
  private JButton b = new JButton("Next");
  
  String Text;
  String Size;
  String Date;
  String Format;
  String Exit;

private Cursor cursor;
protected int i;
public void ui(){
  	
}
public static void main(String[] args) {
//cbfr frame = new cbfr();

//java.awt.EventQueue.invokeLater(new Runnable() {  
	  
//	public void run() {  
//	      Layout l = new Layout();  
//	        l.createGUI();  
//	        new FindCertainExtension();  
//	    }  
//	}); 
	}

//public void run1() {  
//    Layout l = new Layout();  
//      l.createGUI();  
//      new FindCertainExtension();  
//  }  

//public void run() {  
//  size l = new size();  
//    l.createGUI();  
//    new size();  
//}  
 

 

//  JTextField txt3 = new JTextField(12);
//  JTextField txt4= new JTextField(15);
//  JButton b = new JButton();
  

  
  public cbfr(){
  String Type[] = {"click","Text","Size","Date","Format","Exit"};
  final int n=Type.length;
  final JFrame frame = new JFrame("Content Based File Retrieval (CBFR)");
  final JPanel panel = new JPanel();
//  private FindCertainExtension FindCertainExtension; 
  combo = new JComboBox(Type);
  combo.setBackground(Color.gray);
  combo.setForeground(Color.yellow);
  b.setBackground(Color.black);
  b.setForeground(Color.white);
//  find = new JButton(Type);
//  b.font("Serif",Font.BOLD,14 );
//  txt2.setBackground(Color.gray);
//  txt2.setForeground(Color.yellow);
 
//  combo.setCursor(cursor);
  panel.add(lblData);
  
  panel.add(combo);
  panel.add(txt2);
//  panel.add(txt3);
  panel.add(b);
  
  //  p.add(b);
//  b = new JButton("Find");
//  b.setForeground(Color.gray);
//  b.setBackground(Color.red);
//  JButton JButton= new JButton (Find);
//  frame.add(panel);
  
  txt2.setEditable(false);
//  txt3.setEditable(false);
  combo.addItemListener(new ItemListener(){
	  
  
	  public void itemStateChanged(ItemEvent e){
  final String str = (String)combo.getSelectedItem();

  txt2.setText("You Selected " + str );
  txt2.setEditable(false);
  txt3.setEditable(true); 
  

	  
  txt3.setText("Enter " + str+ " Here");
 
//  for(i=0;i<n;i++)
 
  
  {
	  
	  b.addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  
				  if(txt2.getText().equals(null))
				  {
				 
			
	  JOptionPane.showMessageDialog(frame, "Please Select a type");
		  }
		  }
	  });

//	  if(txt2.getText().equals(null)) {
//		  JOptionPane.showMessageDialog(combo, "Please Select a type");
//	  }
  
	  if (txt2.equals(""))
	  {
		  b.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent e)
			  {
		  JOptionPane.showMessageDialog(b, "Please Select a type");
			  }
		  });
		  
	  }
	  
	  if(str.equals("Text")) {
	
	  b.addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  JOptionPane.showMessageDialog(combo, "forwarding" +
			  		" to Text..");
//			  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");
//			  JOptionPane.getDesktopPaneForComponent(combo);
			  
			  {
				  
			  
			  String input = txt3.getText();
			  txt2.setText("You Entered : ' " + input+ " ' ");
		
//			  JOptionPane.showMessageDialog(null,"sorry");
			  java.awt.EventQueue.invokeLater(new Runnable() {  
				  String input = txt3.getText();
	        	    public void run() {  

//	      			  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");
//	      			  {
	        	    	String input = txt3.getText();
	        	      text l = new text();  
//	        	        l.createGUI();  
	        	        new text();  
//	        	    }  
	        	    }
	        	}); 
//			  System.out.print(input);
		  }
		  }
	  }
			  );

		  }
  

  if(str.equals("Size")) {
//	  System.out.print("Date");
	  
	  b.addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  JOptionPane.showMessageDialog(combo, "forwarding" +
				  		" to Size..");
			  String input = txt3.getText();
			  txt2.setText("You Entered : ' " + input+ " ' ");
//			  System.out.print(input);
//			  FindCertainExtension  = new FindCertainExtension();
//			  size1.createGUI();
			  java.awt.EventQueue.invokeLater(new Runnable() {  
        		  
	        	    public void run() {  
	        	      size l = new size();  
	        	        l.createGUI();  
	        	        new size();  
	        	    }  
	        	}); 
	        	
//			  java.awt.EventQueue.invokeLater(new Runnable() {  
        		  
//	        	    public void run() {  
//	        	     GetFileLastModified l = new GetFileLastModified();  
//	        	        l.createGUI();  
//	        	        new GetFileLastModified();  
//	        	    }  
//	        	}); 
			  
		  }
	  }
			  );

	  
  }
  
  if(str.equals("Date")) {
//	  System.out.print("Date");
	 
	  b.addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  JOptionPane.showMessageDialog(combo, "forwarding" +
				  		" to Date..");
			  String input = txt3.getText();
			  txt2.setText("You Entered : ' " + input+ " ' ");
//			  System.out.print(input);
			  java.awt.EventQueue.invokeLater(new Runnable() {  
        		  
	        	    public void run() {  
	        	      date l = new date();  
	        	        l.createGUI();  
	        	        new date();  
	        	    }  
	        	}); 
			  
			  
		  }
	  }
			  );

	  
  }
  if(str.equals("Format")) {
//	  System.out.print("Format");

	  
	  b.addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent ae)
		  {

			  JOptionPane.showMessageDialog(combo, "forwarding" +
				  		" to Extension..");
			  String input = txt3.getText();
			  txt2.setText("You Entered : ' " + input+ " ' ");
			
//			        FindCertainExtension acc=new FindCertainExtension();
			        
//			        public static void main(String[] args) 
			        {
//			        	ComboBox frame = new ComboBox();
			        	java.awt.EventQueue.invokeLater(new Runnable() {  
			        		  
			        	    public void run() {  
//			      			  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");
			        	     extension l = new extension();  
			        	        l.createGUI();  
			        	        new extension();  
			        	    }  
			        	}); 
			        	}
		  
			    
			        
		  }
	  }
			  );

	  
  }
  
  
  if(str.equals("Exit")) {
	  JOptionPane.showMessageDialog(combo, "You are going to exit");
//	  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");

	  {
		  System.out.print("Exit");
	  
	  System.exit(0);
	  }
  }
  
  
	  }
//  b.addActionListener(new ActionListener()
//  {
//	  public void actionPerformed(ActionEvent e)
//	  {
//  JOptionPane.showMessageDialog(b, "Please Select a type");
//	  }
//  });
	  
	  }  
	  
  });
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(800,600);
  frame.setVisible(true);
  
  frame.add(panel);
  
//  b.addActionListener(new ActionListener(){
//      public void actionPerformed(ActionEvent ae){
//    	  FindCertainExtension acc=new FindCertainExtension();
//    	  CreateAccount acc1=new CreateAccount();
//      }
//      });
  
  }
public void createGUI() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
	new cbfr();
	
}


  
}


//  panel.add(b);
 
//  public static void main(String arg[])
//  {
//      ComboBox frame1=new ComboBox();
//          }
  

  
//public void run() {
	// TODO Auto-generated method stub
//	
//}



  

 
/*

		  
		class find2{
			public void main(String[] args){
				
				
				FindCertainExtension go = new FindCertainExtension();
						go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						go.setSize(500,200);
						go.setVisible(true);
					}
				}	
  });
  */
 

