class Goods:
    def __init__(self, name="codetree", code=50):
        self.name = name
        self.code = code

goods1 = Goods()

name, code = tuple(input().split())
code = int(code)
goods2 = Goods(name, code)


print(f"product {goods1.code} is {goods1.name}")
print(f"product {goods2.code} is {goods2.name}")