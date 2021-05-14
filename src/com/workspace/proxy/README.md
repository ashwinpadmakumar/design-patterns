# Proxy Design Pattern
```
Proxy Design Pattern is a design pattern which is used when you want to control the level of access/permissions
of the client to do some work. Example, prevent non-admin users from performing a DELETE query in database.

Basically, to connect with a database, we will have an interface (DatabaseExecuter) which will contain set
of operations without its definition. Then we will have an implementation of the interface (DatabaseExecuterImpl)
which defines what actually, the methods of the interface does. 
Also, in case of proxy pattern, we will have another proxy implementation which implements the interface (DatabaseExecuterProxy)
which defines the permissions to perform operations on DatabaseExecuterImpl.
Then, the client creates an object of DatabaseExecuterProxy and pass on the details needed for authoring the
client. After the authoring of client is done, they can perform the database operation based on their level of access.
```