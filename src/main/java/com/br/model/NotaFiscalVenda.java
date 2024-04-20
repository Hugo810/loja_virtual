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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@jakarta.persistence.Entity
@Table(name = "NOTAFISCALVENDA")
@SequenceGenerator(name = "SEQ_NOTAFISCALVENDA", sequenceName = "SEQ_NOTAFISCALVENDA", allocationSize = 1, initialValue = 1) 
public class NotaFiscalVenda  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTAFISCALVENDA")
    private Long id;
	
	private String numeronota;
	private String serienota;
	private String tipo;
	@Column(columnDefinition = "text")
	private String xml;
	@Column(columnDefinition = "text")
	private String pdf;
	
	@OneToOne
	@JoinColumn(name = "VENDACOMPRALOJAVIRTUAL", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_VENDACOMPRALOJAVIRTUAL"))
	private VendaLojaVirtual vendacompralojavirtual;
	

	/*@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Conta_Pagar.class)
	@JoinColumn(name = "CONTA_PAGAR_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Conta_Pagar conta_pagar;*/

	
	
}
