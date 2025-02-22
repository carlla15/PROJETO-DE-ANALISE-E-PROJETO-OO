package projeto_APOO_academia;

public class CPFValidator {

    public static boolean validarCPF(String cpf) {

        cpf = cpf.replaceAll("[^0-9]", "");
        
        if (cpf.length() != 11)
            return false;
//        
//        int soma = 0;
//        for (int i = 0; i < 9; i++) {
//            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
//        }
//        int primeiroDigito = 11 - (soma % 11);
//        if (primeiroDigito > 9)
//            primeiroDigito = 0;
//
//        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito)
//            return false;
//
//        soma = 0;
//        for (int i = 0; i < 10; i++) {
//            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
//        }
//        int segundoDigito = 11 - (soma % 11);
//        if (segundoDigito > 9)
//            segundoDigito = 0;
//
//        if (Character.getNumericValue(cpf.charAt(10)) != segundoDigito)
//            return false;
//
//        return true;
//    }
//}
