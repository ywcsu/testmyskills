def to_negative_base(n, R):
    s = ''
    while n != 0:
        r = n % R
        if r < 0:
            r -= R
            n = (n - r) // R + 1
        else:
            n //= R
        if r < 0:
            r += R
        if r < 10:
            s = str(r) + s
        else:
            s = chr(ord('A') + r - 10) + s
    return s if s else '0'

while True:
    try:
        N, R = map(int, input().split())
        if N == 0:
            print('0')
        else:
            s = to_negative_base(N, R)
            print(s)
    except EOFError:
        break