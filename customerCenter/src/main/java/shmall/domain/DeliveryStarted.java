package shmall.domain;

import java.util.*;
import lombok.Data;
import shmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long deliveryId;
    private Long orderId;
    private Long productId;
    private String productName;
    private Integer amount;
    private String status;
}
