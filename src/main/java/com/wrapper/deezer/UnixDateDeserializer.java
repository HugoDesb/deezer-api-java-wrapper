package com.wrapper.deezer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.Date;

public class UnixDateDeserializer extends JsonDeserializer<Date> {
    //Logger logger = LoggerFactory.getLogger(UnixDateDeserializer.class);

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String timestamp = jp.getText().trim();

        try {
            return new Date(Long.parseLong(timestamp + "000"));
        } catch (NumberFormatException e) {
            //logger.warn("Unable to deserialize timestamp: " + timestamp, e);
            return null;
        }
    }
}
