package com.konstde00.oop_patterns.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

	public static void main(String[] args) {
		var industrialBuidling = new IndustrialBuilding();
		var park = new Park();
		var privateBuilding = new PrivateBuilding();
		var shoppingCenter = new ShoppingCenter();
		
		ExportVisitor visitor = new XMLExportVisitor();
		visitor.export(industrialBuidling, 
					park,
					privateBuilding,
					shoppingCenter);
		
		log.info("=======================================");
		
		visitor = new JSONExportVisitor();
		visitor.export(industrialBuidling, 
				park,
				privateBuilding,
				shoppingCenter);
	}
}
