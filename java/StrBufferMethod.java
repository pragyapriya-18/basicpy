class StrbufferMethod{
        public static void main(String[] args) {
            StringBuffer a = new StringBuffer("java");
    
            a.append("programming");
            System.out.println("after append" + a);
    
            a.insert(4, "language");
            System.out.println("after insert" + a);
    
            a.reverse();
            System.out.println("after reverse" + a);
        }
    }