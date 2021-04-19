package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 8000.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666");
		controller.createManagerEmployee("Pedro Manager", "Dirección molona 2", "665226666", 4000.0);
		controller.createJuniorEmployee("Miguel Junior", "Dirección molona 6", "665227766", 200.0);
		controller.createMidEmployee("Laia Mid", "Dirección molona 7", "665226886", 2000.0);
		controller.createSeniorEmployee("Biel Senior", "Dirección molona 8", "665226996", 3200.0);
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + "\n" + allEmployees + " \n");
		
	}

}
