package factory.feb01;

public class Aquila extends Animale implements Volare {

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("eeeeeeek");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("carnivoro");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("so volare");
	}

}
