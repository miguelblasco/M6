package com.jobs.application;

import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager); //TODO HECHO
		
	}
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(manager);
		
	}
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(manager);
		
	}
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers() throws Exception {

		List<AbsStaffMember> members = repository.getAllMembers();
		for(AbsStaffMember m : members)
		{
			m.pay();
		}
		//TODO HECHO
	}

	public String getAllEmployees() {
		StringBuilder sb = new StringBuilder();
		
		List<AbsStaffMember> members = repository.getAllMembers();
		for(AbsStaffMember m : members)
		{
			sb.append(m.toString());
			sb.append("\n");
		}
		return sb.toString(); //TODO HECHO
	}

	public void createVolunteer(String name, String address, String phone) throws Exception {
		Volunteer v = new Volunteer(name, address, phone,  "descripción X");
		repository.addMember(v); //TODO HECHO		
	}
	
	
	
}
