package com.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@jakarta.persistence.Entity
@Table(name = "NOTAITEMPRODUTO")
@SequenceGenerator(name = "SEQ_NOTAITEMPRODUTO", sequenceName = "SEQ_NOTAITEMPRODUTO", allocationSize = 1, initialValue = 1) 
public class NotaItemProduto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTAITEMPRODUTO")
    private Long id;
	private Double qtd;
	
	@ManyToOne(targetEntity = Produto.class)
	@JoinColumn(name = "PRODUTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PRODUTO_ID"))
	private Produto produto;
	
	@ManyToOne(targetEntity = Produto.class)
	@JoinColumn(name = "NOTAFISCALCOMPRA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_NOTAFISCALCOMPRA_ID"))
	private NotaFiscalCompra notafiscalcompra;

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

	public NotaFiscalCompra getNotafiscalcompra() {
		return notafiscalcompra;
	}

	public void setNotafiscalcompra(NotaFiscalCompra notafiscalcompra) {
		this.notafiscalcompra = notafiscalcompra;
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
		NotaItemProduto other = (NotaItemProduto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
