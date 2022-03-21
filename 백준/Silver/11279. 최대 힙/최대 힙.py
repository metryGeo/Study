import sys
import heapq
n = int(input())
ls = []
for _ in range(n):
    a = int(sys.stdin.readline().strip())
    if a > 0:
        heapq.heappush(ls, -a)
    elif a == 0:
        if len(ls) == 0:
            print(0)
        else:
            print(heapq.heappop(ls)*(-1))