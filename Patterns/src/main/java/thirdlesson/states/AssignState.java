package thirdlesson.states;

import thirdlesson.TaskImpl;

public class AssignState extends State{
    AssignState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        task.setState(new inProgressState(task));
    }

    @Override
    public void up(int id) {
        up();
    }

    @Override
    public void down() {
        task.setState(new OpenState(task));
        task.setDeveloperId(-1);
    }

    @Override
    public void down(String error) {
        down();
    }
}
