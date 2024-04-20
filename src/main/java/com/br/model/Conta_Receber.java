package com.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.br.enums.StatusContaReceber;

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
@Table(name = "CONTA_RECEBER")
@SequenceGenerator(name = "CONTA_RECEBER", sequenceName = "CONTA_RECEBER", allocationSize = 1, initialValue = 1)
public class Conta_Receber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTA_RECEBER")
	private Long id;
	@Enumerated(EnumType.STRING)
	private StatusContaReceber status;

	@Temporal(TemporalType.DATE)
	private Date dtVencimento;

	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	private BigDecimal valorTotal;

	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_ENDERECOS_PESSOAS_ID"))
	private Pessoa pessoa;

}
