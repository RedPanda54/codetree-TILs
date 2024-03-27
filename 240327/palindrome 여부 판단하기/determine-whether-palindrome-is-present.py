def checking(A, B):
    if A == B:
        print("Yes")
    else:
        print("No")

A = input()
list_A = list(A)
list_A.reverse()
reverse_A = ''.join(list_A)

checking(A, reverse_A)