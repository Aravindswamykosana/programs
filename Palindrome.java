class palindrome 
{
	public static void main(String[] args) 
	{
		int rev=0,n=121,n=temp;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(n==temp){
			System.out.println("palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}
}
