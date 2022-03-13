import sys
n = int(sys.stdin.readline())
ls = []
for _ in range(n):
    inp = list(sys.stdin.readline().strip().split(' '))
    if inp[0] == 'push':
        ls.append(int(inp[1]))
    elif inp[0] == 'pop':
        if len(ls) == 0:
            print(-1)
        else:
            print(ls.pop())
    elif inp[0] == 'size':
        print(len(ls))
    elif inp[0] == 'empty':
        if len(ls) > 0:
            print(0)
        else:
            print(1)
    elif inp[0] == 'top':
        if len(ls) == 0:
            print(-1)
        else:
            print(ls[-1])