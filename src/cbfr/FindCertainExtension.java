package cbfr;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;


class FindCertainExtension extends JFrame
//public FindCertainExtension(final Layout l)
//public FindCertainExtension (final Layout mt)
{
	
	private static final String input2 = null;


//	JPanel panel;

	
//	JPanel panel2;
static //	 static JTextField txt1 = new JTextField(15);
//	static String input=txt1.getText();





JLabel lblData = new JLabel("Select Type");
//static JTextField txt2 = new JTextField(20);




final static JTextField txt2 = new JTextField(".avi");
//menubar.add(txt4);

static String input = txt2.getText();
//static String input = "something";
	private static final String FILE_DIR = "H:\\movies";
	
	private static final String FILE_TEXT_EXT = input;
 
	

	String temp;

	 String input1;

		  public void listFile(String folder, String ext) 
		  {
			  
				GenericExtFilter filter = new GenericExtFilter(ext);
		 
				File dir = new File(folder);
		 
				if(dir.isDirectory()==false){
					System.out.println("Directory does not exists : " + FILE_DIR);
					return;
				}
			
				// list out all the file name and filter by the extension
				final String[] list = dir.list(filter);
		 
				if (list.length == 0) {
					System.out.println("no files end with : " + ext);
					return;
				}
			
//				JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
						
				
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
//				add(rootPane);
//		        setSize(300,400);
//		        setVisible(true);
				
				JFrame frame1= new JFrame("Find");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				frame1.setVisible(true);
				frame1.setSize(600,600);
				
				final JMenuBar menubar = new JMenuBar();
				frame1.setJMenuBar(menubar);
				JLabel lblData = new JLabel("       You selected Format       & Enter Format here       ");
				menubar.add(lblData);
				final JTextField txt2 = new JTextField("Erase me");
				menubar.add(txt2);
//				menubar.add(txt3);
//				menubar.add(txt4);
				JButton b = new JButton("Find");
				menubar.add(b);
				
				
			
						        	
					  
						    
				
				final JTextField txt3 = new JTextField(15);

				
				final JPanel panel = new JPanel ();
				frame1.add(panel);

				
				b.addActionListener(new ActionListener()
				  {
					  public void actionPerformed(ActionEvent ae)
					  {

						  String input = txt2.getText();
//						  txt2.setText("You Entered : ' " + input+ " ' ");
						System.out.print(input);
//						System.out.print("" + files);
//						JLabel label = new JLabel("\n"+ files);
//						panel.add(label);
				
					  }
				  }
				);
				
				
				for (String file : list) {
					
					
					String temp = new StringBuffer(FILE_DIR).append(File.separator)
							.append(file).toString();
					
					int l=temp.length();
//					System.out.println("file : " + temp);
					final String files = ("\n" + temp);
			
					System.out.print("" + files+"size is:"+files.length());
					JLabel label = new JLabel("\n"+ files+"    Size is:" + l);
					panel.add(label);
					
//					 final String input=files;
				  }
					  }
			
				
					 
					
				
					  
			
			 
			// inner class, generic extension filter
			class GenericExtFilter implements FilenameFilter {
		 
				private String ext;
		 
				public GenericExtFilter(String ext) {
					this.ext = ext;
				}
		 
				public boolean accept(File dir, String name) {
					return (name.endsWith(ext));
				
					
				
				}
				
			}
//			FindCertainExtension()  {
//			panel=new JPanel(new GridLayout(7,2));
//		  add(panel);
//		  System.out.print("" + input1);
//			JLabel label = new JLabel("\n"+ input1);
//			panel.add(label);
//			
//          setSize(300,400);
//          setVisible(true);
//	  }
	
//	public static void main(String args[]) {
//		FindCertainExtension acc = new FindCertainExtension();
	
//		JPanel panel;
//		String files = null;
//		JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
		
//		frame.setVisible(true);
//		frame.setSize(600,600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		new FindCertainExtension().listFile(FILE_DIR, FILE_TEXT_EXT);
	
//	}

	public void createGUI() {
		// TODO Auto-generated method stub
	JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
		
//		frame.setVisible(true);
//		frame.setSize(600,600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		new FindCertainExtension().listFile(FILE_DIR, FILE_TEXT_EXT);
		
	}
	 

	 }