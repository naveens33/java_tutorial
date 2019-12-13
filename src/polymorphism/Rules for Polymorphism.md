# Rules for Polymorphism

There are two types of polymorphisms

* Compile time polymorphisms (overloading of functions ) 
* Runtime polymorphisms (overriding of functions )


**Rules for Overloading**

* Function name should be same
* Must have different arguments list (quantity and types)
* Functions should belong to the same class
* Constructor can be overloaded
* Overloading a method inherited from a superclass
* Overloading in interfaces and abstract classes

**Rules for Overriding**

* Only inherited methods can be overridden
* Final and static methods cannot be overridden
* The overriding method must have same argument list
* The overriding method must have same return type (or subtype)
* The overriding method must not have more restrictive access modifier
* The overriding method must not throw new or broader checked exceptions
* Use the super keyword to invoke the overridden method from a subclass
* Constructors cannot be overridden
* Abstract methods must be overridden by the first concrete (non-abstract) subclass
* A static method in a subclass may hide another static one in a superclass, and that’s called hiding
