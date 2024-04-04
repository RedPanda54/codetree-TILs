class Student:
    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math

n = int(input())
students = []
for _ in range(n):
    name, kor, eng, math = input().split()
    kor = int(kor)
    eng = int(eng)
    math = int(math)
    students.append(Student(name, kor, eng, math))

students.sort(key=lambda Student: (-Student.kor, -Student.eng, -Student.math))

for student in students:
    print(f"{student.name} {student.kor} {student.eng} {student.math}")