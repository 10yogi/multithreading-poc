# multithreading-poc
some POC programms on multithreading in java

If we extend the thread class, our class cannot extend other class because Java doesnot support multiple inherience.
extending thread class provides some inbuilt method like yield, interrupt etc but that are not available in Runnable interface;

states of thread:-
1.New   ---> start() 2.Runnable  
3.Blocked
4.Waiting
5.Timed Waiting
 ---> runout()  6.Terminated