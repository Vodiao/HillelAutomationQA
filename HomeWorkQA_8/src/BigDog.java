public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    void greets (){
        System.out.println(" Woow ");
    }

    void greets(Dog dog){
        System.out.println( " Wooooooow ");
    }

    void greets(BigDog bigDog){
        System.out.println("Woooooooooooooow ");
    }
}
