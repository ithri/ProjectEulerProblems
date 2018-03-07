cycles = 1
num = 3
i = 3
while i < 1000:
    j = 1
    while j < i:
        a = 10 ** j % i
        if a == 0:
            break
        if a == 1:
            if j > cycles:
                cycles = j
                num = i
            break
        j = j + 1
    i = i + 2

print("cycles = ", cycles, " du numero ", num)