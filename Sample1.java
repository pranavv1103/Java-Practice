class Demo{
    static int id;
    String name;
    public Demo(String name){
        this.name = name;
    }
    static{
        id = 7;
    }
    public void show(){
        System.out.println(id +" "+name);
    }
}
public class Sample1 {
    public static void main(String[] args) {
        Demo obj = new Demo("Dhoni");
        obj.show();
    }
}
