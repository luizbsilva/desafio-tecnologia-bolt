package br.com.desafio.tecnologiabolt.regras;

import org.springframework.stereotype.Service;

@Service
public class RegrasSequenciaEstavel {

    public Long operacoesNecessarias(String input) {
        String clean = removerEstavel(input);
        if (clean.length() == 0){
            return Long.valueOf(0);
        }
        if (clean.charAt(0)== '{') {
            return Long.valueOf(clean.length() / 2);
        } else {
            return Long.valueOf((clean.length() / 2 ) + 1);
        }
    }
    private String removerEstavel(String input) {
        String[] stringArray = input.split("\\{\\}");
        if (stringArray.length > 1){
            return removerEstavel(join(stringArray));

        } else {
            return join(stringArray);
        }

    }

    private String join(String[] stringArray) {
        return String.join("", stringArray);
    }
}
