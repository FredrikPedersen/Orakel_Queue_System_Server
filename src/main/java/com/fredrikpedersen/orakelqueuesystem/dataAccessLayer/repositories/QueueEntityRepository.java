package com.fredrikpedersen.orakelqueuesystem.dataAccessLayer.repositories;

import com.fredrikpedersen.orakelqueuesystem.dataAccessLayer.models.queue.QueueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fredrik Pedersen
 * @since 20/09/2020 at 21:40
 */

public interface QueueEntityRepository extends JpaRepository<QueueEntity, Long> {
}
