public class OM{
    public int num1;
    public int num2;
    public int num3;

    public double dec1;
    public double dec2;
    public int x;

    public double y;

    public OM(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        x = num1+num2;
    }
    public OM(int num1, int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        x = num1+num2+num3+5;
    }

    public OM(double dec1, double dec2){
        this.dec1=dec1;
        this.dec2=dec2;
        y = dec1 + dec2 + 2;
    }



    public void imprimir(){
        System.out.println("El 1° numero entero: " + num1 +". El 2° numero entero: "+ num2+ ". El 3° numero entero: "+ num3+ ". Su suma: "+ x);

    }
    public void imprimir1(){
        System.out.println("El 1° numero decimal: " + dec1 +". El 2° numero decimal: "+ dec2+ ". Su suma: "+ y);

    }

    public static void main(String[] args){
        OM objeto1=new OM(1, 1);
        objeto1.imprimir();

        OM objeto2=new OM(1, 1, 1);
        objeto2.imprimir();

        OM objeto3=new OM(1.5, 1.5);
        objeto3.imprimir1();


    }
}