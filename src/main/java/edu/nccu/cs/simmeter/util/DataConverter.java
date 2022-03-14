package edu.nccu.cs.simmeter.util;

import java.util.function.Consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

public class DataConverter<T> {

    private final T target;
    private final ObjectMapper mapper;
    private Exception ex;
    @Getter
    private String result;

    private DataConverter(T target) {
        this.target = target;
        this.mapper = new ObjectMapper();
    }

    public static synchronized <T> DataConverter from(T target) {
        return new DataConverter<>(target);
    }

    public DataConverter<T> init() {
        this.mapper.findAndRegisterModules();
        return this;
    }

    public DataConverter<T> toJson() {
        try {
            this.result = this.mapper.writeValueAsString(this.target);
        } catch (JsonProcessingException e) {
            this.ex = e;
        }

        return this;
    }

    public DataConverter<T> handleException(Consumer<Exception> handler) {
        handler.accept(this.ex);
        return this;
    }
}
