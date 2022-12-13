package hello.itemservice.domain.item;

import lombok.Data;

//@Data 얘는 위험 단순히 getter setter만 사용 권장 사용해야 한다면 그냥 필요한거 추가하는 식으로 dto 정도만?
//근데 이번꺼는 예제니 data 쓰자

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(){
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
