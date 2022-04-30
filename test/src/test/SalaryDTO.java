package test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SalaryDTO implements Comparable<SalaryDTO>{
	private int num;
	private String name;
	private String title;
	private int basePay;
	private int extraPay;
	private double taxrate;
	private int tax;
	private int salary;
	
	
	public SalaryDTO() {

	}
	

	public SalaryDTO(int num, String name, String title, int basePay, int extraPay) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.basePay = basePay;
		this.extraPay = extraPay;
		
		calc(basePay,extraPay);
	}

	
	public void calc() {
		this.calc(basePay,extraPay);
	}

	public void calc(int basePay,int extraPay) {
		
		int total = basePay + extraPay;
		if(total <= 2_000_000) {
			taxrate = 0.01;
		}
		else if(total <= 4_000_000) {
			taxrate = 0.02;
		}else {
			taxrate = 0.03;
		}
		
		tax = (int)(total * taxrate);
		salary = total - tax;
		
	}
	
	
	

	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getBasePay() {
		return basePay;
	}



	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}



	public int getExtraPay() {
		return extraPay;
	}



	public void setExtraPay(int extraPay) {
		this.extraPay = extraPay;
	}



	public double getTaxrate() {
		return taxrate;
	}



	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}



	public int getTax() {
		return tax;
	}



	public void setTax(int tax) {
		this.tax = tax;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		NumberFormat nf = new DecimalFormat();
		return num+ "\t" + name + "\t" + title+ "\t" + nf.format(basePay) + "\t" + nf.format(extraPay)+ "\t" +
		(int)(taxrate*100) + "%\t" + nf.format(tax) + "\t" + nf.format(salary);
	}


	@Override
	public int compareTo(SalaryDTO s) {
	
		if(this.salary < s.salary) return 1;
		else if(this.salary > s.salary) return -1;
		else return 0;
	}
	
	
	
	
	
}
