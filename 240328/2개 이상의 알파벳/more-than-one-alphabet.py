def is_more_twoalp(string):
    leng = len(string)
    for i in range(leng):
        if string[i] != string[0]:
            return True
    
    return False

A = input()
if is_more_twoalp(A):
    print("Yes")
else:
    print("No")