package com.jobs.domain;

public class Manager extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
		
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() throws Exception {
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid<=3000 || totalPaid>5000 ) throw new Exception();
	}

}
