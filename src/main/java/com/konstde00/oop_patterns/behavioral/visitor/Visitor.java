package com.konstde00.oop_patterns.behavioral.visitor;

public interface Visitor {
	
	// naming may be different. For example visit(<ElementType>)
	void doForIndustrialBuilding(IndustrialBuilding ib);
	
	void doForPark(Park park);
	
	void doForPrivateBuilding(PrivateBuilding pb);
	
	void doForShoppingCenter(ShoppingCenter sc);
}
