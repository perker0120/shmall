package shmall.domain;

import java.util.*;
import lombok.*;
import shmall.domain.*;
import shmall.infra.AbstractEvent;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long stockId;
    private Integer amount;
    private String productName;

    public StockDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
