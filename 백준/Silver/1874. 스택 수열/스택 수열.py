import sys
n = int(input())
cnt = 1
s = []
p_m = []
t_f = True
for _ in range(n):
    inp = int(sys.stdin.readline().strip())
    while cnt <= inp:
        s.append(cnt)
        p_m.append("+")
        cnt += 1
    if inp == s[-1]:
        s.pop()
        p_m.append("-")
    else:
        t_f = False
if t_f == True:
    for i in range(len(p_m)):
        print(p_m[i])
else:
    print("NO")