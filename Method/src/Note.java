import java.util.ArrayList;

public class Note {
/*
 * Overloading
 Method Overloading : providing two or more separate methods in class
 with the same name but different parameters.
 
 allow us to reuse the same method name regardless of Method return type.
 it reduces duplicated code, don't need to remember multiple method names.
 
 doesn't have anything to do with polymorphism, but developers ofent
 refer to overloading as Compile Time Polymorphism.
 -> compiler decide method call based on the method name, return type,
 argumet list. 
 We can overload static and instance methods.
 
 
 -------------
 Usually Method overloading happens inside a single class
 A method can also be treated as overloaded in the subclass of that class.
 -> subclass inherits the parent class and subclass can have another overloaded
 version of the method. 
 
 Rules
 Methods must have the same method name
 Methods must have different parameters.
 
 They may 
 have different return types
 have different access modifiers
 throw different checked or unchecked exceptions.
 
 
 
 
 Method Overriding : a method in a child class that already exists
 in the parent class with same signature(same name, same arguments)
 
 extending the parent class : child class gets all the methods defined
 in the parent class(known as derived methods)
 
 Method Overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch
 -> method that is gonna be called is decided at runtime  by the JVM.
 
 @Override
 -> recommended to put it immediately above the 
 method definition when we override a method
 
 -> annotation that the compiler reads and will show us an error
 if we don't follow overriding rules correctly.
 
 only instance methods.
 Always in two classes that have a child-parent or IS-A relationsihp.
 covariant return types? 
 =============
 Rules
 must have same name and same arguments
 return type can be a subclass of the return type in the parent class.
 child class can't have a lower access modifier than parent class.
 
 
 can override
 inherited methods = child classes
 can't override
 constructors, private methods, final methods, static methods
 
 subclass can use super.methodName() to call the superclass version of
 an overridden method.
 
 	 * Static Methods

can't access instance methods and instance variables directly : this
so usually don't require any data from an instance of the class
: A method that does not use instance variables should be declared
as a static method.

Instance Methods
belongs to an instance of a class.
to use : instantiate the class first usually by using the new keyword.

can access instance methods and instance variables directly.
can also access static methods and static variables directly.


Static Variables
declared by using the keyword static
known as static member variables.
Every instance of that class shares the same static variable.
if changes are made to the variable, all other instances will see
the effect of the change.

not used very often but can sometimes be very useful.
Ex : when we using Scanner class, we will declare scanner as a 
static variable, this way static methods can access it directly.


Instance Variables
are known as fields or member variables.
belong to an instance of a class.

Every instance
has it's own copy of an instance variable.
can have a different value(state) - field
Instance variables represent the state of an instance.


super() : �θ��� ������, �� ȣ��? Object�� �����ϰ� ���� �����ϱ� ����
������� ��, ���� �ƴ�
���� ������ ���� : extends Object�� ���� �ʴ� ������ ����
�ڹ� �����Ͽ��� �˾Ƽ� �ڵ� ����.

������ ���迡���� ������ ���� ����. ���� ����� �������� ������ ������شٴ� ���� �ʿ�!

�߻� Ŭ������ ������ �� ����? -> �͸�Ŭ������ �ٲ㼭 �ٷ� �� �� �ִ�.
�͸�Ŭ������? : �̸��� ����.	Class �����
������ �߻� Ŭ���� �� Interface�� ������ �� ��� �����Ͽ� ����ϴ� ���
�� �� ���� ������ ����, ���� ���Ϸ� ����ų� Class�� �����ϰ� ���� ���� ��

�̹� �θ��� Type�� ��ӵ�, �͸��� Ŭ���� : ���߻�� �Ұ�!
���� : local �������� �ڵ� ���� ����, �ͼ��� ������״� ����, ��ô�̳�
���� : �����ϴ�.
���� ���� �� : Ķ����, Thread, GUI �̺�Ʈ ó��, ���� -> ����

Class
unlike data types, there isn't default values with classes -> compile error
that's why I need to initialize with new keyword.

another case : more less forcing it to crash
if it has null value

NullPointException : it hasn't been initialized
->  we haven't created an object from the template(class)

System.out.println("Model is " + porsche.getModel());
// it returns null
// because null is the eternal default state for a class and a string


Constructor
initializes the instance variables
 3rd constructor does all the work.
No matter what constructor we call, the variables will 
always be initialized in 3rd constructor
constructor chaining 	-> to avoid code duplication
last constructor has the "responsibility" to initialize the variables.
		


Encapsulation
Encapsulation : making fields private, making sure that class or fields wihtin the 
class are not accessible to any classes that are outside
	


Composition
if we don't need variable for a method, we can just type the method with new keyword and parameters.

difference between inheritance : passing those constructors so we can form our PC
PC has a case, motherboard, and a monitor. -> this is the way when we're thinking of whether to use inheritance or composition.
	
	
		
		
		
ArrayList

ArrayList<String> newArray = new ArrayList<String>();	
//to copy array instead of for loop : create a new array list -> put new array.addAll -> originalList.getter;
newArray.addAll(groceryList.getGroceryList());		
        
//second way to copy array list.
ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
 
// copy the array list and convert that back to a regular array
String[] myArray = new String[groceryList.getGroceryList().size()];
myArray = groceryList.getGroceryList().toArray(myArray);

Autoboxing , Unboxing
reason we use : unless it's messy and uncomfortable
need reference class as type argument to save something to an arrayList

Autoboxing -> Primitive to Wrapper
Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

Unboxing -> Wrapper to Primitive
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally   




 
	 */
	


}
