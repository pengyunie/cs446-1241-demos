package ca.uwaterloo.cs446;

public abstract class AbstractFilter {
    protected Pipe input;
    protected Pipe output;

    public void setInput(Pipe input) {
        this.input = input;
    }

    public void setOutput(Pipe output) {
        this.output = output;
    }

    /** Calls runInternal but collects debugging information about the run. */
    public void run(String data) {
        // System.out.println("DEBUG: " + toString() + " running with input: " + data);
        runInternal(data);
    }

    /** 
     * Processes one piece of data from the input pipe.
     * If this filter should produce some output, call emit(...) to write it to the output pipe.
     */
    protected abstract void runInternal(String data);

    protected void emit(String data) {
        if (output != null) {
            output.write(data);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
