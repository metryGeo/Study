import sys
import heapq
N = int(sys.stdin.readline().strip())
ls_left = []
ls_right = []
for _ in range(N):
    i = int(sys.stdin.readline().strip())
    if len(ls_left) == len(ls_right):
        heapq.heappush(ls_left, -i)
    else:
        heapq.heappush(ls_right, i)
    if ls_left and ls_right and -ls_left[0] > ls_right[0]:
        a = heapq.heappop(ls_left)
        b = heapq.heappop(ls_right)
        heapq.heappush(ls_left, -b)
        heapq.heappush(ls_right, -a)
    print(-ls_left[0])