package day28interface;

public interface Cosmetic extends Outside { //COSmetic is child of oUTSIDE interface. sonradan yazildi ve Outside'in child interface i olarak atandi. 

	void color();
	void windowtint();
	
	//Others methosd from Outside Intreface but Java is not compleining. Because it is not verplict
}
