class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show(){
        System.out.println("In B show");
    }

    public void config(){
        System.out.println("In B config");
    }
}

class Inherit {
    public static void main(String[] args) {


        B obj1 =new B();
        obj1.config(); 
        
    }
}
