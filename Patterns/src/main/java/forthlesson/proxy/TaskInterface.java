package forthlesson.proxy;

import thirdlesson.Task;
import thirdlesson.TaskImpl;
import thirdlesson.states.State;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TaskInterface implements Task {
    private TaskImpl innerTask;
    private PrintWriter pw;

    public TaskInterface(String desc) {
        innerTask = new TaskImpl(desc);
        try {
            pw = new PrintWriter(new FileOutputStream("log.log"), true);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException();
        }
    }

    public void up() {
        innerTask.up();
        pw.println(innerTask.toString() + ": made up()");
    }

    public void up(int id) {
        innerTask.up(id);
        pw.println(innerTask.toString() + ": made up() with id " + id);
    }

    public void down() {
        innerTask.down();
        pw.println(innerTask.toString() + ": made down()");
    }

    public void down(String error) {
        innerTask.down(error);
        pw.println(innerTask.toString() + ": made down() with error " + error);
    }

    public int getId() {
        pw.println(innerTask.toString() + ": made getId()");
        return innerTask.getId();
    }

    public State getState() {

        pw.println(innerTask.toString() + ": made getState()");
        return innerTask.getState();
    }

    public void setState(State state) {
        innerTask.setState(state);
        pw.println(innerTask.toString() + ": made setState()");
        pw.println("with state: " + state.toString());
    }

    public int getDeveloperId() {
        pw.println(innerTask.toString() + ": made getDeveloperId()");
        return innerTask.getDeveloperId();
    }

    public void setDeveloperId(int developerId) {
        innerTask.setDeveloperId(developerId);
        pw.println(innerTask.toString() + ": made setDeveloperId() with id " + developerId);
    }

    public int getTesterId() {
        pw.println(innerTask.toString() + ": made getTesterId()");
        return innerTask.getTesterId();
    }

    public void setTesterId(int testerId) {
        pw.println(innerTask.toString() + ": made setTesterId() with id " + testerId);
        innerTask.setTesterId(testerId);
    }

    public String getText() {
        pw.println(innerTask.toString() + ": made getText()");
        return innerTask.getText();
    }

    public void setText(String text) {
        pw.println(innerTask.toString() + ": made setText()");
        pw.println("with text: " + text);
        innerTask.setText(text);
    }

    public String getError() {
        pw.println(innerTask.toString() + ": made getError()");
        return innerTask.getError();
    }

    public void setError(String error) {
        pw.println(innerTask.toString() + ": made setError()");
        pw.println("with error: " + error);
        innerTask.setError(error);
    }

    @Override
    public String toString() {
        pw.println(innerTask.toString() + ": made toString()");
        pw.println("out: " + innerTask.toString());
        return innerTask.toString();
    }

    @Override
    public TaskImpl castToTaskImpl() {
        return innerTask;
    }
}
