package com.londonappbrewery.destini;

/**
 * Created by User on 02/12/2017.
 */

public class History {
	private int ifSelectThisAnswer;
	private int thisStory;
	private int thisAns1;
	private int thisAns2;

	public History(int ifSelectThisAnswer, int thisStory, int thisAns1, int thisAns2) {
		this.ifSelectThisAnswer = ifSelectThisAnswer;
		this.thisStory = thisStory;
		this.thisAns1 = thisAns1;
		this.thisAns2 = thisAns2;
	}

	public int getIfSelectThisAnswer() {
		return ifSelectThisAnswer;
	}

	public void setIfSelectThisAnswer(int ifSelectThisAnswer) {
		this.ifSelectThisAnswer = ifSelectThisAnswer;
	}

	public int getThisStory() {
		return thisStory;
	}

	public void setThisStory(int thisStory) {
		this.thisStory = thisStory;
	}

	public int getThisAns1() {
		return thisAns1;
	}

	public void setThisAns1(int thisAns1) {
		this.thisAns1 = thisAns1;
	}

	public int getThisAns2() {
		return thisAns2;
	}

	public void setThisAns2(int thisAns2) {
		this.thisAns2 = thisAns2;
	}
}
