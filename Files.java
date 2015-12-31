import java.io.*;

public class Files {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
			 LecteurFichier mail = new LecteurFichier("mail.txt");
			 mail.LectureFichier();
			 LecteurReverse liam = new LecteurReverse("mail.txt");
			 liam.LectureFichier();
}
}

