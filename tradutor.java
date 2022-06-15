import java.util.Locale;

public class tradutor {
    String[] morse = {".-", "-…","-.-.","-..",".","..-.","–.","….","..",".--","-.-",".-..","--","-.","--",".--.","--.-",".-.","…","–","..-","…-",".--","-..-","-.--","--.."};
    String[] palavras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public String traduzir(String data){
        String traducao = "";
        String maiuscula = "";
        String letra = "";

        maiuscula = data.toUpperCase();

        for(int i = 1; i <= data.length(); i++){
            letra = maiuscula.substring(i-1, i);
            for (int j = 0; j < palavras.length; j++){
                if(letra.equals(palavras[j])) {
                    traducao = traducao + morse[j] + " | ";
                }
            }
        }

                return traducao;
    }
}
