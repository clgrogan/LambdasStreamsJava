package com.ls.lambdas;

import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) {
		Greeting greeting = new HolaGreeting();
		greeting.sayHola();
		
		Greeting g2 = new Greeting() {
			@Override
			public void sayHola() {
				System.out.println("Hola, World!");
				
			}
		};
		
		g2.sayHola();
		
		Greeting g3 = () -> System.out.println("Hola, World!");
		g3.sayHola();
		
		SumTwoIntegers sum = (i1,i2) -> i1 + i2;
		System.out.println(sum.sumTwoInt(10, 11));
		
		//Provided FunctionalInterface
		IntBinaryOperator multiply = (a,b) -> {
			return a * b;
		};
		System.out.println("IntBinaryOperator multiply = (a,b) -> a * b;");
		System.out.println("\tmultiply.applyAsInt(2,5): "+ multiply.applyAsInt(2,5));;
		
		
	
	}
}
