package Day_2020_12_19;
/*
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 */
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int num_of_sum(int n) {
		int answer =0;
		int sum=0;
		
		while(n>0) { // n�� 0�� ���� �� �׸�
			sum +=n%10;
			n/=10;
		}
		return answer;
	}

}
