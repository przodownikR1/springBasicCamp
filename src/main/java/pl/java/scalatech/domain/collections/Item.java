package pl.java.scalatech.domain.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import pl.java.scalatech.domain.Owner;
@Data
public class Item {

     private String name;
     private List<String> shortcuts;
     private Map<String,Integer> goods;
     private boolean flag;
     private Properties props;
     private Set<String> locations;
     private Owner owner;
     private int quantity;

}
