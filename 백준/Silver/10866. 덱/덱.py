from collections import deque
import sys
N = int(input())
deq = deque()
for _ in range(N):
    r = list(sys.stdin.readline().strip().split())

    if r[0] == "push_front":
        deq.appendleft(r[1])
    elif r[0] == "push_back":
        deq.append(r[1])
    elif r[0] == "pop_front":
        if deq:
            print(deq.popleft())
        else:
            print(-1)
    elif r[0] == "pop_back":
        if deq:
            print(deq.pop())
        else:
            print(-1)
    elif r[0] == "size":
        print(len(deq))
    elif r[0] == "empty":
        if not deq:
            print(1)
        else:
            print(0)
    elif r[0] == "front":
        if deq:
            print(deq[0])
        else:
            print(-1)
    elif r[0] == "back":
        if deq:
            print(deq[-1])
        else:
            print(-1)
