package com.datastructure.stack;

public class Main {
public static void main(String[] args) {
	/*IntStack intStack=new IntStack();
	if(!intStack.isFull()){
		intStack.push(2);
		intStack.push(4);
		intStack.push(6);
		intStack.push(8);
		intStack.push(9);
		
	}
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.isEmpty());
	System.out.println(intStack.isFull());
	System.out.println(intStack.pop()); */
	
	Person person1=new Person("azeem", 100);
	Person  person2=new Person("shafi",101);
	
	PersonStack stack=new PersonStack();
	stack.push(person1);
	stack.push(person2);
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	
	
}

}
