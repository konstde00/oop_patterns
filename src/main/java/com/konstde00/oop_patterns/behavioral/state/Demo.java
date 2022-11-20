package com.konstde00.oop_patterns.behavioral.state;

import static com.konstde00.oop_patterns.behavioral.state.InModerationState.*;
import static com.konstde00.oop_patterns.behavioral.state.Role.ADMIN_ROLE;
import static com.konstde00.oop_patterns.behavioral.state.Role.CONTENT_CREATOR_ROLE;

public class Demo {
	
	public static void main(String[] args) {
		var document = new Document();
		User adminUser
				= new User(ADMIN_ROLE, "konstde00");
		User contentCreatorUser
				= new User(CONTENT_CREATOR_ROLE, "konstde00+1");
		
		document.printStatus();
		
		document.publish(contentCreatorUser);
		document.printStatus();
		
		document.publish(contentCreatorUser);
		document.printStatus();
		
		document.publish(adminUser);
		document.printStatus();
		
		document.publish(adminUser);
	}
}
