a(X,Y):-X>2,Y is X-4.
a(X,Y):-Y is X+1.
?-read(X),a(X,Y),a(X,Y),write(Y).
