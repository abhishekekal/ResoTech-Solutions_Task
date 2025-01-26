package com.Task.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class stockInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	
   private String  Symbol;
	private int Current_Price;
private int  Open;
private int Close;
private String History;




public stockInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public stockInfo(int id, String symbol, int current_Price, int open, int close, String history) {
	super();
	this.id = id;
	Symbol = symbol;
	Current_Price = current_Price;
	Open = open;
	Close = close;
	History = history;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSymbol() {
	return Symbol;
}
public void setSymbol(String symbol) {
	Symbol = symbol;
}
public float getCurrent_Price() {
	return Current_Price;
}
public void setCurrent_Price(int current_Price) {
	Current_Price = current_Price;
}
public float getOpen() {
	return Open;
}
public void setOpen(int open) {
	Open = open;
}
public float getClose() {
	return Close;
}
public void setClose(int close) {
	Close = close;
}
public String getHistory() {
	return History;
}
public void setHistory(String history) {
	History = history;
}



}
