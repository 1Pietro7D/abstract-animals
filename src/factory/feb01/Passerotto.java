package factory.feb01;

public class Passerotto extends Animale implements Volare {

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("cip-cip");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("insetti");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("so volare");
	}

}
