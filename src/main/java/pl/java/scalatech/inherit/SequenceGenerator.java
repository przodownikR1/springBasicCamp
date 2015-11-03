package pl.java.scalatech.inherit;

import java.util.List;

import org.assertj.core.util.Lists;

import lombok.Data;
@Data
public class SequenceGenerator {
	private String prefix;
	private List<String> suffixes = Lists.newArrayList();
	private int initial;
	private int counter;
}
