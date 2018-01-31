package a04_Builder;

public interface IDateBuilder {

	IDateBuilder buildDate(int y,int m,int d);
    String date();
}
