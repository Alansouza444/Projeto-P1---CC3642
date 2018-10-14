import java.util.Random;

public class Carro extends Veiculo{
	Veiculo v = new Veiculo();

	public Carro (int x, int y, int vel, String cor, boolean fabrica) { /// Construtor para classe Carro
		super(x, y, vel, cor, fabrica);
	}
	Random direcao = new Random();

	public void movimento(Carro vinc) {         ///Função para realizar as direções do carro
		trajeto = direcao.nextInt(4);
		
		if(trajeto == 0) {
			int x=vinc.getX();
			x=x+2;
			vinc.movX(modX(x));
		}
		if(trajeto == 1) {
			int x=vinc.getX();
			x=x-2;
			vinc.movX(modX(x));
		}
		if(trajeto == 2) {
			int y=vinc.getY();
			y=y+2;
			vinc.movY(modY(y));
		}
		if(trajeto == 3) {
			int y=vinc.getY();
			y=y-2;
			vinc.movY(modY(y));
		}
	}
	public int modX(int x) {  /// Função que delimita os limites do mapa em X
		if (x>=29) {
			x=1;
		}
		if(x<=0) {
			x=28;
		}
		return x;
	}
	public int modY(int y) { /// Função que delimita os limites do mapa em Y
		if (y>=59) {
			y=1;
		}
		if(y<=0) {
			y=58;
		}
		return y;
	}
	private int trajeto;
}
