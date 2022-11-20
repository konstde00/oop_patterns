package com.konstde00.oop_patterns.creational.abstractfactory.example2;

public abstract class SquadronFactory {

	public abstract Mage createMage();

	public abstract Archer createArcher();

	public abstract Warrior createWarrior();
}
