class queue:
    def __init__ (self):
        self.queue=[]
        self.front = -1
        self.rear = -1

    def enqueue(self,value):
        self.queue.append(value)
        if self.front == -1:
            self.front = 0
            self.rear = 0
        else:
            self.rear = +1

    def dequeue(self):
        if len(self.queue) == 0:
            print("ll is empty")
            return 
        else:
            temp = self.queue.pop(self.front)
            self.rear = -1
            if len(self.queue) == 0:
                self.front = -1
                self.rear = -1

    def display(self):
        if len(self.queue) == 0:
            print("ll is empty")
            return 
        if self.front == self.rear:
            print(self.queue[self.front],"<-front <-rear")
            return
        print(self.queue[self.front],"<-front")
        i = self.front+1

        while i < self.rear:
            print(self.queue[i])
            i += 1
        print(self.queue[self.rear],"<-rear")
        print("end")

a=queue()

while True:
    option = int(input("enter ur choice \n 1.insert \n 2.delete \n 3.display \n 4.exit \n"))
    if option == 1:
        val = int(input("enter krdo"))
        a.enqueue(val)
        continue
    elif option == 2:
        a.dequeue()
        continue
    elif option == 3:
        a.display()
        continue
    elif option == 4:
        print("exit")
        break
    else:
        print("wrong option")


