package com.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import com.br.enums.StatuscontaPagar;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Entity
@Table(name = "CONTA_PAGAR")
@SequenceGenerator(name = "CONTA_PAGAR", sequenceName = "CONTA_PAGAR", allocationSize = 1, initialValue = 1)
public class Conta_Pagar implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTA_PAGAR")
	private Long id;
	@Enumerated(EnumType.STRING)
	private StatuscontaPagar status;
	
	private BigDecimal valorDesconto;

	@Temporal(TemporalType.DATE)
	private Date dtVencimento;

	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	private BigDecimal valorTotal;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "FORN_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_FORN_ID"))
    private Pessoa pessoa_fornecedor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatuscontaPagar getStatus() {
		return status;
	}

	public void setStatus(StatuscontaPagar status) {
		this.status = status;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa_fornecedor() {
		return pessoa_fornecedor;
	}

	public void setPessoa_fornecedor(Pessoa pessoa_fornecedor) {
		this.pessoa_fornecedor = pessoa_fornecedor;
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
		Conta_Pagar other = (Conta_Pagar) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
