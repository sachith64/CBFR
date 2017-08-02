package cbfr;

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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class format extends JFrame {
//	public size(final LayoutPath l){
		
	
  private static final String FILE_DIR = null;
private int length;

 public  format(){
		
		final JFrame frame= new JFrame("Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800,600);
		
		final JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		JLabel lblData = new JLabel("       You selected Format       & Enter Extension       ");
		menubar.add(lblData);
		final JTextField txt2 = new JTextField("Erase me");
		menubar.add(txt2);
		JButton b = new JButton("Find");
		menubar.add(b);
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
    
    
//    long m=fileutil.getFileSize(input);
//    m=m/1024;
    File folder = new File("F:/");
    File[] listOfFiles = folder.listFiles();{
    	
//    	final String result = null;
    for (int i = 0; i < listOfFiles.length; i++) {

    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
   	 
//		System.out.println("Date " + sdf.format(listOfFiles[i].lastModified()));
		
//    	String filedate = listOfFiles[i].sdf.format(listlastModified());
//    	final long n=filesize/1024;
//    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
//   		frame.setVisible(true);
//   		frame.setSize(600,700);
      if ((listOfFiles[i].getName()).equals(d)) {
    	 
    	  System.out.print(d);
    	  
    	 
    	  System.out.println("List of files" + listOfFiles[i]);
    	  
    	  String result1 =  "\n\tFile:  "+ listOfFiles[i];
    	  JTextArea l = new JTextArea(result1);
    	    frame.add(l);
    	    l.setEditable(false);
     }
      
}
}
			  }

			private Object contains(String name) {
				// TODO Auto-generated method stub
				return null;
			}
		  }
		);
}

protected Object filename(long lastModified) {
	// TODO Auto-generated method stub
	return null;
}

public void createGUI1() {
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
	new format();

	
	}
	
public static void main(String[] args) {
	cbfr c = new cbfr();

}

public void createGUI11() {
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
	new format();
	// TODO Auto-generated method stub
	
}

public void createGUI() {
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
	new format();
	// TODO Auto-generated method stub
	
}


	
}