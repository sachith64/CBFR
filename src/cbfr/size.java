package cbfr;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.LayoutPath;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class size extends JFrame{
//	public size(final LayoutPath l){
		
	
  private static final String FILE_DIR = null;
protected static final Object F = null;
private int length;

 public  size(){
		
		final JFrame frame= new JFrame("Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800,600);
		
		final JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		JLabel lblData = new JLabel("       You selected size       & Enter Aproximate size of a file      ");
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
		final String input = txt2.getText();
		
	
				        	
    
  
		b.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				  
					String input = txt2.getText();
//	  JFrame frame1= new JFrame();
//	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.setVisible(true);
//		frame.setSize(600,700);

//    int m= Integer.parseInt(input);
    
    
//    long m=fileutil.getFileSize(input);
//    m=m/1024;
//				    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location", F);
//				    File folder = new File(option1+"/");
				    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location As-\"Drive://folder/subfolder/\"", F);
				    File folder = new File(option1);
    File[] listOfFiles = folder.listFiles();{
    	
//    	final String result = null;
    	String k = "";
    	int p=0;
    	 int option=JOptionPane.showConfirmDialog(txt2,"you want to proceed with :" + input);
    		if (option == JOptionPane.YES_OPTION )
    		{
    for (int i = 0; i < listOfFiles.length; i++) {

        int m= Integer.parseInt(input);
    	long filesize = listOfFiles[i].length();
    	final long n=filesize/1024;
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
   		frame.setVisible(true);
   		frame.setSize(800,600);
      if (n>=m/2&&n<=m*2) {
    	 
    	  System.out.print(n);
    	  
    	 
    	  System.out.println("Filesize in Kilo bytes: " + listOfFiles[i]);
    	  String result1 =  "\nfile:"+ listOfFiles[i]+"-size in KB:"+ n+"\n";
    	  k = k+result1+"\n";
    	  p=p+1;
    	  
    	  
      
      
    
    
     }

}
    if(p==0)
    {
//    	 String k1 = "No Results Found"+"\n";
    	JOptionPane.showMessageDialog(b,"Make sure You entered Size in kb");
    	JOptionPane.showMessageDialog(b,"No Results Found");

//    	final JTextArea l = new JTextArea(k);
//	    frame.add(l);
//	    l.setEditable(false);
	    
	   
	   
    }
    else{
    	JOptionPane.showMessageDialog(b,p+"\t  Results Found");
    final JTextArea l = new JTextArea(k);
	    frame.add(l);
	    l.setEditable(false);
	 
    }
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
						JOptionPane.showMessageDialog(e, "Re Enter approximate size");
						
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

public void createGUI() {
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
	new size();
//	.listFile(FILE_DIR, FILE_DIR);
	
	}
	
public static void main(String[] args) {
	cbfr c = new cbfr();
//	  size frame = new size();
//	  frame.setSize(400, 600);
//	  frame.setVisible(true);
//	  size acc= new size();
//	new size();
}
	
}