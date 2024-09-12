package REV_11_09.Pessoa;

import REV_11_09.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Amanda", "amandafj.50@gmail.com");
        Fisica f = new Fisica("777777777", "Amanda", "amandafj.50@gmail.com");
        Pessoa p1 = new Fisica("77777777", "Amanda", "amandafj.50@gmail.com");

        if (p1 instanceof Fisica) {
            System.out.println("Fisica");
            
        }
    
    }
    
}
