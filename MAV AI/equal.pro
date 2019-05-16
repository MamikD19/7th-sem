equal(X,Y):- read(X), X=Y, write("Given number is equal"),nl.
equal(X,Y):- write("Given number is not equal"),nl.
?-equal(_,9).