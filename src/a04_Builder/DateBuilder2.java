package a04_Builder;

public class DateBuilder2 implements IDateBuilder{
	private MyDate myDate = new MyDate();
	
    @Override
    public IDateBuilder buildDate(int y, int m, int d) {
        myDate.date = y+"年"+m+"月"+d+"日";
        return this;
    }
    @Override
    public String date() {
        return myDate.date;
    }
}