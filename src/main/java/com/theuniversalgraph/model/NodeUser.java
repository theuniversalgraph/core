package com.theuniversalgraph.model;

import java.util.Collection;

import lombok.Data;

@Data
public class NodeUser {
	Integer id;
	Node node;
	User user;
	boolean universal; 
	String type; 
	boolean asowner;
}
