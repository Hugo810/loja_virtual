package com.br.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@jakarta.persistence.Entity
@Table(name = "CUPONDESCONTO")
@SequenceGenerator(name = "SEQ_CUPONDESCONTO", sequenceName = "SEQ_CCUPONDESCONTO", allocationSize = 1, initialValue = 1) 
public class CuponDesconto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CUPONDESCONTO")
    private Long id;
	
	private String codigodesconto;
	private BigDecimal valorrealdesconto;
	private BigDecimal valorpercdesconto;
	private Date datavencimcupon;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigodesconto() {
		return codigodesconto;
	}
	public void setCodigodesconto(String codigodesconto) {
		this.codigodesconto = codigodesconto;
	}
	public BigDecimal getValorrealdesconto() {
		return valorrealdesconto;
	}
	public void setValorrealdesconto(BigDecimal valorrealdesconto) {
		this.valorrealdesconto = valorrealdesconto;
	}
	public BigDecimal getValorpercdesconto() {
		return valorpercdesconto;
	}
	public void setValorpercdesconto(BigDecimal valorpercdesconto) {
		this.valorpercdesconto = valorpercdesconto;
	}
	public Date getDatavencimcupon() {
		return datavencimcupon;
	}
	public void setDatavencimcupon(Date datavencimcupon) {
		this.datavencimcupon = datavencimcupon;
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
		CuponDesconto other = (CuponDesconto) obj;
		return Objects.equals(id, other.id);
	}
		
}
