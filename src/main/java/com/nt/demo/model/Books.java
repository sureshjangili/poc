package com.nt.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Books {
@Id
private int bid;
@Column
private String bname;
@Column
private String author;
@Column
private double bprice;


public Books() {
	super();
	// TODO Auto-generated constructor stub
}


public Books(int bid, String bname, String author, double bprice) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.author = author;
	this.bprice = bprice;
}


public int getBid() {
	return bid;
}


public void setBid(int bid) {
	this.bid = bid;
}


public String getBname() {
	return bname;
}


public void setBname(String bname) {
	this.bname = bname;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public double getBprice() {
	return bprice;
}


public void setBprice(double bprice) {
	this.bprice = bprice;
}


@Override
public String toString() {
	return "Books [bid=" + bid + ", bname=" + bname + ", author=" + author + ", bprice=" + bprice + "]";
}



}
