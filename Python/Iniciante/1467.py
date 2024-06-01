while True:
    try:
        a, b, c = list(map(int, input().split()))

        if a == b == c: print("*")
        else:
            if b == c: print("A")
            if a == c: print("B")
            if a == b: print("C")

    except EOFError:
        break
