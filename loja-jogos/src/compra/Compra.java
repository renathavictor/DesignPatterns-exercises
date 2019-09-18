package compra;

import java.util.ArrayList;
import java.util.List;

import model.Jogo;

public class Compra {
	
    private List<Jogo> jogos = new ArrayList<Jogo>();
    private int tempo;
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private Funcionario funcionario;

    public float calcularCompra() {
        float result = 0;
        for (Jogo jogo: jogos) {
            result += jogo.calcularTotal();
        }
        return result;
    }
    
    public String solicitarAluguel(Jogo jogo) {
    	this.jogos.add(jogo);
        return "Jogo " + jogo.getNome() + " adicionado com sucesso";
    }

    public float finalizarCompra() {
        return this.calcularCompra();
    }


	public Compra(List<Jogo> jogos, int tempo, List<Cliente> clientes, Funcionario funcionario) {
		super();
		this.jogos = jogos;
		this.tempo = tempo;
		this.clientes = clientes;
		this.funcionario = funcionario;
	}

	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Jogo> getJogos() {
		return jogos;
	}
	
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Compra [jogos=" + jogos + ", tempo=" + tempo + ", clientes=" + clientes + ", funcionario=" + funcionario
				+ "]";
	}

    
}
