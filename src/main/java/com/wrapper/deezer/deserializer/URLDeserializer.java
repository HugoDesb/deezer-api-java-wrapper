package com.wrapper.deezer.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDeserializer implements JsonDeserializer<URL> {
    @Override
    public URL deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            return new URL(jsonElement.getAsString());
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
