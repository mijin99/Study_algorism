package Day_2020_12_19;

import java.util.Arrays;

/*
 * ���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�.
 * 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ� ��� true��, 
 * �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.
 */
public class Second {
	public static void main(String[] args) {
		//��� 1 check�迭 �����
		int a[] = {4,1,3,2,8};
		System.out.println(one(a));
		//���2
		System.out.println(two(a));
	}
	//��� 1 check�迭 �����
	static boolean one(int a[]) {
		boolean answer=true;
		int n= a.length;
		int check[] = new int [n+1];
		for(int i =0;i<n;i++) {
			//���� �����ϴ� �ε����� üũ�� �־��ֱ�
			if(a[i] <1 || a[i]>n)
				return false;	
			check[a[i]]++; //3 -> 3
		}
		for(int i=1;i<=n;i++) 
			//�ߺ��� ������ ���������� 
			if(check[i] !=1) 
				return false;
		return answer;
	}
			
	//���2 ����
	static boolean two(int a[]) {
		boolean answer=true;
		//�⺻Ÿ��(primitive) ������ ���� ���̺귯��
		Arrays.sort(a); //�� ���ִ°��
	//	Arrays.sort(a,0,6); //�� ���ִ°�� 0~6����
		
		for(int i=0;i<a.length;i++) 
			if(a[i]!= i+1)
				return false;
			
		return answer;
	}
}
