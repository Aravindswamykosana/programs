class Spynum
{
	public static void main(String[] args) 
	{
		/*int n=22,sum=0,p=1;
		while(n!=0){
			int r=n%10;
			sum+=r;
			p*=r;
			n/=10;
		}
		if(sum==p){
			System.out.println("spy");
		}else{
			System.out.println("not spy");
		}*/

		/*int m=1,n=202;
		for(int i=m;i<=n;i++){
			int sum=0,p=1,k=i;
			while(k!=0){
				int r=k%10;
				sum+=r;
				p*=r;
				k/=10;
			}
			if(sum==p){
				System.out.println(i);
			}
		}*/


		/*int n=10,c=0,i=1;
		while(c<n){
			int sum=0,p=1,k=i;
			while(k!=0){
				int r=k%10;
				sum+=r;
				p*=r;
				k/=10;
			}	
			if(sum==p){
				//c++;
			//}
			//if(c==n){
				System.out.println(i);
				c++;
			}
			i++;
		}*/


		int n=10,c=0,i=1;
		while(c<n){
			int sum=0,p=1,k=i;
			while(k!=0){
				int r=k%10;
				sum+=r;
				p*=r;
				k/=10;
			}	
			if(sum==p){
				c++;
			}
			if(c==n){
				System.out.println(i);
				c++;
			}
			i++;
		}
	}
}
