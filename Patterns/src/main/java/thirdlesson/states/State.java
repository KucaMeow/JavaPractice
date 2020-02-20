package thirdlesson.states;

import thirdlesson.TaskImpl;

public abstract class State {
    protected TaskImpl task;

    State(TaskImpl task) {
        this.task = task;
    }

    public abstract void up();
    public abstract void up(int id);
    public abstract void down();
    public abstract void down(String error);
}
