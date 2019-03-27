package designMode.a23_Visitor.demo;

//普通用户，具体元素
public class UserOrdinary implements User{
  String estimation;
  public UserOrdinary(String estimation){
      this.estimation = estimation;
  }
  @Override
  public void accept(Visitor visitor) {
      visitor.visit(this);//这个就是重点，第一次分派是调用accept()方法时根据接收者的实际类型来调用的，第二次分派就是通过visitor.visit(this)，传入静态类型，然后再visit()方法中反过来调用this本身的方法。
  }
  String getEstimation(){
      return estimation;
  }
}