class stack:
    def __init__(self,maxsize,top):
        self.maxsize = maxsize
        self.top = top
        self.list = []

    def __str__(self):
        value = self.list.reverse()
        value = [str(x)for x in self.list]
        return'\n'.join(value)
    
    def push(self,value):
        if self.top == self.maxsize:
            print("stack is full")
        else:
            self.list.append(value)
            self.top+=1
            print(value,"has been inserted ")

    def pop(self):
        if self.top == -1:
            print("stack is empty")
        else:
            print("the stack is deleted",self.list.pop())
            self.top-=1

    def display(self):
        if self.top == -1:
            print("the stack is empty")
        else:
            print("the stack contains are")
            print(self)

s = stack(4,0)
s.push(10)
s.push(20)
s.push(30)
s.display()
s.pop()
s.display()