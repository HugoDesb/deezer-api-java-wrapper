package com.wrapper.deezer.requests;

import com.wrapper.deezer.exceptions.DeezerException;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.CompletableFuture;

public interface IRequest<T> {


    T execute() throws
            IOException,
            DeezerException,
            ParseException;

    interface Builder<T, BT extends Builder<T, ?>> {



        IRequest<T> build();
    }
}
