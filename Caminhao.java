import java.util.Random;

public class Caminhao extends Veiculo{
	Veiculo v = new Veiculo();

	public Caminhao (int x, int y, int vel, String cor, boolean fabrica) {  /// Construtor para classe Caminhao
		super(x, y, vel, cor, fabrica);
	}

	Random direcao = new Random();

	public void movimento(Caminhao vint) {  ///Função para realizar as direções do caminhao
		trajeto = direcao.nextInt(4);

		if(trajeto == 0) {
			int x=vint.getX();
			x=x+1;
			vint.movX(modX(x));
		}
		if(trajeto == 1) {
			int x=vint.getX();
			x=x-1;
			vint.movX(modX(x));
		}
		if(trajeto == 2) {
			int y=vint.getY();
			y=y+1;
			vint.movY(modY(y));
		}
		if(trajeto == 3) {
			int y=vint.getY();
			y=y-1;
			vint.movY(modY(y));
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
