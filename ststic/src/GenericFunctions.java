public class GenericFunctions<T>
 {
	public  void add(T i){
		System.out.println(i+",");
	}
	/*public  void test(T i,U j){
		System.out.println(i+","+j);
	}
	*/
	public int addition(int x,int y,int...arr) {
		int s= x+y;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	public static void main(String[] args) {
		GenericFunctions<Integer> ob=new GenericFunctions<>();
		//ob.add(12, 34.5);
		//GenericFunctions<String>ob1=new GenericFunctions<>();
		//ob1.add("xyz","Hello");
		//ob.addition(12, 34);
		ob.addition(1, 2, 3,4,5,6,7);
	}

}
