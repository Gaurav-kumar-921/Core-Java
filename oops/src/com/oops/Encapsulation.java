package com.oops;

	class Bank{
			private String name ;
			private int password ;
			
			Bank(String name , int password){
				this.name = name ;
				this.password = password;
			}
			
			public String getName(int password) {                       // Getter Method
				if(this.password == password) return name ;
				else return "Invalid Password ";
			}
			
			public void setName(int password , String name) {           // Setter Method
				if(this.password == password) {
					this.name = name ;
					System.out.println("Name is changed");
				}
				else {
					System.out.println("Invalid Password");
				}
			}
	}

	public class Encapsulation {
		public static void main(String[] args) {
			Bank b = new Bank("Gaurav", 1234);
			System.out.println(b.getName(1234));
			b.setName(1234, "Pawan");
			System.out.println(b.getName(1234));
		}
	}
