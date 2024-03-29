package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficio.inicio.Beneficiario;
import br.jus.tst.esocial.dominio.beneficio.inicio.InfoBenInicio;

public class CdBenIn extends DadosOcorrencia {
	
	@Valid
	@NotNull
	private Beneficiario beneficiario;
	
	@Valid
	@NotNull
	private InfoBenInicio infoBenInicio;

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public InfoBenInicio getInfoBenInicio() {
		return infoBenInicio;
	}

	public void setInfoBenInicio(InfoBenInicio infoBenInicio) {
		this.infoBenInicio = infoBenInicio;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(beneficiario, infoBenInicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CdBenIn other = (CdBenIn) obj;
		return Objects.equals(beneficiario, other.beneficiario) && Objects.equals(infoBenInicio, other.infoBenInicio);
	}
}
