package thirdlesson.states;

import thirdlesson.TaskImpl;

public class ResolvedState extends State {
    ResolvedState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        //nothing
    }

    @Override
    public void up(int id) {
        task.setTesterId(id);
        task.setState(new IsTestingState(task));
    }

    @Override
    public void down() {
        task.setState(new inProgressState(task));
    }

    @Override
    public void down(String error) {
        down();
    }
}
