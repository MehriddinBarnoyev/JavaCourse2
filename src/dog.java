public class dog extends Animal {
    public void security(){
        System.out.println("Security");
    }

    public static void main(String[] args) {
     dog dog = new dog();
     dog.eat();
     dog.security();
    }

}
