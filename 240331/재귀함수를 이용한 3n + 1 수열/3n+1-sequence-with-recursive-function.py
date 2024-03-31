def solution(n):
    if n <= 1:
        return 0
    
    if n % 2 == 0:
        return 1 + solution(n // 2)
    else:
        return 1 + solution(3 * n + 1)

n = int(input())
print(solution(n))