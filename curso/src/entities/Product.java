package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double TotalValueInStock() {

		return price * quantity;

	}

	public void AddProducts(int quantity) {

		this.quantity += quantity; //Recebe o parâmetro e mais ele mesmo.
	}

	public void RemoveProducts(int quantity) {

		this.quantity -= quantity; //Retira o parâmetro e mais ele mesmo.
	}

}
