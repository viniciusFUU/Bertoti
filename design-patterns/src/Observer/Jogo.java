package Observer;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Observer> observers = new ArrayList<>();
    private boolean wasGoal = false;

    public boolean getWasGoal() {
        return wasGoal;
    }

    public void setWasGoal(boolean wasGoal) {
        this.wasGoal = wasGoal;
        notifyObservers();
    }

    public void gol(Observer observer){
        setWasGoal(true);
        observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
