package designMode.a23_Visitor;

//使用访问者模式 实现 双重分派
public class Dispatch2 {
    void print(Father c){
        System.out.print("父类");
    }
    
    void print(Child c){
        System.out.print("子类");
    }
    
    
    public static void main(String args[]){
        Father child = new Child();
        child.print(new Dispatch2());
    }
}


class Father{
    void print(Dispatch2 visitor){
    	visitor.print(this);
    }
}


class Child extends Father{
	void print(Dispatch2 visitor){
    	visitor.print(this);
    }
}