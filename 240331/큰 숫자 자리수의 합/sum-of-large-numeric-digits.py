def solution(x):
    if x < 10:
        return x
    else:
        return (x % 10) + solution(x // 10)

a, b, c = map(int, input().split())
mul = a * b * c
print(solution(mul))