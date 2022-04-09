a, b = map(int, input().split())
ls = list(map(int, input().split()))
ret = []
for i in range(len(ls) - 2):
    for j in range(i+1, len(ls) -  1):
        for x in range(j + 1, len(ls)):
            if ls[i] + ls[j] + ls[x] <= b:
                ret.append(ls[i] + ls[j] + ls[x])

print(max(ret))