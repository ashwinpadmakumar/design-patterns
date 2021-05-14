# Factory Pattern
```
Factory pattern is a design patter which is used in the cases where we have a superclass and
lot of subclasses under it and we need a seperate factory class to do the job of getting creating
the instances of the subclasses and returning to one who needs it.

The one who wants a particular subclass object should pass the subclass name to getInstance
method of the factory class.

We need factory pattern because, if we dedicate a factory class to create the instances
then in future even if we need modify the name of existing subclass, then we need to change
only in factory class.
```

### Code Explanation
```
Vehicle - Super class
Car and Bike - Subclass
VehicleFactory - The class which creates the instances of Bike and Car
FactoryPattern - The class which invokes the creation of Bike and Car
```