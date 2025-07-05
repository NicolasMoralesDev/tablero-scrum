package com.nicolasmorales.exception;

import lombok.Data;

@Data
public class BussinesException extends Exception {

    public BussinesException(String message) { super(message); }
}
