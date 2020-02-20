package thirdlesson.states;

import thirdlesson.TaskImpl;

public class OpenState extends State{

    OpenState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        //nothing
    }

    @Override
    public void up(int id) {
        task.setState(new AssignState(task));
        task.setDeveloperId(id);
    }

    @Override
    public void down() {
        task.setState(new BacklogState(task));
    }

    @Override
    public void down(String error) {
        down();
    }
}
