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

public class date extends JFrame {
//	public size(final LayoutPath l){
		
	
  private static final String FILE_DIR = null;
protected static final Object F = null;
private int length;

 public  date(){
		
		final JFrame frame= new JFrame("Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800,600);
		
		final JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		JLabel lblData = new JLabel("       You selected Date       & Enter Date iin MM/DD/YYYY       ");
		menubar.add(lblData);
		final JTextField txt2 = new JTextField("Erase me");
		menubar.add(txt2);
		final JButton b = new JButton(" Find ");
		menubar.add(b);
		final JButton bk = new JButton("Back to menu");
		menubar.add(bk);
		final JButton e = new JButton("Exit");
		menubar.add(e);
		  e.setBackground(Color.YELLOW);
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

    String d = txt2.getText();

    int option=JOptionPane.showConfirmDialog(txt2,"you want to proceed with :" + d);
	if (option == JOptionPane.YES_OPTION )
	{
    
//    long m=fileutil.getFileSize(input);
//    m=m/1024;
//		String option1=JOptionPane.showInputDialog(b, "Enter Folder Location", F);
//	    File folder = new File(option1+":/");
		String option1=JOptionPane.showInputDialog(b, "Enter Folder Location As-\"Drive://folder/subfolder/\"", F);
	    File folder = new File(option1);
    File[] listOfFiles = folder.listFiles();{
    	
//    	final String result = null;
    	String k = "";
    	int m=0;
    for (int i = 0; i < listOfFiles.length; i++) {

    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd+10/yyyy");
    	SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd-10/yyyy");
   	 
//		System.out.println("Date " + sdf.format(listOfFiles[i].lastModified()));
		
//    	String filedate = listOfFiles[i].sdf.format(listlastModified());
//    	final long n=filesize/1024;
//    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
//   		frame.setVisible(true);
//   		frame.setSize(600,700);
    	String s = sdf.format(listOfFiles[i].lastModified());
    	String s1=sdf1.format(listOfFiles[i].lastModified());
    	String s2=sdf2.format(listOfFiles[i].lastModified());
//    	String s=s1+s1;
//    	String s1 = sdf.format(listOfFiles[i].lastModified());
//    	String s11 = sdf.format(listOfFiles[i].lastModified()+s1);
//    	String s2 = sdf.format(listOfFiles[i].lastModified());
      if (s.equals(d)) {
//    	int c= Integer.parseInt(d);
//    	  int v= Integer.parseInt(s);
    	String c=d,v=s;
//    	if(c<=v&&c>=v){
    	 
    	  System.out.print(d);
    	  long filesize = listOfFiles[i].length();
        	final long n=filesize/1024;
//    	 System.out.print(s11);
    	  System.out.println("File Last Modified " + listOfFiles[i]);

    	  System.out.print(s+c+v);
//    	  String result1 =  "\n\tFile:  "+ listOfFiles[i]+"    -Last Modified: "+ d+"\n"+"   Size of the File is:"+n+"KB";

    	  String result1 =  "\n\tFile:  "+ listOfFiles[i]+"    -Last Modified: "+ d+""+"   Size of the File is:"+n+"KB";
//    	  listOfFiles[i].pathSeparator
    	  k = k+result1+"\n";
    	  m=m+1;
    	 
     }
    }
    if(m==0)
    {
//    	 String k1 = "No Results Found"+"\n";
//    	JOptionPane.showMessageDialog(b,"No Results Found");
    	JOptionPane.showMessageDialog(b,"No Results Found,Re Enter Correct Date as shown above format");
    	
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
//    int option=JOptionPane.showConfirmDialog(txt2,"you want to proceed with :" + input);
	if (option == JOptionPane.YES_OPTION )
	{
//		JOptionPane.showMessageDialog(txt2, "Enter correct date as shown above format");
	}
}
			  }
		  }
		);
		e.addActionListener(new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
		
				  int option=JOptionPane.showConfirmDialog(e,"You are Exiting");
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
						JOptionPane.showMessageDialog(e, "Re Enter Date");
						
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
	new date();

	
	}
	
public static void main(String[] args) {
	cbfr c = new cbfr();

}
	
}