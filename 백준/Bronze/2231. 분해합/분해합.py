N = int(input())

for i in range(1, N+1): #작은 수부터 올라와 생성자를 얻고 분해합을 찾음
    sum_np = sum(list(map(int, str(i)))) #각 자리를 더함
    if i + sum_np == N:
        print(i)
        break
    if i == N:
        print(0)