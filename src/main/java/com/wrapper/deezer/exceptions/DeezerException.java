package com.wrapper.deezer.exceptions;


import com.wrapper.deezer.DeezerApi;
import org.apache.hc.core5.http.HttpException;

public class DeezerException extends HttpException {

    public DeezerException(){
        super();
    }

    public DeezerException(String message){
        super(message);
    }

    public DeezerException(String message, Throwable cause){
        super(message, cause);
    }
}
