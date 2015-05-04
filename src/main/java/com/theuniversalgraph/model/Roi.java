package com.theuniversalgraph.model;

import lombok.Data;

@Data
public class Roi {
	Node node;
	Integer id;
	Graph graph;
	boolean done = false;
	boolean triedAtLeastOnce = false;
	boolean oneshot = false;
	String scaleWith = "";
	boolean cf = false;
	int timeIncrease = 0;
	int moneyIncrease =0;
	int possibility = 0;
	int moneyIncreaseAsSideEffect = 0;
	int sideEffectPossibility = 0;
	int timeNeeded =0;
	int moneyNeeded = 0;
	int outsourcability = 0;
	float totalNeeded = 0;
	double simpleRoi = 0;
	int totalIncrease = 0;
	boolean breakdown = false;
	boolean essentialisable = false;
	boolean brokenDown = false;

}
