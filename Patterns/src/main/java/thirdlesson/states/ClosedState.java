package thirdlesson.states;

import thirdlesson.TaskImpl;

public class ClosedState extends State {
    ClosedState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        //nothing
    }

    @Override
    public void up(int id) {
        //nothing
    }

    @Override
    public void down() {
        //nothing
    }

    @Override
    public void down(String error) {
        //nothing
    }
}
