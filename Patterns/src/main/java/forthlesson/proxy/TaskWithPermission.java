package forthlesson.proxy;

import thirdlesson.Main;
import thirdlesson.Task;
import thirdlesson.TaskImpl;
import thirdlesson.states.State;

public class TaskWithPermission implements Task {
    private TaskImpl innerTask;

    public TaskWithPermission(String desc) {
        innerTask = new TaskImpl(desc);
    }

    public void up() {
        if(!Main.isAdmin) {
            System.out.println("You don't have permission to up");
            return;
        }
        innerTask.up();
    }

    public void up(int id) {
        if(!Main.isAdmin) {
            System.out.println("You don't have permission to up");
            return;
        }
        innerTask.up(id);
    }

    public void down() {
        if(!Main.isAdmin) {
            System.out.println("You don't have permission to down");
            return;
        }
        innerTask.down();
    }

    public void down(String error) {
        if(!Main.isAdmin) {
            System.out.println("You don't have permission to down");
            return;
        }
        innerTask.down(error);
    }

    public int getId() {
        return innerTask.getId();
    }

    public State getState() {
        return innerTask.getState();
    }

    public void setState(State state) {
        innerTask.setState(state);
    }

    public int getDeveloperId() {
        return innerTask.getDeveloperId();
    }

    public void setDeveloperId(int developerId) {
        innerTask.setDeveloperId(developerId);
    }

    public int getTesterId() {
        return innerTask.getTesterId();
    }

    public void setTesterId(int testerId) {
        innerTask.setTesterId(testerId);
    }

    public String getText() {
        return innerTask.getText();
    }

    public void setText(String text) {
        innerTask.setText(text);
    }

    public String getError() {
        return innerTask.getError();
    }

    public void setError(String error) {
        innerTask.setError(error);
    }

    @Override
    public String toString() {
        return innerTask.toString();
    }

    @Override
    public TaskImpl castToTaskImpl() {
        return innerTask;
    }
}
