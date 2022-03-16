from collections import deque
N,K = map(int, input().split())
ls = []
deq = deque([i for i in range(1, N+1)])
for _ in range(len(deq)):
    deq.rotate(-(K-1))
    ls.append(deq.popleft())
print("<",end="")
for i in ls:
    if i == ls[-1]:
        print(i,end="")
    else:
        print(i,end="")
        print(", ",end="")
print(">",end="")