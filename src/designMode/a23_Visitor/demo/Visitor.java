package designMode.a23_Visitor.demo;

//抽象访问者
public interface Visitor {
  void visit(UserVIP user);
  void visit(UserOrdinary user);
}