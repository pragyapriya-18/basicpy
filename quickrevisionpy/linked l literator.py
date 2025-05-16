class Node:
    def __init__(self,data=None,next=None):
        self.data = data
        self.next = next

class linkedlist:
    def __init__(self):
        self.head = None

    def insert(self,data):
        new_node = Node(data)
        if(self.head):
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
        else:
            self.head = new_node

    def print_list(self):
        temp = self.head
        while temp:
            yield temp.data
            temp = temp.next
    

ll = linkedlist()
ll.insert(10)
ll.insert(20)

for i in ll.print_list():
    print(i)