package designMode.a04_Builder;

/**
 * 建造者模式
 */
public class Test {

	public static void main(String[] args) {  
		Derector derector = new Derector(new DateBuilder1());
		System.out.println( derector.getDate(2018, 1, 1) );
		
		
		Derector derector2 = new Derector(new DateBuilder2());
		System.out.println( derector2.getDate(2018, 1, 1) );
    }
}
