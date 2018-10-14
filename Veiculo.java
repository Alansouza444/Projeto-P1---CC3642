import java.util.Random;

public class Veiculo {
	
    Random aleatorio = new Random();    /// Função gerar posições dos veículos


	public Veiculo() {      ///Construtor para a classe veículo
		x = 0;
        y = 0; 
        vel = 0;
        fabrica = false; 
        cor = null; 
	}

	public Veiculo(int x, int y, int vel, String cor, boolean fabrica) {
		this.x = x;
		this.y = y;
		this.vel = vel;
		this.cor = cor;
		this.fabrica = fabrica;
	}

	public int setX() {
		x = aleatorio.nextInt(28);
		return x;
		
	}

	public void movX(int x) {
		this.x = x;
	}

	public void movY(int y) {
		this.y = y;
	}

	public int setY() {
		y = aleatorio.nextInt(58);
		return y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getVel() {
		return vel;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setFabrica(boolean status) {
		fabrica = status;
	}
	
	public boolean getFabrica() {   ///Função para verificar os veículos que estão em uma fabrica
		return fabrica;
	}
	
	private int x;
	private int y;
	private int vel;
	private boolean fabrica;
	private String cor;
}
