package thirdlesson.states;

import thirdlesson.TaskImpl;

public class DraftState extends State {

    public DraftState(TaskImpl task) {
        super(task);
    }

    @Override
    public void up() {
        task.setState(new OpenState(task));
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
        //nothing
    }
}
