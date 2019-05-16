?-read(X,"Enter one num"),read(Y,"Enter sec num"),eqe(X,Y).
eqe(X,Y):-Z is X mod 2,M is Y mod 2,Z is 0,M is 0,write("Equal"),nl.
eqe(X,Y):-write("not Equal"),nl.

