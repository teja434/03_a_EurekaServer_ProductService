package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

	@Id
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "product_code")
	private String productCode;
	@Column(name = "product_desc")
	private String productDesc;
	@Column(name = "product_price")
	private double price;
	@Column(name = "product_quantity")
	private String quantity;
	@Column(name = "product_imageurl")
	private String imageUrl;

}
