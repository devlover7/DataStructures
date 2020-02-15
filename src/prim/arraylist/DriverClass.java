package prim.arraylist;

public class DriverClass {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	
	arr.add(21);
	arr.add(22);
	arr.add(23);
	arr.add(24);
	arr.add(25);
	arr.print();
	arr.remove(0);
	arr.print();
	System.out.println(arr.get(0));
	
	
}
}
