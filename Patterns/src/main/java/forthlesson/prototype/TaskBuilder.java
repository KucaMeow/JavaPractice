package forthlesson.prototype;

import thirdlesson.TaskImpl;
import thirdlesson.states.State;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TaskBuilder {
    public static TaskImpl copy(TaskImpl objToCopy) {
        if(objToCopy == null) {
            return null;
        }
        TaskImpl copy = new TaskImpl(objToCopy.getText());
        copy.setDeveloperId(objToCopy.getDeveloperId());
        copy.setTesterId(objToCopy.getTesterId());
        copy.setError(objToCopy.getError());
        copy.setState(copy(objToCopy.getState(), copy));
        copy.setText(objToCopy.getText());

        return copy;
    }

    public static State copy(State objToCopy, TaskImpl task) {
        try {
            Constructor c = objToCopy.getClass().getDeclaredConstructor(TaskImpl.class);
            c.setAccessible(true);
            return (State) c.newInstance(task);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }
}
