package io.github.hugodesb.requests;

import org.apache.hc.core5.http.NameValuePair;

import java.io.Serializable;
import java.util.Objects;

/**
 * Name value pair that uses only the name when compared
 */
public class MyNameValuePair implements NameValuePair, Serializable {

    private final String name;
    private final String value;

    public MyNameValuePair(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNameValuePair that = (MyNameValuePair) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
