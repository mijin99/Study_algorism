package Day_2020_12_19;

import java.util.Arrays;

/*
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
 * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 
 * 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
 */
public class Second {
	public static void main(String[] args) {
		//방법 1 check배열 만들기
		int a[] = {4,1,3,2,8};
		System.out.println(one(a));
		//방법2
		System.out.println(two(a));
	}
	//방법 1 check배열 만들기
	static boolean one(int a[]) {
		boolean answer=true;
		int n= a.length;
		int check[] = new int [n+1];
		for(int i =0;i<n;i++) {
			//값과 대응하는 인덱스에 체크값 넣어주기
			if(a[i] <1 || a[i]>n)
				return false;	
			check[a[i]]++; //3 -> 3
		}
		for(int i=1;i<=n;i++) 
			//중복이 있으면 빠져나가라 
			if(check[i] !=1) 
				return false;
		return answer;
	}
			
	//방법2 정렬
	static boolean two(int a[]) {
		boolean answer=true;
		//기본타입(primitive) 데이터 정렬 라이브러리
		Arrays.sort(a); //꽉 차있는경우
	//	Arrays.sort(a,0,6); //덜 차있는경우 0~6까지
		
		for(int i=0;i<a.length;i++) 
			if(a[i]!= i+1)
				return false;
			
		return answer;
	}
}
