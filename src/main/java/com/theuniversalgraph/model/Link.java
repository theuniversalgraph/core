package com.theuniversalgraph.model;

import java.util.Collection;

import lombok.Data;

@Data
public class Link {
	Node parent;
	Node child;
	float likelihood;
	int linkUseCount;
	int linkUseCancelationCount;
}
