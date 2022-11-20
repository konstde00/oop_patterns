package com.konstde00.oop_patterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidCompiler
		extends CrossCompiler {

	protected void collectSources() {
		log.info("Collect Android specific sources");
	}

	protected void compileToTarget() {
		log.info("Android compilation");
	}

	@Override
	protected void afterCompileHook() {
		log.info("Android after compile hook");
	}
}
