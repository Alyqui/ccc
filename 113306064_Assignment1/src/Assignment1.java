import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name1=scanner.next();
		double tall1=scanner.nextDouble();
		double weight1=scanner.nextDouble();
		String name2=scanner.next();
		double tall2=scanner.nextDouble();
		double weight2=scanner.nextDouble();
		
		double a=tall1/100;
		double b=tall2/100;
		String c,d;
		
		
		double BMI1=weight1/(a*a);
		String BMI1A = String.format("%.2f", BMI1);
		double BMI2=weight2/(b*b);
		String BMI2A = String.format("%.2f", BMI2);
		System.out.println(name1+"‘s BMI is "+BMI1A+"\n");
		System.out.println(name2+"‘s BMI is "+BMI2A+"\n");
		if(BMI1<18.5) {
			c="underweight";
		}
		else if(18.5<=BMI1&&BMI1< 24.0) {
			c="normal";
		}
		else {
			c="overweight";
		}
		if(BMI2<18.5) {
			d="underweight";
		}
		else if(18.5<=BMI2&&BMI2< 24.0) {
			d="normal";
		}
		else {
			d="overweight";
		}
		System.out.println("Their health status are "+c+" and "+d+".");
		
		
		double currency1=scanner.nextDouble();
		String name4=scanner.next();
		double currency2=scanner.nextDouble();
		String name5=scanner.next();
		double currency3=scanner.nextDouble();
		String name6=scanner.next();
		
		double twd,aed,krw;
		String x="TWD";
		String y="AED";
		String z="KRW";
		
		
		
		if(name4.equals(x)) {
			aed=currency1*0.115;
			String aedA = String.format("%.2f", aed);
			krw=currency1*41.6191;
			String krwA = String.format("%.2f", krw);
			String currency1A = String.format("%.2f", currency1);
			System.out.println(currency1A+" TWD = "+aedA+" AED = "+krwA+" KRW"+"\n");
		}
		else if(name4.equals(y)) {
			twd=currency1/0.115;
			String twdA = String.format("%.2f", twd);
			krw=currency1*41.6191/0.115;
			String krwA = String.format("%.2f", krw);
			String currency1A = String.format("%.2f", currency1);
			System.out.println(currency1A+" AED = "+twdA+" TWD = "+krwA+" KRW"+"\n");
		}
		else {
			twd=currency1/41.6191;
			String twdA = String.format("%.2f", twd);
			aed=currency1*0.115/41.6191;
			String aedA = String.format("%.2f", aed);
			String currency1A = String.format("%.2f", currency1);
			System.out.println(currency1A+" KRW = "+twdA+" TWD = "+aedA+" AED"+"\n");
		}
		
		
		if(name5.equals(x)) {
			aed=currency2*0.115;
			String aedA = String.format("%.2f", aed);
			krw=currency2*41.6191;
			String krwA = String.format("%.2f", krw);
			String currency2A = String.format("%.2f", currency2);
			System.out.println(currency2A+" TWD = "+aedA+" AED = "+krwA+" KRW"+"\n");
		}
		else if(name5.equals(y)) {
			twd=currency2/0.115;
			String twdA = String.format("%.2f", twd);
			krw=currency2*41.6191/0.115;
			String krwA = String.format("%.2f", krw);
			String currency2A = String.format("%.2f", currency2);
			System.out.println(currency2A+" AED = "+twdA+" TWD = "+krwA+" KRW"+"\n");
		}
		else {
			twd=currency2/41.6191;
			String twdA = String.format("%.2f", twd);
			aed=currency2*0.115/41.6191;
			String aedA = String.format("%.2f", aed);
			String currency2A = String.format("%.2f", currency2);
			System.out.println(currency2A+" KRW = "+twdA+" TWD = "+aedA+" AED"+"\n");
		}
		
		
		if(name6.equals(x)) {
			aed=currency3*0.115;
			String aedA = String.format("%.2f", aed);
			krw=currency3*41.6191;
			String krwA = String.format("%.2f", krw);
			String currency3A = String.format("%.2f", currency3);
			System.out.println(currency3A+" TWD = "+aedA+" AED = "+krwA+" KRW"+"\n");
		}
		else if(name6.equals(y)) {
			twd=currency3/0.115;
			String twdA = String.format("%.2f", twd);
			krw=currency3*41.6191/0.115;
			String krwA = String.format("%.2f", krw);
			String currency3A = String.format("%.2f", currency3);
			System.out.println(currency3A+" AED = "+twdA+" TWD = "+krwA+" KRW"+"\n");
		}
		else {
			twd=currency3/41.6191;
			String twdA = String.format("%.2f", twd);
			aed=currency3*0.115/41.6191;
			String aedA = String.format("%.2f", aed);
			String currency3A = String.format("%.2f", currency3);
			System.out.println(currency3A+" KRW = "+twdA+" TWD = "+aedA+" AED"+"\n");
		}
		
			scanner.close();
		}
		
	
	
		
		
		
		
		
		
	}

