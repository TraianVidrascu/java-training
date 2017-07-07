package com.szucsatti.training.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

  private LinkedList<T> elements;

  public Stack() {
	
    elements = new LinkedList<>();
  }


  public void push(final T e) {
    elements.add(e);
  }


  public T pop() {
	  
    if (elements.isEmpty())
      throw new EmptyStackException();
        
    return elements.pollLast();
    }


  public static void main(String[] args) {
	  
	  Stack<String> stack = new Stack<>();
	  
	  stack.push("abc");
	  
	  stack.push("333");
	  
	  try{
		  while(true)
		  	System.out.println(stack.pop());
	  }catch(EmptyStackException e){
		  System.out.println("Done");
	  }

	
}
}
