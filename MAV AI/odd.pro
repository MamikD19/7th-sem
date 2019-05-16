?-read(X,"Enter a value "),odd(X).
odd(X):-Z is X mod 2, Z is 0,write("even"),nl.
odd(X):-write("Odd"),nl.