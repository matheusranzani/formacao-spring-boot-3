package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosListagemConsulta(
        Long id,
        Long medico_id,
        Long paciente_id,
        LocalDateTime data,
        MotivoCancelamento motivo
) {
    public DadosListagemConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData(), consulta.getMotivoCancelamento());
    }
}
