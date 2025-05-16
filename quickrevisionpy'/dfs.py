graph = {2:[5,6],5:[5,3,2],8:[8,9,2],1:[5,7]}
print("graph is")
print(graph)

def dfs(input_graph , source):
    stack = list()
    visited_list = list()
    stack.append(source)
    visited_list.append(source)
    while stack:
        pp = stack.pop() 
        print(pp,end=" ")
        if pp in input_graph:
            for u in input_graph[pp]:
                if u not in visited_list:
                    stack.append(u)
                    visited_list.append(u)
print("dfs is")
dfs(graph,2)
    