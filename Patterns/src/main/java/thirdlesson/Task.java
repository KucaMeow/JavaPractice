package thirdlesson;

import thirdlesson.states.State;

public interface Task {
    public void up();
    public void up(int id);
    public void down();
    public void down(String error);
    public TaskImpl castToTaskImpl();
    public int getId();
    public State getState();
    public void setState(State state);
    public int getDeveloperId();
    public void setDeveloperId(int developerId);
    public int getTesterId();
    public void setTesterId(int testerId);
    public String getText();
    public void setText(String text);
    public String getError();
    public void setError(String error);
}
