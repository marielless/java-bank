package br.com.dio.model;

public record Investment(
        long id, // identificador
        long tax, // taxa
        long initialFunds)
{
    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", tax=" + tax + "%" +
                ", initialFunds=" + (initialFunds / 100) + "," + (initialFunds % 100) +
                '}';
    }
}
