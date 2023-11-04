public class ThisKeyword {
    int id;
    String name;
    String lastname;

    public ThisKeyword(){

        System.out.println("First consructor");
    }
    public ThisKeyword( int a){
     this();
        System.out.println("Second consructor");
    }
    public ThisKeyword( int id, String name, String lastname){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public void CallMethod(ThisKeyword thisKeyword){
        System.out.println("Argument the lesson");
    }

    public void CallMethod2(){
        CallMethod(this);
    }

    ThisKeyword getThisKeyword(){
        return this;
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.CallMethod2();
        thisKeyword.getThisKeyword();
    }
}
