package com.leticia.HelpDesk.repositories;

import com.leticia.HelpDesk.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
