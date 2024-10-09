package com.mgntask.model;

public enum Prioridade {
	
	ALTA("Deve ser realizado de forma urgente"),
	MEDIA("É importante, mas não é urgente"),
	BAIXA("Deve ser feito, mas não é importante nem urgente");

	private String descricao;

	private Prioridade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


}
