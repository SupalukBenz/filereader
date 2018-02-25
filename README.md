# Input-Output Tasks
by Supaluk Jaroensuk

I ran the tasks on a MacBook Pro with 2.9 GHz Intel Core i5, and got these results:

Task                                               | Time
---------------------------------------------------|-------------:
Read file 1-char at a time to String               |1.9213 sec
Read file 1-char at a time to StringBuilder        |0.0036 sec
Read file line at a time using BufferedReader      |0.0227 sec

From the results, Reading file from FileReader to StringBuilder is faster than others ,
because StringBuilder is preferred over String for doing concatenation of strings because it is faster. 
In the case of String, when concatenate strings, then actually creating a new object every time 
since it is immutable and that makes it slower than StringBuilder.

