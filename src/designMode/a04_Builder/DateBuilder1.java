package designMode.a04_Builder;

public class DateBuilder1 implements IDateBuilder{
    private MyDate myDate = new MyDate();
    
    @Override
    public IDateBuilder buildDate(int y, int m, int d) {
        myDate.date = y+"-"+m+"-"+d;
        return this;
    }
    @Override
    public String date() {
        return myDate.date;
    }
}