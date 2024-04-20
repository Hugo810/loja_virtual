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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@jakarta.persistence.Entity
@Table(name = "VENDALOJAVIRTUAL")
@SequenceGenerator(name = "SEQ_VENDALOJAVIRTUAL", sequenceName = "SEQ_VENDALOJAVIRTUAL", allocationSize = 1, initialValue = 1)
public class VendaLojaVirtual implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VENDALOJAVIRTUAL")
	private Long id;
	private BigDecimal valortotal;
	private BigDecimal valordesconto;
	private BigDecimal valorfrete;
	private Integer diasentrega;
	@Temporal(TemporalType.DATE)
	private Date datavenda;
	@Temporal(TemporalType.DATE)
	private Date dataentrega;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PESSOA"))
	private Pessoa pessoa;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "ENDERECOENTREGA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOENTREGA"))
	private Endereco enderecoentrega;

	@ManyToOne
	@JoinColumn(name = "ENDERECOCOBRANCA", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOCOBRANCA"))
	private Endereco enderecocobranca;

	@ManyToOne
	@JoinColumn(name = "FORMAPAGAMENTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_FORMAPAGAMENTO"))
	private FormaPagamnento formapagamento;

	@OneToOne
	@JoinColumn(name = "NOTAFISCALVENDA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_NOTAFISCALVENDA"))
	private NotaFiscalVenda notafiscalvenda;

	@ManyToOne
	@JoinColumn(name = "CUPON_DESCONTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_CUPONDESCONTO"))
	private CuponDesconto cupondesconto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getValorfrete() {
		return valorfrete;
	}

	public void setValorfrete(BigDecimal valorfrete) {
		this.valorfrete = valorfrete;
	}

	public Integer getDiasentrega() {
		return diasentrega;
	}

	public void setDiasentrega(Integer diasentrega) {
		this.diasentrega = diasentrega;
	}

	public Date getDatavenda() {
		return datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	public Date getDataentrega() {
		return dataentrega;
	}

	public void setDataentrega(Date dataentrega) {
		this.dataentrega = dataentrega;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEnderecoentrega() {
		return enderecoentrega;
	}

	public void setEnderecoentrega(Endereco enderecoentrega) {
		this.enderecoentrega = enderecoentrega;
	}

	public Endereco getEnderecocobranca() {
		return enderecocobranca;
	}

	public void setEnderecocobranca(Endereco enderecocobranca) {
		this.enderecocobranca = enderecocobranca;
	}

	public FormaPagamnento getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(FormaPagamnento formapagamento) {
		this.formapagamento = formapagamento;
	}

	public NotaFiscalVenda getNotafiscalvenda() {
		return notafiscalvenda;
	}

	public void setNotafiscalvenda(NotaFiscalVenda notafiscalvenda) {
		this.notafiscalvenda = notafiscalvenda;
	}

	public CuponDesconto getCupondesconto() {
		return cupondesconto;
	}

	public void setCupondesconto(CuponDesconto cupondesconto) {
		this.cupondesconto = cupondesconto;
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
		VendaLojaVirtual other = (VendaLojaVirtual) obj;
		return Objects.equals(id, other.id);
	}

}
