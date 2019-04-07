/**
 * 
 */
package onclass1;

/**
 * @author mohammad
 *
 */
public class returnresult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		returnresult rn=new returnresult();
//		rn.ab(10, 20, 20);
//		int kl=rn.ab(10, 10, 10);
//		System.out.println(kl+20);
     
		
		System.out.println(rn.ak(30, 20));
		
	}
		
	
//	public int ab(int x, int y, int z){
//		int bn=x+y+z;
//		
//		return bn;
		
		
	public boolean ak (int a, int b){
		int z=a+b;
		boolean r;
		if(z>=50) {
			r=true;
		}
		else {
			r=false;
		}
		return r;
	
}
}
