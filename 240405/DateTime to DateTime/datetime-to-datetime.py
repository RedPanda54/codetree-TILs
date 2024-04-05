def calculate_minutes(a, b, c):
    start_time = (11*24*60) + (11*60) + 11

    target_time = (a*24*60) + (b*60) + c

    if target_time < start_time:
        return -1
    else:
        return target_time - start_time

a, b, c = map(int, input().split())

result = calculate_minutes(a, b, c)
print(result)