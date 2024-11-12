// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);
		double annualInterest = Double.parseDouble(args[1]);
		int years = Integer.parseInt (args[2]);
		
		double futureValue = currentValue * Math.pow((1 + annualInterest / 100) , years);

		
		System.out.println ("After " + years + " years, a $" + currentValue + " saved at " + annualInterest + "% will yield $" + (int) futureValue);

		
	}
}
