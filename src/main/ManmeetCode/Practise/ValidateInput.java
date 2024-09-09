package Practise;

public class ValidateInput {
        public void validateString(Object obj) throws InvalidStringException{
            if(obj.getClass().equals(String.class)){
                System.out.println("Valid String");
            }
            else{
                throw new InvalidStringException("Invalid String");
            }

        }

    public void validateInteger(Object obj) throws InvalidIntegerException {
        if(obj.getClass().equals(Integer.class)){
            System.out.println("Valid Integer");
        }
        else{
            throw new InvalidIntegerException("Invalid Integer");
        }
    }
}
