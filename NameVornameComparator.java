
/** 
 * 
 * @author Lukas Keller 10-113-736
 * @author Jonas von Felten 10-105-427
 *
 */


public class NameVornameComparator implements java.util.Comparator<StudentIn> {


 /**
  * Extrahiert den Namen und den Vornamen, eines Studentenobjekts
  * und setzt sie zu einem einzelnen String zusammen.
  */
 private String extractFullname(StudentIn obj) {
	 String a= obj.getName();
	 String b= obj.getVorname();
	 String c= a+" "+b;
	 return c;
	  
 }
 

 /** Vergleicht Objekt a mit Objekt b   
  *  
  *  String1.compareTo(String2) liefert -1 wenn String1 lexikographisch kleiner als String2 ist,
  *  0 wenn sie gleich sind und 1 wenn String2 grösser als String1 ist.
  */
 public int compare(StudentIn a, StudentIn b) {
	 return extractFullname(a).compareTo(extractFullname(b));
	 
	
	 

 }
}
/*
Output:
MatrikelNr Name Vorname
94419832 Briod Jean
94419832 Briod Jean
92987654 Habegger Pascal
92987654 Habegger Pascal
92987654 Habegger Pascal
90588921 M�ller Kurt
98345632 Schneider Anna
98222634 Stucki Daniel
92123456 Wenger Thomas
92123456 Wenger Thomas
*/