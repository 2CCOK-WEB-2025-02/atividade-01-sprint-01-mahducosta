package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        List<String> caracteres = new ArrayList<>(Arrays.asList(palavra.split("")));
        List<String> palavraAvesso = new ArrayList<>();
        for (int i = caracteres.size() - 1; i >= 0; i--) {
            palavraAvesso.add(caracteres.get(i));
        }

        if (String.join("", palavraAvesso).equalsIgnoreCase(palavra)){
            return true;
        }
        return false;



    }
}
