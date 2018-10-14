import java.util.Random;

public class Bicicleta extends Veiculo{
	Veiculo v = new Veiculo();

	public Bicicleta (int x, int y, int vel, String cor, boolean fabrica) { /// Construtor para classe Bicicleta
		super(x, y, vel, cor, fabrica);
	}
	Random direcao = new Random();

	public void movimento(Bicicleta vinb) { ///Função para realizar as direções do bicicleta
		trajeto = direcao.nextInt(4);

		if(trajeto == 0) {
			int x=vinb.getX();
			x=x+(1/2);
			vinb.movX(modX(x));
		}
		if(trajeto == 1) {
			int x=vinb.getX();
			x=x-(1/2);
			vinb.movX(modX(x));
		}
		if(trajeto == 2) {
			int y=vinb.getY();
			y=y+(1/2);
			vinb.modY(modY(y));
		}
		if(trajeto == 3) {
			int y=vinb.getY();
			y=y-(1/2);
			vinb.modY(modY(y));
		}
	}
	public int modX(int x) {    /// Função que delimita os limites do mapa em X
		if (x>=29) {
			x=1;
		}
		if(x<=0) {
			x=28;
		}
		return x;
	}
	public int modY(int y) {    /// Função que delimita os limites do mapa em Y
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
