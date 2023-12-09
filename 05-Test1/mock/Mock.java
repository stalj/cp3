import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
import java.util.HashMap;

public class Mock {
	static String r = ""; 
	
	public static void main(String[] args) {
		HashMap<String, Integer> results = new HashMap<String, Integer>();

		// C1
		try {
			C1 o = new C1("Anna",21);
			assert o.getAge()==21;
			assert o.isAdult()==true;
			o.setAge(17);
			assert o.isAdult()==false;
			assert o.toString().equals("Anna,17");
			results.put("C1", 1);
		} catch (Throwable e) {
			results.put("C1", 0);
		}

		// C2
		try {
			C2 o = new C2();
			assert o.value()==0;
			o.increase();
			o.increase();
			o.decrease();
			o.increase(5);
			o.decrease(2);
			assert o.value()==4;
			results.put("C2", 1);
		} catch (Throwable e) {
			results.put("C2", 0);
		}

		// C3
		try {
			assert C3.isAlphabet("abegsw")==true;
			assert C3.isAlphabet("abcmhsw")==false;
			assert C3.hideText("apple").equals("a***e");
			assert C3.hideText("ok").equals("ok");
			results.put("C3", 1);
		} catch (Throwable e) {
			results.put("C3", 0);
		}

		// C4
		try {
			int[] arr1 = {2,-6,5,8};
			int[] arr2 = {3,2,-5,4,1,-7};
			assert C4.even(arr1)==3;
			assert C4.positiveOdd(arr2)==2;  
			results.put("C4", 1);
		} catch (Throwable e) {
			results.put("C4", 0);
		}

		// C5
		try {
			C5 o = new C5(3,0);
			assert o.isX()==true;
			assert o.isY()==false;
			assert o.toString().equals("P(3,0)");
			results.put("C5", 1);
		} catch (Throwable e) {
			results.put("C5", 0);
		}

		// C6
		try {
			C6 o = new C6();
			o.setPages(3);
			o.setPages(-4);
			assert o.getPages()==3;  
			o.setTitle("Some book");
			assert o.getTitle().equals("Some book");
			results.put("C6", 1);
		} catch (Throwable e) {
			results.put("C6", 0);
		}



		// Display test results
		System.out.println(results);
		try {
			FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(results.toString());
			myWriter.close();
		} catch (IOException e){}
		
	}
}



// Class templates

class C1 {
	C1(String name, int age){}
	public String getName(){return "";}
	public void setName(String name){}
	public int getAge(){return 0;}
	public void setAge(int age){}
	public boolean isAdult(){return false;}
	public String toString(){return "";}
}

class C2 {
	public void increase(){}
	public void decrease(){}
	public void increase(int n){}
	public void decrease(int n){}
	public int value(){return 0;}
}

class C3 {
	public static boolean isAlphabet(String t){return false;}
	public static String hideText(String t){return "";}
}

class C4 {
	public static int even(int[] arr){return 0;}
	public static int positiveOdd(int[] arr){return 0;}
}

class C5 {
	public C5(int x, int y){}
	public boolean isX(){return false;}
	public boolean isY(){return false;}
	public String toString(){return "";}	
}

class C6 {
	public String getTitle(){return "";}
	public int getPages(){return 0;}
	public void setTitle(String t){}
	public void setPages(int n){}
}
