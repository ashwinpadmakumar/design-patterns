# Facade Design Pattern
```
Facade Design Pattern is a design pattern which is used when there are multiple interfaces/classes which
does the same kind of jobs, then we add a facade interface/class which acts as a helper class to route the
requests from the client appropriately

Here, Chrome and Firefox are two classes which actually does the same set of functions. So we added a WebExplorerHelperFacade
to handle the requests from the client and route it to chrome/firefox based on the user input.
```