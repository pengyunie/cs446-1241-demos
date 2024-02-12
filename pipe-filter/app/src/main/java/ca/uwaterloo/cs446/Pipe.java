package ca.uwaterloo.cs446;

public class Pipe {
    private AbstractFilter from;
    private AbstractFilter to;

    /** Initializes a pipe and connects two filters using it. */
    public Pipe(AbstractFilter from, AbstractFilter to) {
        this.from = from;
        from.setOutput(this);
        this.to = to;
        to.setInput(this);
    }

    /** Writes a piece of data to the pipe. */
    public void write(String data) {
        to.run(data);
    }
}
