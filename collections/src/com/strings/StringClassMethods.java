package com.strings;

class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}

public class StringClassMethods {

	public static void main(String[] args) {

		// Strings are immutable in nature that means every time we re initialize the
		// value of
		// string it will create a new seperator object for that string because for
		// every
		// modification seperate object is get created in memory, it reduces the
		// performance.
		// Garbage Collector is not allowed inside the String constant pool because of resuablity.
		String s1 = "hello world";
		String s2 = "gaurav";

		// for concatenation
//		String s3 = s1 + " " + s2 ;    
//		String s3 = s1.concat(s2);

		// for finding the length of the string
		int l1 = s1.length();

		// for converting the string to uppercase
		String s3 = s1.toUpperCase();

		System.out.println(s3);

		Student stu = new Student(12, "Gaurav");
		System.out.println(stu); // pura object jb print krvane ki koshish krte hai tb reference milta hai value
									// ki jgh to avoid this problem we have to override toString method.

		// for reversing a String
		String rev = "";

//		for(int i=s1.length()-1; i>=0;i--) {
//			rev += s1.charAt(i);
//		}
//		
//		System.out.println(rev);

		// Another way to do it
		// for this we will need object of StringBuffer.
//		StringBuffer sbRev = "Hello";
		StringBuffer sb = new StringBuffer(s1); // pass the string in the argument to store in the stringBuffer.
		rev = sb.reverse().toString();
		System.out.println(rev);

		// for seperating the data of a string around a seperator
		String str = " Gaurav / Mahesh / Rahul / Vijay";
		String names[] = str.split("/");// this will convert the string into string type array and store the values
										// seperated by seperator
//		System.out.println(names[1]);
		for (String val : names) {
			System.out.println(val);
		}

		// To Overcome the disadvantage of String class we have StringBuffer class which
		// is mutable in nature
		// String buffers are safe for use by multiple threads. The methods are synchronized
		
		
		// String Builder is also same as String buffer both have same methods but
		// StringBuilder is not a thread safe class it is not safe for use by multiple
		// threads. The methods are not synchronized
		StringBuffer sb1 = new StringBuffer("Gaurav");
		sb1.append(" Kumar"); // Now we can modify the state without creating the new object for that.

		sb1.replace(0, 6, "Pawan"); // for replacing the data from a perticular index.
		System.out.println(sb1);
		
		
		String s = new String("Hello");     // Now this line will create 2 Objects 1 in Heap and 1 in pool for reuseblity.
		String ss = new String("Hello");    //  if we create the String using new keyword both the String will not point to the same object.
		System.out.println(s == ss);
		
		String gaurav = "Gaurav";   // but if we create the String using String literals both the String will point to the same object.
		String gaurav2 = "Gaurav";  // Now this line will create only 1 Object inside the Heap area.
		System.out.println(gaurav == gaurav2);
		
		
		String one = new String("Code");   // Now this code will create 2 objects 1 in Heap and 1 in SCP
		String two = "Code";      // both strings pointing to different object
		
		System.out.println(one == two);    // it will check the references of the objects.
		System.out.println(one.equals(two));   // it will check the content of the objects.
		
		
		// Proof that Strings are Immutable in nature.
		
		String str1 = "Gaurav";
		System.out.println(str1.hashCode());
		
		str1 = str1 + "Kumar";       // Now when i tried to modify my String a new object is created inside the SCP and reference will be return
		System.out.println(str1.hashCode());  // to check that both Strings are pointing to the same object or not we use hashCode().

	}

}
