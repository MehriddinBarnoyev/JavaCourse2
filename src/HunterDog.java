public class HunterDog extends dog {
    public void hunter(){
        System.out.println("hunter");
    }

    public static void main(String[] args) {
        HunterDog dog = new HunterDog();
        dog.eat();
        dog.security();
        dog.hunter();
    }
}
