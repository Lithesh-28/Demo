package exceptionDemo;

public class CustomExceptionDemo extends Exception{
    String message;
    public CustomExceptionDemo(String message){
        super(message);
        this.message= message;
    }
}
