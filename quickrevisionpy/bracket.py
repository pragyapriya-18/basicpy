open_list = [ "(", "[", "{"]
close_list = [")", "]", "}"]

def check(myStr):
    stack = []
    for i in (myStr):
        if i in open_list:
            stack.append(i)
        elif i in close_list:
            pos = close_list.index(i)
            if stack and open_list [pos] == stack[-1]:
                stack.pop()
            else:
                return"unbalanced"
    if len(stack) == 0:
        return"balanced"
    else:
        return"unbalanced"

string = "[{"
print(string , check(string))       