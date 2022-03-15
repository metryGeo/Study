import sys
from collections import deque
n = int(input())
deq = deque()
for _ in range(n):
    a = sys.stdin.readline().strip().split()
    if a[0] == "push":
        deq.append(int(a[1]))
    elif a[0] == "pop":
        if len(deq) == 0:
            print(-1)
        else: print(deq.popleft())
    elif a[0] == "size":
        print(len(deq))
    elif a[0] == "empty":
        if len(deq) == 0:
            print(1)
        else: print(0)
    elif a[0] == "front":
        if len(deq) == 0:
            print(-1)
        else: print(deq[0])
    elif a[0] == "back":
        if len(deq) == 0:
            print(-1)
        else: print(deq[-1])