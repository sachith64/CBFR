package cbfr;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class extension extends JFrame {

  protected static final Object F = null;
private int length;

public  extension(){
		
		final JFrame frame= new JFrame("Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800,600);
		
		final JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		JLabel lblData = new JLabel("       You selected Format       & Enter Extension of a file:       ");
		menubar.add(lblData);
		final JTextField txt2 = new JTextField("Erase me");
		menubar.add(txt2);
		final JButton b = new JButton("Find");
		menubar.add(b);
		final JButton bk = new JButton("Back to menu");
		menubar.add(bk);
		final JButton e = new JButton("Exit");
		menubar.add(e);
		  e.setBackground(Color.yellow);
		  e.setForeground(Color.red);
//		JLabel l = new JLabel("");
//		frame.add(l);
		String input = txt2.getText();
		
	
				        	
    

		b.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				  
	  
//	  JFrame frame1= new JFrame();
//	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.setVisible(true);
//		frame.setSize(600,700);

//    int m= 874;
   
    String f=txt2.getText();
//    long m=fileutil.getFileSize(input);
//    m=m/1024;
//    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location", F);
//    File folder = new File(option1+"/");
    String option1=JOptionPane.showInputDialog(b, "Enter Folder Location As-\"Drive://folder/subfolder/\"", F);
    File folder = new File(option1);
    File[] listOfFiles = folder.listFiles();{
    	
//    	final String result = null;

    	String k = "";
    	int m=0;
    	 int option=JOptionPane.showConfirmDialog(txt2,"you want to proceed with :" + f);
    		if (option == JOptionPane.YES_OPTION )
    		{
    	for (int i = 0; i < listOfFiles.length; i++) {

    	long filesize = listOfFiles[i].length();
    	final long n=filesize/1024;
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
   		frame.setVisible(true);
   		frame.setSize(800,600);

   		String name = listOfFiles[i].getName();
   		if (name.endsWith(f)) {
    	 
    	  System.out.print(f);
    	  
    	 
    	  System.out.println("File"+"Filesize in Kilo bytes: " + listOfFiles[i]);

    	  String result1 =  ""+"\nfile:"+ listOfFiles[i]+"\t"+"    -size in KB:"+ n+"\n";
    	
//    	  System.out.print("files:" + result1.replace("exe", "exet"));
//			JLabel label = new JLabel("\n"+ result1.replace("exe", "exet"));
//			frame.add(label);
    	  
    	  k = k+result1+"\n";
    	  m=m+1;
//    	  

    	
	
    
    
     }
//   		return;

}
    	if(m==0)
        {
//        	 String k1 = "No Results Found"+"\n";
        	JOptionPane.showMessageDialog(b,"No Results Found");
//        	final JTextArea l = new JTextArea(k);
//    	    frame.add(l);
//    	    l.setEditable(false);
    	    
    	   
    	   
        }
        else{
        	JOptionPane.showMessageDialog(b,m+"\t  Results Found");
        final JTextArea l = new JTextArea(k);
    	    frame.add(l);
    	    l.setEditable(false);
    	 
        }
}
    }			  }
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
						JOptionPane.showMessageDialog(e, "Re Enter Last part of a file name");
						
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
	}

public static void main(String[] args) {
	  
	  extension acc= new extension();
}

}