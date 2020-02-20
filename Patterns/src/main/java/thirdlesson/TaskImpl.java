package thirdlesson;

import thirdlesson.states.DraftState;
import thirdlesson.states.State;

public class TaskImpl implements Task {
    private static int last_id = 0;
    private int id;
    private int developerId;
    private int testerId;
    private String text;
    private String error;
    private State state;

    public TaskImpl(String desc) {
        state = new DraftState(this);
        id = last_id++;
        text = desc;
        developerId = -1;
        testerId = -1;
    }

    public void up() {
        state.up();
    }

    public void up(int id) {
        state.up(id);
    }

    public void down() {
        state.down();
    }

    public void down(String error) {
        state.down(error);
    }

    public int getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public int getTesterId() {
        return testerId;
    }

    public void setTesterId(int testerId) {
        this.testerId = testerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", developerId=" + developerId +
                ", testerId=" + testerId +
                ", text='" + text + '\'' +
                ", error='" + error + '\'' +
                ", state=" + state +
                '}';
    }

    @Override
    public TaskImpl castToTaskImpl() {
        return this;
    }
}
