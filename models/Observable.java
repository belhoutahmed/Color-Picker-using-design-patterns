package models;
import java.util.ArrayList;
import java.util.Vector;
import vues.Observer;

public interface Observable {
	ArrayList<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	
	public void notifyAllObservateur();
}
