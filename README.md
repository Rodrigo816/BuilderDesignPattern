# BuilderDesignPattern
Homework presentation -> Builder Design Pattern

The Builder is a creational pattern that allows us to separate the construction of more complex class, from the representation of the class.
A Builder class builds the final object step by step. This builder is independent of other objects.


Too Many arguments to pass from client program to the class that can be error prone because most of the time, the type of arguments are same and from client side it's hard to maintain the order of the argument.
Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

First of all you need to create a static nested class and then copy all the properties on the construtor from the outer class to the Builder class. We should follow the naming convention and if the class name is User then builder class should be named as User Builder.
Java Builder class should have a public constructor with all the required attributes as parameters.
Java Builder class should have methods to set all the properties from the outer class and it should return the same Builder object.
The final step is to provide a build() method in the builder class that will return the Object needed by client program. 
