package day15arraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		int a[] = {2, 7, 1, 3};
		int b[] = {7, 1, 2, 3};
		int c[] = {2, 7, 1, 3};
		
		//According to Java if 2 arrays are equal to each other, they should same elements in same indexes
		System.out.println(Arrays.equals(a, b)); //false/ want checks indexs
		System.out.println(Arrays.equals(a, c)); //true
		
		//how to check if two arrays have completely same elememts 
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b)); //true. After sort get i true
		
		String s = "I like Java but Java needs to study hard to learn so study hard"; //14 words
		
		String words[] = s.split(" "); //Array// bosluklar haric kelimeleri aliyor.
		
		System.out.println(Arrays.toString(words)); //[I, like, Java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
		System.out.println(words.length); //14 words. metin icindeki kelime sayilarini bulmak icin
		
		System.out.println(words[4]); //Java
		
		String words2[] = s.split("t");
		//The character which you used in split will not be displayed in the array
		System.out.println(Arrays.toString(words2)); //Burada t ler yok edildi.  [I like Java bu,  Java needs , o s, udy hard , o learn so s, udy hard]
		
		
		//Count the number of characters in String "s" by using split
	
		String words3[] = s.split("");
		System.out.println(Arrays.toString(words3));
		System.out.println(words3.length); //63
		
		//Count the number of characters except " " in String "s" by using split
		String words4[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words4));
		System.out.println(words4.length); //50
		
		// Count how many "s" are there in the String "s"
		//1. way
		int counter = 0;
		for(int i=0; i<words4.length; i++) {
			if(words4[i].equals("s")) {
				counter++;
			}
		}
		System.out.println("The number of the character: " +counter);
		
		//2. way 
		String words5[] = s.split("a"); 
		System.out.println(Arrays.toString(words5));
		System.out.println(words5.length-1);//burada 8 karakterli bir array olusuyor. Index sayisi kadar 'a' harfi var.  
	
		System.out.println();
		
		//buna calis
		String name1 = "Heb jij zin om voor een vervolgonderzoek naar de Verenigde \r\n"
				+ "Staten te gaan, mét een beurs van tienduizend euro? Het Instituut Nederland-VS biedt je die kans. Het enige wat je hiervoor \r\n"
				+ "moet doen is je hbo- of universitaire afstudeerscriptie in drievoud opsturen, voorzien van je persoonlijke gegevens. De sluitingsdatum is 5 februari. Let op: er is een aantal voorwaarden \r\n"
				+ "waaraan je moet voldoen. De scriptie mag niet ouder zijn dan \r\n"
				+ "een jaar, moet gaan over de Verenigde Staten en moet een relevant politiek, economisch of cultureel onderwerp hebben. Verder moet de scriptie in het Nederlands of in het Engels zijn geschreven en (uiteraard) moet je wel een voldoende hebben gescoord. Na de sluitingsdatum beslist de onafhankelijke jury \r\n"
				+ "welke scripties kans maken op de beurs. Als jij hierbij zit, krijg \r\n"
				+ "je vanzelf bericht en heb je de mogelijkheid om in maart en \r\n"
				+ "april een volledig onderzoeksplan met tijdsplanning en budgetoverzicht te schrijven. In mei maakt de jury bekend wie de \r\n"
				+ "scriptieprijs heeft gewonnen.";
		
		String words6[]= name1.split(" ");
		System.out.println(Arrays.toString(words6));
		for(int i=0; i<words6.length; i++) {
			if(words6[i].length()>3) {
				System.out.println(Arrays.toString(words6));
			}
		}
		
        for(int i=0; i<=name1.length()-1; i++) {

        }
		
		// Type a program to count the number of different characters the in String Space excepted. 
		
		
		
			}

}
