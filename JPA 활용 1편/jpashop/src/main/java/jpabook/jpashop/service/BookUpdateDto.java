package jpabook.jpashop.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class BookUpdateDto {

    private String name;
    private int price;
    private int stockQuantity;
}
