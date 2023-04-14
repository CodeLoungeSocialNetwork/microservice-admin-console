package ru.skillbox.diplom.group35.microservice.admin_console.impl.repository;

import org.springframework.stereotype.Repository;
import ru.skillbox.diplom.group35.library.core.repository.BaseRepository;
import ru.skillbox.diplom.group35.microservice.admin_console.domain.model.EventLog;

@Repository
public interface EventLogRepository extends BaseRepository<EventLog> {
}
