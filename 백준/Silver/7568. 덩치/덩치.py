inp = int(input())
ls = []
ls_re = []
cnt = 1
for _ in range(inp):
    a = list(map(int, input().split()))
    ls.append(a)

for i in ls:
    for j in ls:
        if i[0] < j[0] and i[1] < j[1]:
            cnt += 1
    ls_re.append(cnt)
    cnt = 1
ls_re = map(str, ls_re)
ls_re = ' '.join(ls_re)
print(ls_re)