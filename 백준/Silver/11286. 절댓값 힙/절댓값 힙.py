import heapq
import sys
heap = []
ls = []
N = int(sys.stdin.readline().strip())
for _ in range(N):
    x = int(sys.stdin.readline().strip())
    if x == 0:
        if heap:
            p = heapq.heappop(heap)
            if -p in ls:
                ls.remove(-p)
                print(-p)
            else:
                ls.remove(p)
                print(p)
        else:
            print(0)
    elif x < 0:
        heapq.heappush(heap, abs(x))
        ls.append(x)
    else:
        heapq.heappush(heap, x)
        ls.append(x)