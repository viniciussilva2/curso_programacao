package curso;

import java.util.Locale; //Importar LOCALE.

public class Main {

	public static void main(String[] args) {

	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products:");
	System.out.println("Computer, witch price is " + "$"+ price1);
	System.out.println("Office desk, which price is " + "$" + price2);
	System.out.println("Record: " + age + " code " + code + " and gender: " + gender);
	System.out.println("Measue with eight decimal places: " + measure);
    System.out.printf(new Locale("pt", "BR"), "Rouded (three decimal places): %.3f%n", measure);
    System.out.printf(Locale.US, "US decimal point: %.3f%n", measure);
    
    System.out.println("Exercício finalizado com sucesso!!");
		
	}

}
