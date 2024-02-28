package com.reevo.exam.dto;

import com.reevo.exam.enums.OrderStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class OrchestratorResponseDTO
{
    private Integer userId;
    private Integer productId;
    private UUID orderId;
    private Double amount;
    private OrderStatus status;
}
