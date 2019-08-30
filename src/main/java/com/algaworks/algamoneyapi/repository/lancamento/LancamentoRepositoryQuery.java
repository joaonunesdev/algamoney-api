package com.algaworks.algamoneyapi.repository.lancamento;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
