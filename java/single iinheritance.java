class ShapeDemo{
    public static void main(String[]args){
        square ob = new square();
        ob.area(5,8);
    }
}
class shape{
    protected void area(){
        System.out.println("show area:");
    }
}
class square extends shape{
    protected void area(int i,int j){
        System.out.println("arae of square:"+i*j);
    }
}