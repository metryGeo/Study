import sys
import collections
ls = []
N = int(sys.stdin.readline().strip())
for _ in range(N):
    i = int(sys.stdin.readline().strip())
    ls.append(i)
ls.sort()
print(round(sum(ls) / len(ls)))
print(ls[(len(ls) // 2)])
a = collections.Counter(ls).most_common()
if len(ls) > 1 and a[0][1] == a[1][1]:
    print(a[1][0])
else:
    print(a[0][0])
print(ls[-1] - ls[0])