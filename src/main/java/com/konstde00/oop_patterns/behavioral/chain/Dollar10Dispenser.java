package com.konstde00.oop_patterns.behavioral.chain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dollar10Dispenser
		implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextLink(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {

		if (cur.getAmount() >= 10) {

			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			log.info("Dispensing " + num + " 10$ note");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}

		} else {
			this.chain.dispense(cur);
		}
	}
}
