package com.method;

public class Overloading {
	/*
	 * Method Overloading : providing two or more separate methods in class
	 * with the same name but different parameters.
	 * 
	 * allow us to reuse the same method name regardless of Method return type.
	 * it reduces duplicated code, don't need to remember multiple method names.
	 * 
	 * doesn't have anything to do with polymorphism, but developers ofent
	 * refer to overloading as Compile Time Polymorphism.
	 * -> compiler decide method call based on the method name, return type,
	 * argumet list. 
	 * We can overload static and instance methods.
	 * 
	 * 
	 * -------------
	 * Usually Method overloading happens inside a single class
	 * A method can also be treated as overloaded in the subclass of that class.
	 * -> subclass inherits the parent class and subclass can have another overloaded
	 * version of the method. 
	 * 
	 * Rules
	 * Methods must have the same method name
	 * Methods must have different parameters.
	 * 
	 * They may 
	 * have different return types
	 * have different access modifiers
	 * throw different checked or unchecked exceptions.
	 * 
	 * 
	 * 
	 * 
	 * Method Overriding : a method in a child class that already exists
	 * in the parent class with same signature(same name, same arguments)
	 * 
	 * extending the parent class : child class gets all the methods defined
	 * in the parent class(known as derived methods)
	 * 
	 * Method Overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch
	 * -> method that is gonna be called is decided at runtime  by the JVM.
	 * 
	 * @Override
	 * -> recommended to put it immediately above the 
	 * method definition when we override a method
	 * 
	 * -> annotation that the compiler reads and will show us an error
	 * if we don't follow overriding rules correctly.
	 * 
	 * only instance methods.
	 * Alwyas in two classes that have a child-parent or IS-A relationsihp.
	 * covariant return types? 
	 * =============
	 * Rules
	 * must have same name and same arguments
	 * return type can be a subclass of the return type in the parent class.
	 * child class can't have a lower access modifier than parent class.
	 * 
	 * 
	 * can override
	 * inherited methods = child classes
	 * can't override
	 * constructors, private methods, final methods, static methods
	 * 
	 * subclass can use super.methodName() to call the superclass version of
	 * an overridden method.
	 * 
	 */
	

}

