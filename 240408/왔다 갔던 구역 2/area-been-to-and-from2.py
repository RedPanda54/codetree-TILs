n=int(input())
li=[0]*2000
segment=[
    input().split()
    for _ in range(n)
]
now=1000
for x, direction in segment:
    if direction=='L':
        for j in range(int(x)):
            li[now]+=1
            now+=1
    elif direction=='R':
        for j in range(int(x)):
            now-=1
            li[now]+=1
cnt=0
for i in range(2000):
    if li[i]>1:
        cnt+=1
print(cnt)


# n = int(input())
# count = [0] * 2001
# origin_point = 1000

# now_position = origin_point

# for _ in range(n):
#     dx, shift = map(str, input().split())
#     dx = int(dx)
    
#     if shift == 'L':
#         for i in range(now_position, now_position - dx, -1):
#             count[i] += 1
#         now_position -= dx
#     else:
#         for i in range(now_position, now_position + dx, 1):
#             count[i] += 1
#         now_position += dx
    
# result = 0
# for cnt in count:
#     if cnt > 1:
#         result += 1
# print(result)