package thirdlesson.states;

import thirdlesson.TaskImpl;

public class IsTestingState extends State {
    IsTestingState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        task.setError(null);
        task.setTesterId(-1);
        task.setDeveloperId(-1);
        task.setState(new ClosedState(task));
    }

    @Override
    public void up(int id) {
        up();
    }

    @Override
    public void down() {
        //nothing
    }

    @Override
    public void down(String error) {
        task.setError(error);
        task.setTesterId(-1);
        task.setState(new AssignState(task));
    }
}
