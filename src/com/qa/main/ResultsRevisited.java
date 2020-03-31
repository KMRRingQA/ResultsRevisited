package com.qa.main;

public class ResultsRevisited {

	private Integer physics = 0;
	private Integer chemistry = 0;
	private Integer biology = 0;

	public Integer getBiology() {
		return biology;
	}

	public Integer getChemistry() {
		return chemistry;
	}

	public Integer getPhysics() {
		return physics;
	}

	public void setBiology(Integer biology) {
		if (0 > biology || biology > 150) {
			return;
		}
		this.biology = biology;
	}

	public void setChemistry(Integer chemistry) {
		if (0 > chemistry || chemistry > 150) {
			return;
		}
		this.chemistry = chemistry;
	}

	public void setPhysics(Integer physics) {
		if (0 > physics || physics > 150) {
			return;
		}
		this.physics = physics;
	}

	void showPercent() {
//		physics = this.getBiology();
//		chemistry = this.getChemistry();
//		biology = this.getPhysics();
		double percent = (physics + chemistry + biology) / 4.5;
		System.out.println("Your overall percentage score is: %" + percent);
		int failCount = 0;
		if (physics < 90) {
			failCount++;
			System.out.println("You have failed Physics.");
		}
		if (chemistry < 90) {
			failCount++;
			System.out.println("You have failed Chemistry.");
		}
		if (biology < 90) {
			failCount++;
			System.out.println("You have failed Biology.");
		}
		if (failCount > 0) {
			System.out.println(
					"You have failed the semester, as you have failed in " + failCount + " of your examinations.");
		}

	}

}
