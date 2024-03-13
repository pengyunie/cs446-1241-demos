package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class IPhoneCompiler extends CrossCompiler {
	@Override
	protected void fetchDependencies() {
        dependencies = "iphone";
	}

	@Override
	protected void compileToTarget() {
        target = "iphone";
	}    
}
