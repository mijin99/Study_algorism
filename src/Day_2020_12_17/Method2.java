package Day_2020_12_17;

public class Method2 {
	public static void main(String[] args) {
		for(int n=2;n<=100000;n++) {
			if(isPrime(n))
				System.out.println(n);
		}
	}
	//�� static 
	static boolean isPrime(int k) {
		if (k<2) return false; //k�� 1�̸� 1��  �ٷ� ���� 
			//i�� 2���� i�� ������ k���� ���� (k�� ���� ����)
		for (int i=2;i*i<=k;i++) 
			if(k%i==0)
				return false;
		return true;
	}
}
