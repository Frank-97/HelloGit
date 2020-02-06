
public class Test {

   public static void main(String[] args) {
	

	  System.out.println(test(15,26,4));
   }
   static int test(int x,int y,int z) {
	   return test(x,test(y, z));
   }
   
   static int test(int x,int y) {
	   if(x>y) {
		   return x;
	   }else {
		return y;
	}
   }
   
}
