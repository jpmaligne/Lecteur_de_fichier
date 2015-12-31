import java.io.*;
import java.util.ArrayList;

public class LecteurReverse {

	private String MonChemin;
	public LecteurReverse(String Chemin){
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
		ArrayList<String> Tab = new ArrayList<String>();
		while ((line = buff.readLine()) != null){
			for (int i=0; i<line.length(); i++){
				Tab.add(line.substring(i, i+1));
				
			}
			Tab.add("\n");
		}
		buff.close();
		
		//System.out.println(Tab.get(4));
		for(int j=Tab.size(); j>0; j--)
		{
			System.out.print(Tab.get(j-1));
		}
		}
	finally {
	if (in!= null) {
		in.close ();
	}
	}
	}

}
