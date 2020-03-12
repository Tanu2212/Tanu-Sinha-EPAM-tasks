package EPAM.EPAMTASK4;

public class compound_and_simple_intrest {

	
	public double compound_intrest(double amount,double time,double rate)
	{
		double com;
		com=amount * Math.pow(1.0+rate/100.0,time) -amount;
		return com;
	}
	public double simple_intrest(double amount,double time,double rate)
	{
		double sim ;
		sim=(amount * time * rate)/100;
		return sim;
	}
}
class client
{
	public void main(String[] args) {
		// TODO Auto-generated method stub
		compound_and_simple_intrest c_s=new compound_and_simple_intrest();
		double amount=1000;
		double time=2;
		double rate=1.5;
		double com,sim;
		com=c_s.compound_intrest(amount,time,rate);
		sim=c_s.simple_intrest(amount,time,rate);
	}
}
