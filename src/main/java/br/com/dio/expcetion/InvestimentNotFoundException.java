package br.com.dio.expcetion;

public class InvestimentNotFoundException extends RuntimeException{

    public InvestimentNotFoundException(String message) {

        super(message);
    }
}
