package REV_28_08;
class Circulo {
    private double raio;
    private String cor;
  
    public Circulo() {
      raio = 1.0;
      cor = "red";
    }
  
    public Circulo(double r) {
      raio = r;
      cor = "red";
    }
  
    public double getRaio() {
      return raio;
    }
  
    public double getArea() {
      return Math.PI * (raio * raio);
    }
  }
  
  public class Circle { //classe
    public static void main(String[] args) {
      Circulo circulo1 = new Circulo(); //objeto, sempre que ter new é o construtor da classe
      Circulo circulo2 = new Circulo(5.0);
  
      double area1 = circulo1.getArea();
      //Double area1 é Atributo
      double raio2 = circulo2.getRaio();
  
      System.out.println("Área do primeiro círculo: " + area1);
      System.out.println("Raio do segundo círculo: " + raio2);
    }
  }