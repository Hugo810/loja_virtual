package com.br.model;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "PRODUTOS")
@SequenceGenerator(name = "SEQ_PRODUTOS", sequenceName = "SEQ_PRODUTOS", allocationSize = 1, initialValue = 1) 
public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTOS")
    private Long id;
    
    private String tipounidade;
    private String nome;
    @Column(columnDefinition = "text",length = 2000)
    private String descricao;
    /**notaitemproduto**/
    private Double peso;
    private boolean ativo = Boolean.TRUE;
    
    private Double largura;
    private Double altura;
    private Double profundidade;
    private BigDecimal valordevenda;
    private int qtdestoque;
    private int qtdalertaestoque;
    private String linkyoutube;
    private boolean alertaqtdestoque;
    private int qtdclick;
    
    
    
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipounidade() {
		return tipounidade;
	}
	public void setTipounidade(String tipounidade) {
		this.tipounidade = tipounidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}
	public BigDecimal getValordevenda() {
		return valordevenda;
	}
	public void setValordevenda(BigDecimal valordevenda) {
		this.valordevenda = valordevenda;
	}
	public int getQtdestoque() {
		return qtdestoque;
	}
	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}
	public int getQtdalertaestoque() {
		return qtdalertaestoque;
	}
	public void setQtdalertaestoque(int qtdalertaestoque) {
		this.qtdalertaestoque = qtdalertaestoque;
	}
	public String getLinkyoutube() {
		return linkyoutube;
	}
	public void setLinkyoutube(String linkyoutube) {
		this.linkyoutube = linkyoutube;
	}
	public boolean isAlertaqtdestoque() {
		return alertaqtdestoque;
	}
	public void setAlertaqtdestoque(boolean alertaqtdestoque) {
		this.alertaqtdestoque = alertaqtdestoque;
	}
	public int getQtdclick() {
		return qtdclick;
	}
	public void setQtdclick(int qtdclick) {
		this.qtdclick = qtdclick;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
      
}