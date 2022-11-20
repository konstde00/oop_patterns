package com.konstde00.oop_patterns.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XMLExportVisitor implements ExportVisitor {
	
	@Override
	public void doForIndustrialBuilding(IndustrialBuilding ib) {
		log.info("XML Export for industrial building");
	}

	@Override
	public void doForPark(Park park) {
		log.info("XML Export for park");		
	}

	@Override
	public void doForPrivateBuilding(PrivateBuilding pb) {
		log.info("XML Export for private building");		
	}

	@Override
	public void doForShoppingCenter(ShoppingCenter sc) {
		log.info("XML Export for shopping center");		
	}
}
