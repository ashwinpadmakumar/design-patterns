# Builder Design Pattern
```
Builder design pattern is a pattern which is used when we have lot of constructor arguments while
creating an object or in some cases where not all the constructor parameters are necessary for creating
the object and some can be optional too. 
```


### Code Explanation
```
The POJO of the object(Vehicle) should have a public static inner class as a builder(VehicleBuilder).
The values that are mandatory, can be set using the constructor of builder class inside builder class.
The values that are optional, can be set using setter method and it should return a builder object.
A build method should be created to return the built object.

Outside the builder class, there should be only getters because if we put setters outside then
the object can be set as usual without even using the builder pattern.

In the output of the code, we could see that
airbag value for car is set to 4, so the output is 4.
airbag value for bike is set not set, so the output is the default value which is 0. 
```