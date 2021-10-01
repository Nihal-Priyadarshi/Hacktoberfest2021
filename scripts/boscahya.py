print("Hallo ")
print("My Name is Arif Cahya Prananda")
print("Iam From Indonesia")
print("Hi! I'm Web application developer, excellent analytical and design capabilities with a keen attention to detail and overall quality of end result, my goals are to continue to provide a high quality development service and to participate in successful projects. I'm specializing in the development of Back-End web applications and working on many applications, from simple api applications to microservises systems.")
print(" ")


def gen(n, r=None):
    if r is None:
        r = []
    for x in range(n):
        length_r = len(r)
        r = [1 if i == 0 or i == length_r else r[i - 1] + r[i] for i in range(length_r + 1)]
        yield r


def draw(n):
    for p in gen(n):
        print(' '.join(map(str, p)).center(n * 2) + '\n')


def draw_beautiful(n):
    ps = list(gen(n))
    max_val = len(' '.join(map(str, ps[-1])))
    for p in ps:
        print(' '.join(map(str, p)).center(max_val) + '\n')


draw_beautiful(10)