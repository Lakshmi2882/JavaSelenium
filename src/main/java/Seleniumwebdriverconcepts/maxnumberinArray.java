package Seleniumwebdriverconcepts;

public class maxnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,6,13,2};
	int max=a[0];
		for(int i=0;i<a.length;i++)//1<2=
		{
			if(max<a[i])//2<5,5<6,6<3,6<2
			{
				max=a[i];//a[i]=2,5,6
			}
			
		}
		System.out.println(max);
	}

}
