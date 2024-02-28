package com.reevo.exam.dto;

import com.reevo.exam.enums.InventoryStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class InventoryResponseDTO {
    private UUID orderId;
    private Integer userId;
    private Integer productId;
    private InventoryStatus status;
}
