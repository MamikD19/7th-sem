lst([]):-write("null list").
lst([H|T]):-write(H),write(T).
?-read(L),lst(L). 