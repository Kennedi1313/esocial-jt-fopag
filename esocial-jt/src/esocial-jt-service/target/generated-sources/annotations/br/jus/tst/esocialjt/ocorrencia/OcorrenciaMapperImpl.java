package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class OcorrenciaMapperImpl extends OcorrenciaMapper {

    @Override
    public Ocorrencia comoOcorrencia(OcorrenciaDTO ocorrenciaDTO) {
        if ( ocorrenciaDTO == null ) {
            return null;
        }

        Ocorrencia ocorrencia = new Ocorrencia();

        ocorrencia.setTipoOcorrencia( ocorrenciaDTO.getTipoOcorrencia() );
        ocorrencia.setReferencia( ocorrenciaDTO.getReferencia() );
        ocorrencia.setOperacao( ocorrenciaDTO.getOperacao() );
        ocorrencia.setRetificarRecibo( ocorrenciaDTO.getRetificarRecibo() );
        ocorrencia.setDataOcorrencia( ocorrenciaDTO.getDataOcorrencia() );
        ocorrencia.setDadosOcorrencia( ocorrenciaDTO.getDadosOcorrencia() );

        return ocorrencia;
    }
}
