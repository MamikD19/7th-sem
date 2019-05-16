?-read(X,"Enter one num"),read(Y,"Enter sec num"),sqroot(X,Y).
sqroot(X,Y):-Z is Y*Y, Z = X,write(Y),sqroot(X,Y+1).
