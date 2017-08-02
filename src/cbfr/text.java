package cbfr;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.LayoutPath;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class text extends JFrame {
//	public size(final LayoutPath l){
		
	
  private static final String FILE_DIR = null;
protected static final Object F = null;
private int length;

 public  text(){
		
		final JFrame frame= new JFrame("Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800,600);
		
		final JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		JLabel lblData = new JLabel("       You selected Text       & Enter file name       ");
		menubar.add(lblData);
		final JTextField txt2 = new JTextField("Erase me");
		menubar.add(txt2);
		final JButton b = new JButton("Find");
		menubar.add(b);
		final JButton bk = new JButton("Back to menu");
		menubar.add(bk);
		final JButton e = new JButton("Exit");
		menubar.add(e);
		  e.setBackground(Color.pink);
		  e.setForeground(Color.red);
//		JLabel l = new JLabel("");
//		frame.add(l);
//		String input = txt2.getText();
		
	
				        	
		
  
		b.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				  
	  
//	  JFrame frame1= new JFrame();
//	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.setVisible(true);
//		frame.setSize(600,700);

    final String d = txt2.getText();
    
//    JOptionPane.showMessageDialog(txt2,"Enter File name in TextField &  Click Find");
//    JOptionPane.showMessageDialog(txt2, "Enter File name in TextField &  Click Find");
    {
//    long m=fileutil.getFileSize(input);
//    m=m/1024;
//    	b.addActionListener(new ActionListener()
//		  {
//			  public void actionPerformed(ActionEvent ae)
//			  {
    	
    	 int option=JOptionPane.showConfirmDialog(txt2,"you want to proceed with :" + d);
    		if (option == JOptionPane.YES_OPTION )
    		{
//    		    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location", F);
//    		    File folder = new File(option1+"/");
    		    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location As-\"Drive://folder/subfolder/\"", F);
    		    File folder = new File(option1);
    File[] listOfFiles = folder.listFiles();{
    	
//    	final String result = null;
    	String k = "";
    	int m=0;
    for (int i = 0; i < listOfFiles.length; i++) {

    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
   	 
//		System.out.println("Date " + sdf.format(listOfFiles[i].lastModified()));
		
//    	String filedate = listOfFiles[i].sdf.format(listlastModified());
//    	final long n=filesize/1024;
//    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
//   		frame.setVisible(true);
//   		frame.setSize(600,700);
//      if ((listOfFiles[i].getName()).equals(d)) 
    	String name = listOfFiles[i].getName();
//    	String name1=ToLowerCase(name);
      if(name.startsWith(d))
    	{
    	 
//    	  System.out.print(d);
    	  long filesize = listOfFiles[i].length();
      	final long n=filesize/1024;
    	 
    	  System.out.println("List of files" + listOfFiles[i]);
    	  
    	  String result1 =  "\n\tFile:  "+ listOfFiles[i]+"     starts with    :\""+d+"\"'"+"   Size of the File is:"+n+"KB";
    	  k = k+result1+"\n";
    	  m=m+1;
//    	    
     }
     
}
    if(m==0)
    {
//    	 String k1 = "No Results Found"+"\n";
    	JOptionPane.showMessageDialog(b,"No Results Found");
//    	final JTextArea l = new JTextArea(k);
//	    frame.add(l);
//	    l.setEditable(false);
	    
	   
	   
    }
    else{
    	JOptionPane.showMessageDialog(b,m+"\t  Results Found");
    final JTextArea l = new JTextArea(k);
	    frame.add(l);
	    l.setEditable(false);
	 
    }
	   
}
//			  }
//		  }
//    	);
    }
			  }

			  }
		  }
		);
		e.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				
				  int option=JOptionPane.showConfirmDialog(e,"You are going to Exiting");
//				  JOptionPane.setBackground(Color.white);
//				  option.setForeground(Color.red);
					if (option == JOptionPane.YES_OPTION )
					
//	  JOptionPane.showConfirmDialog(e,"You are going to exit");
//	  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");
//	  if (option == JOptionPane.YES_OPTION )
		{
//			JOptionPane.showMessageDialog(txt2, "Enter correct date as shown above format");
		
	  
		  System.out.print("Exit");
	  
	  System.exit(0);
	  }
					if (option == JOptionPane.NO_OPTION )
					{
						JOptionPane.showMessageDialog(e, "Re Enter file name");
						
					}
}
		  }
		);
		bk.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				  java.awt.EventQueue.invokeLater(new Runnable() {  
	        		  
		        	    public void run() {  
//		      			  JOptionPane.showConfirmDialog(combo, "Go forward to Name ...?");
		        	     cbfr l = new cbfr();  
		        	        l.createGUI();  
		        	        new cbfr();  
		        	    }  
		        	}); 
				  
			  }
		  }
		);
			

			 
			  }

protected Object filename(long lastModified) {
	// TODO Auto-generated method stub
	return null;
}

//public void createGUI1() {
//	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
//	new text();	
//	}
	
public static void main(String[] args) {
	cbfr c = new cbfr();

}


//public void createGUI11() {
//	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
//	new text();
//	// TODO Auto-generated method stub
//}

//
//public void createGUI() {
//	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
//	new text();
//	// TODO Auto-generated method stub
//	
//}


	
}