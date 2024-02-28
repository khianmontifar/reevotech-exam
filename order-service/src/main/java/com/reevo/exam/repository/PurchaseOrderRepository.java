package com.reevo.exam.repository;

import com.reevo.exam.entity.PurchaseOrder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PurchaseOrderRepository  extends ReactiveCrudRepository<PurchaseOrder, UUID> {
}
