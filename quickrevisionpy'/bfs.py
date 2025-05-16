from queue import Queue

graph = {2:[2,4,5],5:[7,8,9],4:[7,2,4]}
print("graph is")
print(graph)

def bfs(input_graph,source):
    Q = Queue()
    visited_list = list()
    Q.put(source)
    visited_list.append(source)
    while not Q .empty():
        pp = Q.get()
        print(pp,end=" ")
        if pp in input_graph:
            for u in input_graph[pp]:
                if u not in visited_list:
                    Q.put(u)
                    visited_list.append(u)

print("graph is")
bfs(graph,4)
   

