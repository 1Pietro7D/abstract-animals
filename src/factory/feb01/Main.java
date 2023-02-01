package factory.feb01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cane cane = new Cane();
		System.out.println("un cane:");
        cane.dormi();
        cane.verso();
        cane.mangia();
        cane.swim();
        
        Passerotto passerotto = new Passerotto();
        System.out.println("\nun passerotto:");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        passerotto.fly();
        
        Aquila aquila = new Aquila();
        System.out.println("\nun'aquila:");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        aquila.fly();

        Delfino delfino = new Delfino();
        System.out.println("\nun delfino:");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        delfino.swim();
        
        Gatto gatto = new Gatto();
        System.out.println("\nun gatto:");
        gatto.dormi();
        gatto.verso();
        gatto.mangia();
	}

}
