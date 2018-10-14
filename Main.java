public class Main {

	public static void main(String[] args) throws InterruptedException {
		Mundo m = new Mundo();
		
		m.criaVeiculos();
		m.criaMundo();
		
		int i = 0;
		
		while (i == 0) {
			m.updateMundo();
			Thread.sleep(300);  
		}
	}
}
