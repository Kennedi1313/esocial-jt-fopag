package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T11:29:56-0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 11.0.11 (Oracle Corporation)"
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
