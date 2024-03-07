import java.util.Scanner;
/*Create a Box class with 6 instance variables
        2 each public, private, protected
Create 3 constructors + the default constructor
        Create get and set methods for private and protected instance variables
        Give any restriction to the set methods ( has min length, has min value, etc)
        If restrictions met
        Set value
        If not
        output message*/
public class Box {
    public String publicVar1;
    public int publicVar2;

    private String privateVar1;
    private int privateVar2;

    protected String protectedVar1;
    protected int protectedVar2;

    public Box() {
        // Default constructor
    }

    public Box(String publicVar1, int publicVar2, String privateVar1, int privateVar2,
               String protectedVar1, int protectedVar2) {
        this.publicVar1 = publicVar1;
        this.publicVar2 = publicVar2;
        this.privateVar1 = privateVar1;
        this.privateVar2 = privateVar2;
        this.protectedVar1 = protectedVar1;
        this.protectedVar2 = protectedVar2;
    }

    public Box(String publicVar1, int publicVar2) {
        this.publicVar1 = publicVar1;
        this.publicVar2 = publicVar2;
    }

    public Box(String privateVar1, int privateVar2, String protectedVar1, int protectedVar2) {
        this.privateVar1 = privateVar1;
        this.privateVar2 = privateVar2;
        this.protectedVar1 = protectedVar1;
        this.protectedVar2 = protectedVar2;
    }

    public String getPrivateVar1() {
        return privateVar1;
    }

    public void setPrivateVar1(String privateVar1) {
        if (privateVar1.length() >= 3) {
            this.privateVar1 = privateVar1;
        } else {
            System.out.println("Minimum length for privateVar1 is 3 characters.");
        }
    }

    public int getPrivateVar2() {
        return privateVar2;
    }

    public void setPrivateVar2(int privateVar2) {
        if (privateVar2 >= 0) {
            this.privateVar2 = privateVar2;
        } else {
            System.out.println("privateVar2 should have a minimum value of 0.");
        }
    }

    public String getProtectedVar1() {
        return protectedVar1;
    }

    public void setProtectedVar1(String protectedVar1) {
        if (protectedVar1.length() >= 5) {
            this.protectedVar1 = protectedVar1;
        } else {
            System.out.println("Minimum length for protectedVar1 is 5 characters.");
        }
    }

    public int getProtectedVar2() {
        return protectedVar2;
    }

    public void setProtectedVar2(int protectedVar2) {
        if (protectedVar2 >= 10) {
            this.protectedVar2 = protectedVar2;
        } else {
            System.out.println("protectedVar2 should have a minimum value of 10.");
        }
    }
}


