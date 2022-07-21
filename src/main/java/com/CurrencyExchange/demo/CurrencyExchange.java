package com.CurrencyExchange.demo;

import java.math.BigInteger;

public class CurrencyExchange {

	private int id;
	private String from;
	private String to;
	private int port;
	private BigInteger value;
	private BigInteger quantity;
	private BigInteger total;
	
	public CurrencyExchange()
	{
		
	}
	
	
	
	
	public CurrencyExchange(int id, String from, String to, int port, BigInteger value, BigInteger quantity, BigInteger total) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
		this.value = value;
		this.quantity = quantity;
		this.total=total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public BigInteger getValue() {
		return value;
	}
	public void setValue(BigInteger value) {
		this.value = value;
	}
	public BigInteger getQuantity() {
		return quantity;
	}
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
	
	public BigInteger getTotal() {
		return total;
	}
	public void setTotal(BigInteger total) {
		this.total = total;
	}
	
	
}
