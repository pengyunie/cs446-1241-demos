package ca.uwaterloo.cs446.designpatterns.templatemethod;

public class AndroidCompiler extends CrossCompiler {
	@Override
	protected void scanSources() {
		sources = "sources";
	}

	@Override
	protected void fetchDependencies() {
		dependencies = "android";
	}

	@Override
	protected void compileToTarget() {
		target = "android";
	}
}
