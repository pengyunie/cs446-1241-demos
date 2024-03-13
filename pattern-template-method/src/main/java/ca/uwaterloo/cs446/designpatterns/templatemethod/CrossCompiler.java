package ca.uwaterloo.cs446.designpatterns.templatemethod;

/** Common interface of the application. */
public abstract class CrossCompiler {
    protected String sources;
    protected String dependencies;
    protected String target;

    public String getSources() {
        return sources;
    }

    public String getDependencies() {
        return dependencies;
    }

    public String getTarget() {
        return target;
    }

	/** The template method, skeleton of the algorithm. */
	public void crossCompile() {
		scanSources();
		fetchDependencies();
		compileToTarget();
	}
	
	/** Primitive operations, some of them to be implemented by subclasses. */
	protected void scanSources() {
        sources = "sources";        
	}
	protected abstract void fetchDependencies();
	protected abstract void compileToTarget();
}
