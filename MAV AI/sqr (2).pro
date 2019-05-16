sqr(Y,X,Z):-Y is X*X,write(X),nl,Z is X/X,write(Z),nl.
?-sqr(Y,9,Z),write("Squre is: "),nl,write(Y),nl,
write("squreroot is: "),nl,write(Z),nl.