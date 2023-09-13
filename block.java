public class block{
	
	//there are the three types of the block 1.i.staticblock.instance block.local block
	//one block of method call in your self that recursion.
	//instance block madhe objext create nhi karava lagt nhi but instance block run krnyasthi main method madhe object crete karav lgto.
	//instance block are creted when over object is created.
	int a=10;
	
	{
		System   .out.println("sanguu");
		//local block
		//which is return inside the block or method which is called ineer block or local block
		//outer block is run then run the local block
	}
	
	static{
		System.out.println("santaa");
		//ststic block is creted in static keywords
		//static block is run after main method
		//static block run krynatshi object create karava lgt nhi
		//static block ha class load hoto teva to load pn hoto ane run pn hoto.
	}
	public static void main(String [] args)
	{
		block r=new block();
		
		System.out.println(r.a);
	}
	
	
}