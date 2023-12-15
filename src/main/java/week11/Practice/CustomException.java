package week11.Practice;


class IllegalNameException extends Throwable {

    public IllegalNameException(String message) {
        super(message);
    }
}

class VeryIllegalNameException extends RuntimeException {

    public VeryIllegalNameException(String message) {
        super(message);
    }

    public VeryIllegalNameException(Throwable cause) {
        super(cause);
    }
}
class CustomException {
    public static void main(String[] args) throws IllegalNameException{ // OVAJ METHOD SIGNATURE NE BI BIO POTREBAN AKO BI STAVILI DA IllegalNameException extenda RuntimeException
        String name = "emirprasovicpametnilijepiskromnilogicnohaha";
        if(name.length() > 40) {
            throw new VeryIllegalNameException(new RuntimeException("Daamn you can't do that"));
        }
        else if(name.length() > 30) {
            throw new IllegalNameException("your name is too long!");
        }
    }
}
