package br.edu.ifms.detran.dto;

public class InfracaoDto {
	private Long id;
	private String descricao;
	private int pontos;
	private float valor;
	
	public InfracaoDto() {
		// TODO Auto-generated constructor stub
	}

	public InfracaoDto(Long id, String descricao, int pontos, float valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pontos = pontos;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	

}
