from collections import deque
N, M = map(int, input().split())
deq = deque([i for i in range(1, N+1)])
ls = list(map(int, input().split()))
cnt = 0
for _ in range(M):
    if ls[0] == deq[0]:
        deq.popleft()
        ls.pop(0)
    elif deq.index(ls[0]) <= len(deq)//2:
        while deq[0] != ls[0]:
            deq.rotate(-1)
            cnt += 1
        deq.popleft()
        ls.pop(0)
    elif deq.index(ls[0]) > len(deq)//2:
        while deq[0] != ls[0]:
            deq.rotate(1)
            cnt += 1
        deq.popleft()
        ls.pop(0)
print(cnt)