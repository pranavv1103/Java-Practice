class Demo{
    int id;
    String name;
    public Demo(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void show(){
        System.out.println(id +" "+name);
    }
}
public class Sample1 {
    public static void main(String[] args) {
        Demo obj = new Demo(7, "Dhoni");
        obj.show();
    }
}
