package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orderlist")
public class Orderlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer listcode;
	
	@ManyToOne
	@JoinColumn(name ="onum")
	private Order order;

	private Integer quantity;
	private Integer totalprice;
	
	@ManyToOne
	@JoinColumn(name="pcode")
	private Product product;


}
