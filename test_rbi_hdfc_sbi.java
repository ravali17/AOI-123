package Abstraction;

public class test_rbi_hdfc_sbi {

	public static void main(String[] args) {
		RBI r=new HDFC();
		r.interestRate();
		r.show();
		RBI r1=new SBI();
		r1.interestRate();
		r1.show();
	}
	

}
