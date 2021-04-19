package com.jobs.domain;

public class Senior extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() throws Exception {
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid<=2700 || totalPaid>4000 ) throw new Exception();
	}

}
