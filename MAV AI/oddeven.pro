oddeven(X,Y):- read(Y), X is Y mod 2, X=0, write("Even"),nl.
oddeven(X,Y):- write("Odd"),nl.
?-oddeven(A,B).