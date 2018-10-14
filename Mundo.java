import java.util.ArrayList;

public class Mundo {

	Veiculo v = new Veiculo();
/* Criando ArrayList de todos os veiculos*/
	ArrayList <Carro> car = new ArrayList<>();
	ArrayList <Caminhao> truck = new ArrayList<>();
	ArrayList <Moto> mbike = new ArrayList<>();
  ArrayList <Bicicleta> bike = new ArrayList<>();

	public int mapa[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	

	public void criaVeiculos() {    /*Função para criar os veiculos*/
		for(int i = 0; i < 10; i++) {
			car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
			while (mapa[car.get(i).getX()][car.get(i).getY()] == 2) {
				car.get(i).setX();
				car.get(i).setY();
			}

			truck.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
			while (mapa[truck.get(i).getX()][truck.get(i).getY()] == 2) {
				truck.get(i).setX();
				truck.get(i).setY();
			}

			mbike.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
			while (mapa[mbike.get(i).getX()][mbike.get(i).getY()] == 2) {
				mbike.get(i).setX();
				mbike.get(i).setY();
			}
            
      bike.add(new Bicicleta((v.setX()+1), (v.setY()+1), (1/2), "azul", false));
      while (mapa[bike.get(i).getX()][bike.get(i).getY()] == 2) {
        bike.get(i).setX();
        bike.get(i).setY();
      }
		}		
	}

	public void remakeMapa() {  /*Função para refazer o mapa*/
		for(int i = 0; i<30; i++) {
			for(int j = 0; j < 60; j++) {
				if(mapa[i][j] != 1 && mapa[i][j] != 2) {
					mapa[i][j] = 0;
				}
			}
		}

		for (int a = 0; a < car.size(); a++) {
			int xa = car.get(a).getX();
			int ya = car.get(a).getY();
			

			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xa && j == ya) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 3;
						}
					}
				}
			}
		}
		
		for(int a  = 0; a < truck.size(); a++) {
			int ba = truck.get(a).getX();
			int ca = truck.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ba && j == ca) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 4;
						}
					}
				}
			}
		}
		
		for(int a = 0; a < mbike.size(); a ++) {
			int ea = mbike.get(a).getX();
			int fa = mbike.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == ea && j == fa) {
						if(mapa[i][j] == 2) {
							mapa[i][j] = 2;
							
						}
						else {
							mapa[i][j] = 5;
						}
					}
				}
			}	
		}
		
    for(int a = 0; a < bike.size(); a ++) {
      int ga = bike.get(a).getX();
      int ha = bike.get(a).getY();
            
      for(int i = 0; i<30; i++) {
        for(int j = 0; j < 60; j++) {
          if(i == ga && j == ha) {
          if(mapa[i][j] == 2) {
            mapa[i][j] = 2;
                            
            }
            else {
              mapa[i][j] = 6;
            }
          }
        }
      }	
    }
	}

	public void criaMundo() {   /*Função para criar o mundo*/

		int carros = 0;
		int motos = 0;
		int caminhoes = 0;
    int bicicletas = 0;
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {

					if(mapa[i][j] == 1) {
						System.out.print("\u001b[47m \033[0m");
					}
					else if(mapa[i][j] == 0) {
						System.out.print(" ");
					}
					
					else if(mapa[i][j] == 2) {
						System.out.print("\u001b[42m \033[0m");
					}
					else if(mapa[i][j] == 3){
						System.out.print("\u001b[44m \033[0m");
					}
					else if(mapa[i][j] == 4){
						System.out.print("\u001b[43;1m \033[0m");
					}
					else if(mapa[i][j] == 5){
						System.out.print("\u001b[41m \033[0m");
					}
          else if(mapa[i][j] == 6){
            System.out.print("\u001b[45m \033[0m");
          }
				}
				
				System.out.println("");
			}	

			System.out.print("\u001b[44m \033[0m");
			System.out.print(" Carros   ");
			System.out.print("\u001b[41m \033[0m");
			System.out.print(" Motos   ");
      System.out.print("\u001b[45m \033[0m");
      System.out.print(" Bicicletas   ");
			System.out.print("\u001b[43;1m \033[0m");
			System.out.println(" Caminhões");

			for(int a = 0; a < car.size(); a++) {
				carros++;
			}
			for(int a = 0; a < truck.size(); a++) {
				caminhoes++;
			}
			for(int a = 0; a < mbike.size(); a++) {
				motos++;
			}
      for(int a = 0; a < bike.size(); a++) {
                bicicletas++;
      }
			
		
			System.out.println("Número de carros: " + carros);
			System.out.println("Número de caminhões: " + caminhoes);
			System.out.println("Número de motos: " + motos);
      System.out.println("Número de bicicletas: " + bicicletas);
	}

	public void updateMundo() {     /*Função para realizar os movimentos dos veiculos*/
		for(int i = 0; i < car.size(); i++) {
			car.get(i).movimento(car.get(i));
		}
		
		for (int i = 0; i < truck.size(); i ++) {
			truck.get(i).movimento(truck.get(i));
		}
		
		for (int i = 0; i < mbike.size(); i ++) {
			mbike.get(i).movimento(mbike.get(i));
		}

    for (int i = 0; i < bike.size(); i ++) {
      bike.get(i).movimento(bike.get(i));
    }
		
		criaVeiculo();
		checkAcidente();
		remakeMapa();
		drawMundo();
	}

	public void checkAcidente() {           /*Função para verificar se houve acidentes, o veiculo menor ou igual é removido*/
		for (int i = 0; i < car.size(); i ++) {
			for (int j = 0; j < car.size(); j++) {
				if(car.get(j).getX() == car.get(i).getX() && car.get(j).getY() == car.get(i).getY()) {
					if (i == j) {
						
					}
					else {
						car.remove(car.get(i));
					}	
				}
			}
		}
		for (int i = 0; i < truck.size(); i ++) {
			for (int j = 0; j < truck.size(); j++) {
				if(truck.get(j).getX() == truck.get(i).getX() && truck.get(j).getY() == truck.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						truck.remove(truck.get(i));
					}	
				}
			}
		}
		for (int i = 0; i < mbike.size(); i ++) {
			for (int j = 0; j < mbike.size(); j++) {
				if(mbike.get(j).getX() == mbike.get(i).getX() && mbike.get(j).getY() == mbike.get(i).getY()) {
					if(i == j) {
						
					}
					else {
						mbike.remove(mbike.get(i));
					}	
				}
			}
		}
    for (int i = 0; i < bike.size(); i ++) {
      for (int j = 0; j < bike.size(); j++) {
        if(bike.get(j).getX() == bike.get(i).getX() && bike.get(j).getY() == bike.get(i).getY()) {
          if(i == j) {
                        
          }
          else {
            bike.remove(bike.get(i));
          }	
        }
      }
    }
		for(int i = 0; i < truck.size(); i++) {
			for (int j = 0; j < car.size(); j++) {
				if(car.get(j).getX() == truck.get(i).getX() && car.get(j).getY() == truck.get(i).getY()) {
					if(truck.size() > car.size()) {
						
					}
					else {
						car.remove(car.get(j));
					}
				}
			}
		}
		for(int i = 0; i < truck.size(); i++) {
			for (int j = 0; j < mbike.size(); j++) {
				if(mbike.get(j).getX() == truck.get(i).getX() && mbike.get(j).getY() == truck.get(i).getY()) {
					if(truck.size() > mbike.size()) {
						
					}
					else {
						mbike.remove(mbike.get(j));
					}
				}
			}
		}
    for(int i = 0; i < truck.size(); i++) {
      for (int j = 0; j < bike.size(); j++) {
        if(bike.get(j).getX() == truck.get(i).getX() && bike.get(j).getY() == truck.get(i).getY()) {
          if(truck.size() > bike.size()) {
                        
          }
          else {
            bike.remove(mbike.get(j));
          }
        }
      }
    }
		for(int i = 0; i < car.size(); i++) {
			for (int j = 0; j < mbike.size(); j++) {
				if(mbike.get(j).getX() == car.get(i).getX() && mbike.get(j).getY() == car.get(i).getY()) {
					if(car.size()>mbike.size()) {
						
					}
					else {
						mbike.remove(mbike.get(i));
					}
					
				}
			}
		}
    for(int i = 0; i < car.size(); i++) {
      for (int j = 0; j < bike.size(); j++) {
        if(bike.get(j).getX() == car.get(i).getX() && bike.get(j).getY() == car.get(i).getY()) {
          if(car.size()>bike.size()) {
                        
          }
          else {
            bike.remove(bike.get(i));
          }
                    
        }
      }
    }
    for (int i = 0; i < mbike.size(); i ++) {
      for (int j = 0; j < bike.size(); j++) {
        if(bike.get(j).getX() == mbike.get(i).getX() && bike.get(j).getY() == mbike.get(i).getY()) {
          if(i == j) {
                        
          }
          else {
            mbike.remove(bike.get(i));
          }	
        }
      }
    }
	}

	public void criaVeiculo() {         /*Função para duplicar um veiculo quando ele passar em uma das fabricas*/
		for(int a = 0; a < car.size(); a++) {
			int x = car.get(a).getX();
			int y = car.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && car.get(a).getFabrica() == false) {
								car.get(a).setFabrica(true); 
								car.add(new Carro((v.setX()+1), (v.setY()+1), 2, "verde", false));
								}
							}
						}
					}
				}
		
		for(int a = 0; a < truck.size(); a++) {
			int x = truck.get(a).getX();
			int y = truck.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && truck.get(a).getFabrica() == false) {
								truck.get(a).setFabrica(true);
								truck.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "amarelo", false));
								}
							}
						}
					}
				}
		
	
		for(int a = 0; a < mbike.size(); a++) {
			int x = mbike.get(a).getX();
			int y = mbike.get(a).getY();
				for(int i = 0; i < 30; i ++) {
					for(int j = 0; j < 60; j++) {
						if(i == x && j == y) {
							if(mapa[i][j] == 2 && mbike.get(a).getFabrica() == false) {
								mbike.get(a).setFabrica(true);
								mbike.add(new Moto((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
							}
						}
					}
				}
            
    }       
    for(int a = 0; a < bike.size(); a++) {
      int x = bike.get(a).getX();
      int y = bike.get(a).getY();
        for(int i = 0; i < 30; i ++) {
          for(int j = 0; j < 60; j++) {
            if(i == x && j == y) {
              if(mapa[i][j] == 2 && bike.get(a).getFabrica() == false) {
                bike.get(a).setFabrica(true);
                bike.add(new Bicicleta((v.setX()+1), (v.setY()+1), (1/2), "azul", false));
		          }
	          }
          }
        }
    }
  }             
}

