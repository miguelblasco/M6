package com.jobs.domain;

public class Mid extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() throws Exception {
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid<=1800 || totalPaid>2500 ) throw new Exception();
	}

}
