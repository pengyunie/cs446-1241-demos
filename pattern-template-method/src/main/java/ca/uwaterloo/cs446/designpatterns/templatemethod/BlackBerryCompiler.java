package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class BlackBerryCompiler extends CrossCompiler {
	@Override
	protected void scanSources() {
		sources = "sources";
	}

	@Override
	protected void fetchDependencies() {
		dependencies = "blackberry";
	}

	@Override
	protected void compileToTarget() {
		target = "blackberry";
	}
}
