package designMode.a23_Visitor;

public class Dispatch {
    void print(FatherClass c){
        System.out.print("父类");
    }
    
    void print(ChildClass c){
        System.out.print("子类");
    }
    
    void print(ChildClass2 c){
        System.out.print("子类");
    }
    
    
    public static void main(String args[]){
        FatherClass child = new ChildClass();
        new Dispatch().print(child);    //静态分派(Static Dispatch)
//        child.print();  				//动态分派(Dynamic Dispatch)
    }
}


class FatherClass{
}


class ChildClass extends FatherClass{
}

class ChildClass2 extends FatherClass{
}