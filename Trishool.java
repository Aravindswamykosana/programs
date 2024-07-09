class Trishool 
{
	public static void main(String[] args) 
	{
		int star=1,star1=1,space=3;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star1;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(i==3 && j>=2){
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
			star++;star1+=2;space-=2;
		}
		star=7;space=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			System.out.println();
			star-=2;space++;
		}
		space=4;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
		}
	}
}
