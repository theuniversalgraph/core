package com.theuniversalgraph.model;

import java.util.Collection;

import lombok.Data;

@Data
public class NodeField {
	Integer id;
	User user;
	Collection<Node> nodes;
	Collection<LinkUse> linkUses;
}
