package com.marathon.again;

import com.bautils.BAUtils;

public class SchoolManagementSystem {
	public static void main(String[] args) {
		School school = new School();
		
		int selection = 0;
		boolean cont = true;
		do {
			selection = BAUtils.menu(school.initMenu());
			if (selection != 10) {
				school.processMenu(selection);
				cont = true;
			} else {
				cont = BAUtils.wantToEnd("Gerçekten (Evet/Hayır)?", "Evet");
				;
			}
		} while (cont);
		BAUtils.footer();
		// writeSchoolData(school);
	}
	
}
