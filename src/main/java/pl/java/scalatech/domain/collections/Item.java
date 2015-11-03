package pl.java.scalatech.domain.collections;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import pl.java.scalatech.domain.Owner;
@Data
public class Item {

     private String name;
     private String desc;
     private List<String> shortcuts;
     private Map<String,String> goods;
     private boolean flag;
     private Properties props;
     private Set<String> locations;
     private Owner owner;
     private int quantity;

     public Item() {

     }
     @ConstructorProperties(value= {"name","quantity"})
     public Item(String name, int quantity) {
         this.name = name;
         this.quantity = quantity;
     }
     @ConstructorProperties(value= {"name","desc"})
     public Item(String name , String desc) {
         this.desc = desc;
         this.name = name;
     }

}
