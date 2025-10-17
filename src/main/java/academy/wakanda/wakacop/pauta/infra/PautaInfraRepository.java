package academy.wakanda.wakacop.pauta.infra;

import academy.wakanda.wakacop.pauta.application.service.PautaRepository;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta save(Pauta pauta) {
        log.info("[start] PautaInfraRepository - save");
        pautaSpringDataJPARepository.save(pauta);
        log.info("[finish] PautaInfraRepository - save");
        return pauta;
    }

    @Override
    public Pauta buscaPautaPorid(UUID idPauta) {
        log.info("[start] PautaInfraRepository - buscaPautaPorid");
        Pauta pautaPorId = pautaSpringDataJPARepository.findById(idPauta)
                .orElseThrow(() -> new RuntimeException("Pauta não encontrada"));
        log.info("[finish] PautaInfraRepository - buscaPautaPorid");
        return pautaPorId;
    }
}
