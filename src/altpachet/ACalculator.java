// src/altpachet/ACalculator.java
package altpachet;

public abstract class ACalculator {
    protected Object state;

    public abstract void init(Object initialState);

    public Object result() {
        return this.state;
    }

    public void clear() {
        this.state = null;
        init(null);
    }
}