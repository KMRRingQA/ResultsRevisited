package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		ResultsRevisited results = new ResultsRevisited();
		results.setBiology(80);
		results.setChemistry(120);
		results.setPhysics(100);
		results.showPercent();
	}

}
