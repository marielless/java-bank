package br.com.dio.model;

public record Investiment(
        long id, // identificador
        long tax, // taxa
        long daysToRescue,
        long initialFunds) {
}
