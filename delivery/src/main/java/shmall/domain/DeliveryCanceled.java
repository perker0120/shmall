package shmall.domain;

import java.util.*;
import lombok.*;
import shmall.domain.*;
import shmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long deliveryId;
    private Long orderId;
    private Long productId;
    private String productName;
    private Integer amount;
    private String status;

    public DeliveryCanceled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
}
