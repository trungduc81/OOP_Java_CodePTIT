import math
def isprime(n):
    if n<2: return False
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0: return False
    return True

n , m = map(int , input().split())
a = list()
for i in range(n):
    tmp = list(map(int , input().split()))
    a.append(tmp)
for i in range(n):
    for j in range(m):
        if isprime(a[i][j]):
            a[i][j] = 1
        else : a[i][j] = 0
for i in a:
    print(*i)
