package compra;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String filial;


	public Funcionario(int idFunc, String nomeFunc, String filial) {
		super();
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.filial = filial;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	@Override
	public String toString() {
		return "Funcionario [idFunc=" + idFunc + ", nomeFunc=" + nomeFunc + ", filial=" + filial + "]";
	}
    
    
}
