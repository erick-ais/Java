package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom Dia Mundo";

        s = s.replace("Mundo", "Planeta Terra");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String z = "Olá Nome"
                .replace("Nome", "Freya")
                .toUpperCase()
                .concat("!");
        System.out.println(z);
    }

}

    /*
        OBS.:
        replace(); Está substituindo o "Mundo" pelo "Planeta terra";
        toUpperCase(); Está transformando todas as letras em maiísculas;
        concat(); Está concatenando!
     */
