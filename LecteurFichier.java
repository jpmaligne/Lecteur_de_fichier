import java.io.*;
public class LecteurFichier {
	
	private String MonChemin;
	public LecteurFichier(String Chemin){
		 MonChemin = Chemin;
	}
	
	public void LectureFichier() throws IOException{
		 FileInputStream in = null ;
		 File f = new File(MonChemin);
		 try {
		 in = new FileInputStream ( f ); // opening file
		InputStream flux = in;
		InputStreamReader read = new InputStreamReader(flux);
		BufferedReader buff= new BufferedReader(read);
		String line;
		while ((line = buff.readLine()) != null){
		      System.out.println(line);
		}
		buff.close();
		}
		 
		 finally {
		 if ( in != null ) {
		 in.close ();
		 }
		 }
	}
	}

