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
@Table(name = "IMAGEM_PRODUTOS")
@SequenceGenerator(name = "SEQ_IMAGEM_PRODUTOS", sequenceName = "SEQ_IMAGEM_PRODUTOS", allocationSize = 1, initialValue = 1)
public class ImagemProduto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_IMAGEM_PRODUTOS")
	private Long id;
	@Column(nullable = false)
	private String imagemoriginal;
	@Column(nullable = false)
	private String imagemminiatura;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PRODUTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_FORN_ID"))
	private Produto produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImagemoriginal() {
		return imagemoriginal;
	}

	public void setImagemoriginal(String imagemoriginal) {
		this.imagemoriginal = imagemoriginal;
	}

	public String getImagemminiatura() {
		return imagemminiatura;
	}

	public void setImagemminiatura(String imagemminiatura) {
		this.imagemminiatura = imagemminiatura;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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
		ImagemProduto other = (ImagemProduto) obj;
		return Objects.equals(id, other.id);
	}

}
