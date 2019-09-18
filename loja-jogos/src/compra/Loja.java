package compra;

import java.util.ArrayList;
import java.util.List;

import model.Jogo2D;
import model.Jogo3D;
import model.JogoTabuleiro;

public class Loja {
	
    public static void main(String[] args) {
    	
    	List<String> aderecos = new ArrayList<>();
    	aderecos.add("dados");
    	aderecos.add("cartas");
    	aderecos.add("peças");

    	// item da loja
    	JogoTabuleiro tabuleiroWar = new JogoTabuleiro(1, "WAR", 5, 20, 6, "estrategia", aderecos);
    	Jogo2D kingFight = new Jogo2D(2, "King of Fighters", 6, 15, 2, "Nintendo switch", 2);
    	Jogo3D gta = new Jogo3D(3, "GTA V", 10, 15, 1, "PS4", 1);
    	
    	// cadastro funcionario
    	
    	Funcionario jerry = new Funcionario(1, "Jerry", "Loja Um");
    	
    	// cadastro cliente
    	
    	Cliente mike = new Cliente(1, "Michael");
    	Cliente amy = new Cliente(2, "Amy");
    	Cliente jake = new Cliente(3, "Jake");

    	
    	// realizar aluguel
    	
    	Compra compra1 = new Compra();
    	compra1.setFuncionario(jerry);
    	compra1.setCliente(amy);
    	compra1.setCliente(mike);
    	compra1.setTempo(20);
    	
    	System.out.println(compra1.solicitarAluguel(kingFight));    	
    	System.out.println("Compra finalizada.\nPreco: R$ " + compra1.finalizarCompra());
    }
    
}
