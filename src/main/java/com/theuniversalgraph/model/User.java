package com.theuniversalgraph.model;

import java.util.Collection;

import lombok.Data;

@Data
public class User {
	Collection<NodeField> nodeFields;
	String name;
	String mail;
	String password;
	String profile;
	boolean developer;
	Integer id;
}
