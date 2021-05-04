package kr.ac.hansung.eecs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Product {
    private String name;
    private String price;
}
