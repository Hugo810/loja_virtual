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
@Table(name = "NOTAFISCALCOMPRA")
@SequenceGenerator(name = "SEQ_NOTAFISCALCOMPRA", sequenceName = "SEQ_NOTAFISCALCOMPRA", allocationSize = 1, initialValue = 1) 
public class NotaFiscalCompra  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTAFISCALCOMPRA")
    private Long id;
	
	private String numeronota;
	private String serienota;
	private String descricaoobs;
	private BigDecimal valortotal;
	private BigDecimal valordesconto;
	private BigDecimal valoricms;
	
	@Temporal(TemporalType.DATE)
	private Date datacompra;
	
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Conta_Pagar.class)
	@JoinColumn(name = "CONTA_PAGAR_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Conta_Pagar conta_pagar;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeronota() {
		return numeronota;
	}

	public void setNumeronota(String numeronota) {
		this.numeronota = numeronota;
	}

	public String getSerienota() {
		return serienota;
	}

	public void setSerienota(String serienota) {
		this.serienota = serienota;
	}

	public String getDescricaoobs() {
		return descricaoobs;
	}

	public void setDescricaoobs(String descricaoobs) {
		this.descricaoobs = descricaoobs;
	}

	public BigDecimal getValortotal() {
		return valortotal;
	}

	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}

	public BigDecimal getValordesconto() {
		return valordesconto;
	}

	public void setValordesconto(BigDecimal valordesconto) {
		this.valordesconto = valordesconto;
	}

	public BigDecimal getValoricms() {
		return valoricms;
	}

	public void setValoricms(BigDecimal valoricms) {
		this.valoricms = valoricms;
	}

	public Date getDatacompra() {
		return datacompra;
	}

	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Conta_Pagar getConta_pagar() {
		return conta_pagar;
	}

	public void setConta_pagar(Conta_Pagar conta_pagar) {
		this.conta_pagar = conta_pagar;
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
		NotaFiscalCompra other = (NotaFiscalCompra) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
