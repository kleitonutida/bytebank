package br.com.alura.bytebank.exception

class FalhaAutenticacaoException(
        mensage: String = "Falha na autenticação"
) : Exception(mensage)