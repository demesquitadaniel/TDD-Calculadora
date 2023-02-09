public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) throws Exception {
        if(num1 > 100 || num2 > 100) {
            throw new Exception("Os numeros devem ser menor que cem.");
        }

        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) throws Exception {
        if(num2 == 0) {
            throw new Exception("Não pode ser dividido por zero.");
        } else {

            return num1 / num2;
        }
    }
}
