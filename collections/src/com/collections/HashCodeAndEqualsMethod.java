package com.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeAndEqualsMethod implements Comparable {

	String name;
	int rollNo;

	public HashCodeAndEqualsMethod(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "HashCodeAndEqualsMethod [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeAndEqualsMethod other = (HashCodeAndEqualsMethod) obj;
		return rollNo == other.rollNo;
	}

	public static void main(String[] args) {

		Set<HashCodeAndEqualsMethod> s = new HashSet<>();

		s.add(new HashCodeAndEqualsMethod("Gaurav", 1));
		s.add(new HashCodeAndEqualsMethod("Pawan", 2));
		s.add(new HashCodeAndEqualsMethod("Rahul", 3));

		// now set will add the duplicate object also to prevent that we have to
		// override the hashcode() and equals() method
		s.add(new HashCodeAndEqualsMethod("Gaurav", 1));
		
		System.out.println();
		
		HashCodeAndEqualsMethod h1 = new HashCodeAndEqualsMethod("Gaurav", 1);
		HashCodeAndEqualsMethod h2 = new HashCodeAndEqualsMethod("Pawan", 1);

		System.out.println(h1.equals(h2));

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(HashCodeAndEqualsMethod that) {
//		// TODO Auto-generated method stub
//		return this.rollNo - that.rollNo ;
//	}

}
