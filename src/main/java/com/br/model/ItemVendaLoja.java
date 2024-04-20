package com.br.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "ITEMVENDALOJA")
@SequenceGenerator(name = "SEQ_ITEMVENDALOJA", sequenceName = "SEQ_ITEMVENDALOJA", allocationSize = 1, initialValue = 1)
public class ItemVendaLoja implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ITEMVENDALOJA")
	private Long id;
	
	@Column(nullable = false)
	private Double qtd;

	@ManyToOne
	@JoinColumn(name = "PRODUTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PRODUTO_ID"))
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "VENDALOJAVIRTUAL", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_VENDALOJAVIRTUAL_ID"))
	private VendaLojaVirtual vendalojavirtual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getQtd() {
		return qtd;
	}

	public void setQtd(Double qtd) {
		this.qtd = qtd;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public VendaLojaVirtual getVendalojavirtual() {
		return vendalojavirtual;
	}

	public void setVendalojavirtual(VendaLojaVirtual vendalojavirtual) {
		this.vendalojavirtual = vendalojavirtual;
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
		ItemVendaLoja other = (ItemVendaLoja) obj;
		return Objects.equals(id, other.id);
	}

}
