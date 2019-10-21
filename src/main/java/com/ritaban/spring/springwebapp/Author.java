package com.ritaban.spring.springwebapp;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Author 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String firstname;
	private String lastname;
	
	@ManyToMany(mappedBy = ("authors"))
	private Set<Book> books=new HashSet<>();

	public Author(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Author(String firstname, String lastname, Set<Book> books) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.books = books;
	}
	
	
}
