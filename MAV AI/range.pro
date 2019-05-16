?-read(X,"Enter the number u want to search"),read(Y,"Enter the numbeer range"),range(X,Y).
range(X,Y):-Y>X,write("Present"),nl.
range(X,Y):-write("not present"),nl.
