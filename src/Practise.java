public class Practise {
    public String publicVar1;
    public int  publicVar2;
    private String privateVar1;
    private int privateVar2;
    protected String protectedVar1;
    protected int protectedVar2;


    public Practise(String publicVar1, int publicVar2, String privateVar1, int  privateVar2, String protectedVar1, int protectedVar2) {
        this.publicVar1 = publicVar1;
        this.publicVar2 = publicVar2;
        this.privateVar1 = privateVar1;
        this.privateVar2 = privateVar2;
        this.protectedVar1 = protectedVar1;
        this.protectedVar2 = protectedVar2;
    }
    public Practise(String publicVar1, int publicVar2) {
        this.publicVar1 = publicVar1;
        this.publicVar2 = publicVar2;
    }

    public Practise(String privateVar1, int privateVar2, String protectedVar1, int protectedVar2) {
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
            System.out.println("min lenght 3");
        }
    }

    public int getPrivateVar2() {
        return privateVar2;
    }

    public void setPrivateVar2(int privateVar2) {
        if( privateVar2>=0) {
            this.privateVar2 = privateVar2;
        } else{
                System.out.println("min  than 0");
            }

    }

    public String getProtectedVar1() {
        return protectedVar1;
    }

    public void setProtectedVar1(String protectedVar1) {
        if (protectedVar1.length()>=5) {
            this.protectedVar1 = protectedVar1;
        }else{
            System.out.println("grater than 5 ");
            }
    }

    public int getProtectedVar2() {
        return protectedVar2;
    }

    public void setProtectedVar2(int protectedVar2) {
        this.protectedVar2 = protectedVar2;
    }
}
