package br.jus.tst.esocialjt.ocorrencia;

import static org.springframework.util.CollectionUtils.isEmpty;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;

@Component
public class OcorrenciaSpecs {
	
	public Specification<Ocorrencia> nosEstados(List<Estado> estados) {
		return (root, query, cb) -> isEmpty(estados) ? cb.and() : root.get("evento").get("estado").in(estados);
	}
	
	public Specification<Ocorrencia> comExpressao(String expressao) {
		return (root, query, cb) -> StringUtils.isBlank(expressao) ? cb.and() : cb.like(cb.lower(root.get("txtDadosOcorrencia")), "%"+expressao.toLowerCase()+"%");
	}
	
	public Specification<Ocorrencia> dosTipos(List<TipoEvento> tipos) {
		return (root, query, cb) -> isEmpty(tipos) ? cb.and() : root.get("evento").get("tipoEvento").in(tipos);
	}
	
	public Specification<Ocorrencia> incluirArquivados(boolean incluir) {
		return (root, query, cb) -> incluir ? cb.and() : root.get("arquivado").isNull();
	}
}
