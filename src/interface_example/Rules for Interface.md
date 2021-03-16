# Rules for Interface

* All Interface Method can have either “abstract”, “static” or “default” modifier
* Interface methods can have a body if static or default modifier is used against the method
* An interface is 100% abstract class(Implicitly). After Java 8 it doesn’t hold true.
* Interfaces can be implemented by any class from any inheritance tree.
* An interface can have constants, these constants are public, static and final(Implicitly).
* An interface can also have private methods. (Java 9)
* A class implementing an interface can also be an abstract class.
* An abstract class which is implementing an interface need not implement all abstract method.
* A class can Implement more than one Interface.
* Interfaces can not extend a class or implement an Interface.
* An interface can extend another Interface.

	A non-abstract class which is implementing an Interface needs to follow some rules.
	
	1. This class needs to provide the concrete implementation of all abstract method.
	2. All rules of Overriding needs to be followed.
	3. It must maintain the exact signature of a method.