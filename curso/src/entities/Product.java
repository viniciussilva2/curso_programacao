package entities;

public class Product {

	private String name;
	public double price;
	public int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double totalValueInStock() {

		return price * quantity;

	}

	public void addProducts(int quantity) {

		this.quantity += quantity; // Recebe o parâmetro e mais ele mesmo.
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity; // Retira o parâmetro e mais ele mesmo.
	}

	// Sobrepondo a versão padrão do toString do object.
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

	public static String formatarCPF(String cpf) {
		return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}

	public static String formatarCNPJ(String cnpj) {

		cnpj = cnpj.replaceAll("\\D", "");

		return cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
	}

}
