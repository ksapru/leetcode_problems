Blackjack

import sys

import ast

 
try:
  A = Input()
	ast.literal_eval(A)
  B = Input()
    ast.literal_eval(B)

    C = Input()
    ast.literal_eval(C)

	  result = abs(C[0]*len(B)+C[1])
    print(result)

if ( result == 1):
  print(-1)
else:
  print(result)
