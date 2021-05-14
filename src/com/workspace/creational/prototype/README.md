# Prototype Design Pattern
```
Prototype design pattern is a type of design pattern which is used when we do not want to use perform operations
on original object, but take a clone of the original object and perform operations on the cloned object.
```

### Conditions
```
The POJO object should implement Clonable interface and override the clone() method of the Clonable
interface with the logic to copy the original object to a temporary object.
```

### Code Explanation
```
Here, the vehicle object is the one that can be cloned and used. In the clone() definiton, we are
copying the original object's list to a temporary list and creating a new object with the list.
By doing this, a new object reference will be passed when we call vehicle.clone().
```