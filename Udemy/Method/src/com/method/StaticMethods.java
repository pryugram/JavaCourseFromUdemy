package com.method;

public class StaticMethods {

	/*
	 * Static Methods
	 * can't access instance methods and instance variables directly : this
	 * so usually don't require any data from an instance of the class
	 * : A method that does not use instance variables should be declared
	 * as a static method.
	 * 
	 * Instance Methods
	 * belongs to an instance of a class.
	 * to use : instantiate the class first usually by using the new keyword.
	 * 
	 * can access instance methods and instance variables directly.
	 * can also access static methods and static variables directly.
	 * 
	 * 
	 * Static Variables
	 * declared by using the keyword static
	 * known as static member variables.
	 * Every instance of that class shares the same static variable.
	 * if changes are made to the variable, all other instances will see
	 * the effect of the change.
	 * 
	 * not used very often but can sometimes be very useful.
	 * Ex : when we using Scanner class, we will declare scanner as a 
	 * static variable, this way static methods can access it directly.
	 * 
	 * 
	 * Instance Variables
	 * are known as fields or member variables.
	 * belong to an instance of a class.
	 * 
	 * Every instance
	 * has it's own copy of an instance variable.
	 * can have a different value(state) - field
	 * Instance variables represent the state of an instance.
	 * 
	 * 
	 * super() : 부모의 생성자, 왜 호출? Object를 생성하고 본인 생성하기 위해
	 * 명시적인 것, 관례 아님
	 * 생략 가능한 이유 : extends Object를 쓰지 않는 이유와 동일
	 * 자바 컴파일에서 알아서 코드 삽입.
	 * 
	 * 정적인 관계에서는 없으면 동작 안함. 실제 어셈블리 레벨에서 누군가 만들어준다는 인지 필요!
	 * 
	 * 추상 클래스는 생성할 수 없다? -> 익명클래스로 바꿔서 바로 쓸 수 있다.
	 * 익명클래스란? : 이름이 없다.	Class 몸통부
	 * 간단한 추상 클래스 및 Interface를 생헝할 때 즉시 구현하여 사용하는 방법
	 * 몇 줄 내로 간단한 구조, 굳이 파일로 만들거나 Class로 설계하고 싶지 않을 때
	 * 
	 * 이미 부모의 Type이 상속됨, 익명의 클래스 : 다중상속 불가!
	 * 장점 : local 영역에서 코드 구현 가능, 익숙한 사람한테는 편리함, 무척이나
	 * 단점 : 복잡하다.
	 * 많이 쓰는 곳 : 캘린더, Thread, GUI 이벤트 처리, 서블릿 -> 가끔
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
}
