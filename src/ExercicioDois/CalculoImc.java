package ExercicioDois;

public class CalculoImc {
    public static void main(String[] args) {
        double peso = 67.500, altura = 1.59, imc;

        imc = peso / (altura*altura);

        if(imc<18.5){
            System.out.print("Magreza");

        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("Normal");

        }else if (imc >= 25 && imc <= 29.9){
            System.out.print("Sobrepeso I");

        }else if (imc >= 30 && imc<= 39.9) {
            System.out.print("Obesidade II");

        } else if (imc > 40) {
            System.out.print("Obesidade Grave III");

        }else {
            System.out.println("Não identificadp");
        }


    }
}
