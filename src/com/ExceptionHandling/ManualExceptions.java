package com.ExceptionHandling;

class  InvalidAmountException extends Exception{
    public InvalidAmountException(String message) {
        super(message);
    }
}
public class ManualExceptions {
    static void main(String[] args) {
    try {
        withDraw(-500);

    }catch (Exception e){
        System.out.println(e);
    }
    }
    static  void withDraw(int amount)throws InvalidAmountException {
        if(amount<0){
            throw  new InvalidAmountException("Enter valid amount okay");
        }
        System.out.println("successfully done ");
    }
}
