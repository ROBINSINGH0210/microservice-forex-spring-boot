package com.microservice.forex.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Forex_Rates")
public class ForexEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "cur_from")
	private String from;
	@Column(name = "cur_to")
	private String to;
	@Column
	private BigDecimal convMul;
	@Column
	private int port;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConvMul() {
		return convMul;
	}

	public void setConvMul(BigDecimal convMul) {
		this.convMul = convMul;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ForexEntity [id=").append(id).append(", from=").append(from).append(", to=").append(to)
				.append(", convMul=").append(convMul).append(", port=").append(port).append("]");
		return builder.toString();
	}

}
