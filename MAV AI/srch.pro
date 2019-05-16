srch(X,[X|L],C):- write("Found at : "),write(C).
srch(Y,[X|L],C):- C:=C+1, srch(Y,L,C).
?- srch(9,[5,6,9,8,9],0).