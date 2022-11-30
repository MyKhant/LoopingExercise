//Myo Khant Kyaw
public class example{
	public static void main(String[] args) {
		var tution_fees=6000;
		var tution_increese=0.02;
		var years=5;
		System.out.println("tution/tyears");
		System.out.println("-------------");
		System.out.println(tution_fees+" "+0);
		for(int i=1; i<=years; i++){
			tution_fees *= (1+tution_increese);
			System.out.println(tution_fees+" "+i);

		}
	}
}

