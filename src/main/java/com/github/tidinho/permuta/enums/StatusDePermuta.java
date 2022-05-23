package com.github.tidinho.permuta.enums;

public enum StatusDePermuta {
    AGUARDANDO_APROVACAO_DO_SOLICITADO("Aguardando aprovação do solicitante"),
    AGUARDANDO_APROVACAO_DO_TENENTE("Aguardando aprovação do tenente"),
    APROVADO("Aprovado"),
    RECUSADO("Recusado");


    public String descricao;
    
    StatusDePermuta(String descricao) {
        this.descricao = descricao;
    }
}