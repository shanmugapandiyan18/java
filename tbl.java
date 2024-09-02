class  test{
	int n;
	int m;
	test(int x,int y){
	n=x;
	m=y;
	}
	void dis(){
	for(int i=1;i<=m;i++){
		System.out.println(n+" x "+i+" = "+i*n);
		}
	}
}
class tbl{
	public static void main(String[] args){
		System.out.println("Multiplication Table: ");
		test ob=new test(8,10);
		ob.dis();
	}
}