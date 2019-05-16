range(X,Y,Z):- read(X,"Enter the lower range"),

read(Y,"Enter the upper range"),

read(Z,"Enter the number"), Z>X , Z<Y, write("within"),nl.

range(X,Y,Z):- write("Not in range"),nl .

?-range(A,B,C).
