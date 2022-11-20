package com.konstde00.oop_patterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CrossCompiler {

	public final void compile() {
		collectSources();
		reserveRam();
		compileToTarget();
		afterCompileHook();
		compilationStatusNotification();
	}

	private void compilationStatusNotification() {
		log.info("Compilation is successful");
	}

	private void reserveRam() {
		log.info("Ram is reserved for compilation process");
	}
	
	protected void afterCompileHook() {
		// do nothing by default
	}

	protected abstract void collectSources();

	protected abstract void compileToTarget();
}
