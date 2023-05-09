package shmall.domain;

import java.util.*;
import lombok.*;
import shmall.domain.*;
import shmall.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long stockId;
    private Integer amount;
    private String productName;
}
