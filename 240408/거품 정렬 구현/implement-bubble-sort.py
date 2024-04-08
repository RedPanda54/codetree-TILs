n = int(input())
arr = list(map(int, input().split()))

sorted = False
while sorted == False:
    sorted = True
    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]:
            temp = arr[i]
            arr[i] = arr[i+1]
            arr[i+1] = temp
            sorted = False
    
print(*arr)