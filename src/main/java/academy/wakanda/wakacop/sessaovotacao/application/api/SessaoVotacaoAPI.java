package academy.wakanda.wakacop.sessaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao")
public interface SessaoVotacaoAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/abertura")
    SessaoAberturaResponse abreSessao(@RequestBody SessaoAberturaRequest novaSessaoVotacao);
}
