package orders;

public class Main {

	public static void main(String[] args) {
		StoreComponent box = new Box("Encomenda completa", 0.25);
		box.addComponent(getSurpriseBox());
		
        System.out.println("----- VALOR TOTAL DA SUA ENCOMENDA: ----- ");
		System.out.println(box.getTotalValue());
	}
	
	public static StoreComponent getSurpriseBox() {
		StoreComponent balls = new Product("Bolinha", 2.50);
		StoreComponent smartphone_case = new Product("Case", 15.50);
		
		StoreComponent fish = new Product("Peixe", 22.50);
		StoreComponent moto = new Product("Moto", 150.50);
		StoreComponent mini_box = new Box("Mini Box", 15.50);
		mini_box.addComponent(fish);
		mini_box.addComponent(moto);
		
		StoreComponent box = new Box("Encomenda completa", 0.25);
		box.addComponent(balls);
		box.addComponent(smartphone_case);
		box.addComponent(mini_box);
		
		return box;
	}
}
