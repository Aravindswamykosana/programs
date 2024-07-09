class Perfect 
{
	public static void main(String[] args) 
	{

		int n=28,sum=0,temp=n;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum+=i;
			}
			if(sum==temp){
				System.out.println("perfect");
			}
			else{
				System.out.println("not a perfect");
			}


		/*int m=1,n=2000;
		for(int i=m;i<=n;i++){
			int sum=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0)
					sum+=j;
			}
			if(sum==i){
				System.out.println(i);
			}
		}*/
	}
}
