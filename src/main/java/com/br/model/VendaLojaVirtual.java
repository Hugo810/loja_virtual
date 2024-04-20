package com.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@jakarta.persistence.Entity
@Table(name = "VENDALOJAVIRTUAL")
@SequenceGenerator(name = "SEQ_VENDALOJAVIRTUAL", sequenceName = "SEQ_VENDALOJAVIRTUAL", allocationSize = 1, initialValue = 1) 
public class VendaLojaVirtual  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VENDALOJAVIRTUAL")
    private Long id;
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PESSOA"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PESSOA"))
	private Endereco enderecoentrega;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_PESSOA"))
	private Endereco enderecocobranca;
	
	private BigDecimal valortotal;
	private BigDecimal valordesconto;
	private BigDecimal valorfrete;
	private int diasentrega;
	@Temporal(TemporalType.DATE)
	private Date datavenda;
	@Temporal(TemporalType.DATE)
	private Date dataentrega;
	
	
	
	
	
	

	/*@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Conta_Pagar.class)
	@JoinColumn(name = "CONTA_PAGAR_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Conta_Pagar conta_pagar;*/

	
	
}
