def  Fib(n):
  if n <= 1:
    return n
  return Fib(n-1) + Fib(n-2)
n=int(input())
print(Fib(n))