a, b, c = input().split(' ')
a = int(a)
b = int(b)
c = int(c)

if a > b and b <= c:
    print(":)")
elif a < b and b >= c:
    print(":(")
elif a < b and b < c:
    if (c - b) >= (b - a):
        print(":)")
    else:
        print(":(")
elif a > b and b > c:
    if (b - c) < (a - b):
        print(":)")
    else:
        print(":(")
elif a == b:
    if b < c:
        print(":)")
    else:
        print(":(")
        
