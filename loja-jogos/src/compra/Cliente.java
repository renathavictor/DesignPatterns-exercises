package compra;

public class Cliente {
    private int idCliente;
    private String nome;
    
	public Cliente(int idCliente, String nome) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + "]";
	}
    
    
}
