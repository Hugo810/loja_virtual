package com.br.enums;

public enum StatuscontaPagar {

	COBRANCA("Pagar"), VENCIDA("Vencida"), ABERTA("Aberta"), QUITADA("Quitada");

	private String descricao;

	private StatuscontaPagar(String descricao) {
		this.descricao = descricao;
	}

	public String get(String descricao) {
		return descricao;
	}

	public String toStringr() {
		return this.descricao;
	}

}
