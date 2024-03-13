package ca.uwaterloo.cs446.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/** 
 * Common interface for subject.
 * The list of observers is maintained here.
 */
public abstract class Subject {
	private List<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void sendNotice() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
	
	public abstract int getState();
	public abstract void setState(int state);
}
