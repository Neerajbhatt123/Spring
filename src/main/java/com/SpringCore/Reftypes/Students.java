package com.SpringCore.Reftypes;

public class Students {
	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Students [scores=" + scores + "]";
	}
	
	
	
}
