public class Example7_4 {
	public static void main(String[] args) {
		int n=0,m=0,t=1000;
		try{
			m=Integer.parseInt("8888");
			n=Integer.parseInt("ab89");
			t=7777;
		}
		catch(NumberFormatException e){
			System.out.println(""+e.getMessage());
		}
		System.out.println("n="+n+",m="+m+",t="+t);
		try{
			System.out.println("故意拋出i/o异常！");
			throw new java.io.IOException("我是故意的");
		}
		catch (java.io.IOException e){
			System.out.println("发生异常："+e.getMessage());
		}
	}

}
