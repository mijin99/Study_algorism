package Day_2020_12_19;
/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int num_of_sum(int n) {
		int answer =0;
		int sum=0;
		
		while(n>0) { // n이 0이 됐을 떄 그만
			sum +=n%10;
			n/=10;
		}
		return answer;
	}

}
