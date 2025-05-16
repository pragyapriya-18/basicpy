class Node:
    def __init__ (self,data):
        self.data = data
        self.next = None
class ll:
    def __init__(self):
        self.head = None

    def insert(self,value):
        new = Node(value)
        new.next=self.head
        self.head = new

    def delete(self):
        if self.head is None:
            print("ll is empty")
        else:
            self.head = self.head.next 

    def search(self,key):
        temp = self.head
        while temp is not None:
            if temp.data == key:
                return True
            temp = temp.next 
        return False
    
    def display (self):
        temp = self.head
        while temp:
            print(temp.data)
            temp = temp.next

l = ll()
l.insert(10)
l.insert(20)
l.display()
l.delete()
l.display()
print(l.search(20))
