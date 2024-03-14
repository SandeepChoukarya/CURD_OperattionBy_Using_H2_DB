package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Book implements Serializable {
	@Id
	@GeneratedValue
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
