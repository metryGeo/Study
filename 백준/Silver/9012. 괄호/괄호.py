import sys
n = int(input())
for i in range(n):
    ls = []
    count = 0
    inp = sys.stdin.readline().strip()
    for j in range(len(inp)):
        if inp[j] == "(":
            ls.append("(")
        elif inp[j] == ")":
            if "(" in ls:
                ls.pop()
            else:
                count +=1
                break
    if len(ls) > 0 or count == 1:
        print("NO")
    else: print("YES")