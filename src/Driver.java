
public class Driver {

	public static void main(String[] args) {
		
		//declaration
		
		Car c1;
		Car c2;
		
		//iNSTATION
		
		c1=new Car();
		c2=new Car();
		
		
		
	//INITIALISATION DES ATTRIBUTS
		
		c1.setBrand("Renault");
		c1.setColor("Bleu");
		
		c2.setBrand("Peugeot");
		c2.setColor("Rouge");
		
		//AFFICHAGE
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		
		System.out.println(c2.getBrand());
		System.out.println(c2.getColor());
	}

}
