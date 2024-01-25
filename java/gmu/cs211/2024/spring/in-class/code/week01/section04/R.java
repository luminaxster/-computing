class F{
	public static void main(String[] args){
		int x = 1;
		System.out.println("x=" + x);
		x= x+1;	
		System.out.println("x=" + x);
		while(true){
			System.out.println("x=" + (x++));
		}
	}
}
