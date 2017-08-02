package cbfr;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class GetFileLastModified extends JFrame{
//	public GetFileLastModified(final Layout l)
	
	  public static void main(String[] args)
	    {	
		File file = new File("f:\\Android");
	 
//		System.out.println("Before Format : " + file.lastModified());
	 
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	 
		System.out.println("Date " + sdf.format(file.lastModified()));
		
		JFrame frame1= new JFrame("Find");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		frame1.setSize(600,600);
		final JPanel panel = new JPanel ();
		frame1.add(panel);
		JLabel label = new JLabel("\n"+ "Date"+ sdf.format(file.lastModified()));
		panel.add(label);
	    }

	public void createGUI() {
JFrame frame = new JFrame("Content Based File Retrieval - CBFR");
		
//		frame.setVisible(true);
//		frame.setSize(600,600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		new GetFileLastModified().listFile(FILE_DIR,lastmodifed);
		
	}
		// TODO Auto-generated method stub
		
	}

//}
