package pl.java.scalatech.editors;


import java.beans.PropertyEditor;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Maps;

@Configuration
public class EditorConfig {
@Bean
public CustomDateEditor editor() {
    CustomDateEditor cde = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
    return cde;
}

@Bean
public CustomEditorConfigurer cec(CustomDateEditor cde) {
    CustomEditorConfigurer cec = new CustomEditorConfigurer();
    Map<Class<?>,Class<? extends PropertyEditor>> maps =Maps.newHashMap();
    maps.put(Date.class, cde.getClass());
    cec.setCustomEditors(maps);
    return cec;
}


}
