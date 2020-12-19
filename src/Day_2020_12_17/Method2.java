package Day_2020_12_17;

public class Method2 {
	public static void main(String[] args) {
		for(int n=2;n<=100000;n++) {
			if(isPrime(n))
				System.out.println(n);
		}
	}
	//왜 static 
	static boolean isPrime(int k) {
		if (k<2) return false; //k가 1이면 1은  바로 리턴 
			//i를 2부터 i의 제곱이 k보다 작음 (k의 방을 넘음)
		for (int i=2;i*i<=k;i++) 
			if(k%i==0)
				return false;
		return true;
	}
}
