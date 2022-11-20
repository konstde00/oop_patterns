package com.konstde00.oop_patterns.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IPhoneCompiler
		extends CrossCompiler {

	protected void collectSources() {
		log.info("Collect IPhone specific sources");
	}

	protected void compileToTarget() {
		log.info("IPhone compilation");
	}
}
