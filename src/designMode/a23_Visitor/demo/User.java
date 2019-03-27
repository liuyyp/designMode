package designMode.a23_Visitor.demo;

//抽象元素
/**
 * 比如我们有个app需要接收用户的反馈，用户由会员和普通用户，因为反馈太多，并不是所有反馈都会被记录到有效反馈表中，是否记录为有效通常不是用户说了算，而是有我们自己定。
 * @author glodon
 */
public interface User {
  void accept(Visitor visitor);
}
