package hello.itemservice.domain.Item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data //Getter Setter RequiredArgsConstructor... 등 굉장히 위험하다.
@Getter @Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
    public Item() {
    }
    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
