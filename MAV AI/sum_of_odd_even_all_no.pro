odd(X) :- Y is X + 1, even(Y).

even(X) :- Y is X mod 2, Y = 0.


sum_odd(0, []).

sum_odd(X, [H|T]) :- odd(H), sum_odd(Y, T), X is Y+H.

% to ignore the odd numbers
sum_odd(X, [H|T]) :- even(H), sum_odd(X, T).


sum_even(0, []).

sum_even(X, [H|T]) :- even(H), sum_even(Y, T), X is Y+H.

% to ignore the even numbers
sum_even(X, [H|T]) :- odd(H), sum_even(X, T). 


sum_all(0, []).

sum_all(X, [H|T]) :- sum_all(Y, T), X is Y+H.


?- L is [1,2,3,4,5,6],
%read(L,"enter the list of elements: "),
write("given list of elements: "), write(L), nl,
sum_odd(X,L), 
write("sum of odd numbers: "), write(X), nl,
sum_even(Y,L), 
write("sum of even numbers: "), write(Y), nl,
write("sum of all the numbers: "), 
sum_all(Z,L), write(Z), nl.

