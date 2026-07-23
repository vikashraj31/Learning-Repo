package OOPS.ExceptionHandling;

//create my own exception
class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}



public class Throw {
    public static void main(String[] args) {

        int marks = 30;

        try {
            if(marks < 40){
                throw new MyException("Fail");
            }
            System.out.println("Pass");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
