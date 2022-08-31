package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.omg.CORBA.PRIVATE_MEMBER;

@Entity
@Table(name= "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	
	
}
