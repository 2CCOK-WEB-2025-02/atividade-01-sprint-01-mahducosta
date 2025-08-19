package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {

        ExercicioDificilResponse exercicioDificilResponse = new ExercicioDificilResponse();
        if (n <= 0){
            return exercicioDificilResponse;
        }

        int antpenu = 1;
        int penu = 0;
        int resultado = 0;
        int soma = 0;
        for (int i = 1; i <= n ; i++) {
            resultado = antpenu + penu;
            antpenu = penu;
            penu = resultado;
            soma += resultado;
            exercicioDificilResponse.setEnesimoTermo(resultado);
            exercicioDificilResponse.setSoma(soma);

        }
        return exercicioDificilResponse;

    }
}
