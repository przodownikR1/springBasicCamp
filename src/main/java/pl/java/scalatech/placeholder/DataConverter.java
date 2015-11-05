package pl.java.scalatech.placeholder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import lombok.SneakyThrows;

public class DataConverter implements Converter<String,Date>{
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    @SneakyThrows
    public Date convert(String source) {
        return sdf.parse(source);
    }

}
