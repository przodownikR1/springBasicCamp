package pl.java.scalatech.editors;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PcEditorBean {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${birthDate}")
    private Date birthName;


}
