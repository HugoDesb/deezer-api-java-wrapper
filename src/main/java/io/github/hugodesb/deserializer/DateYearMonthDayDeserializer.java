package io.github.hugodesb.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateYearMonthDayDeserializer implements JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String date = jsonElement.getAsJsonPrimitive().getAsString();
        String pattern = "yyyy-MM-dd";
        try {
            return (new SimpleDateFormat("yyyy-MM-dd")).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Date.from(Instant.MIN);
    }
}
