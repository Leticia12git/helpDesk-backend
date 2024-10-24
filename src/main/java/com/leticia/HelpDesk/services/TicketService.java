package com.leticia.HelpDesk.services;

import com.leticia.HelpDesk.entity.Ticket;
import com.leticia.HelpDesk.enums.TicketStatus;
import com.leticia.HelpDesk.excecoes.ResourceNotFoundException;
import com.leticia.HelpDesk.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        ticket.setStatus(TicketStatus.OPEN);
        ticket.setCreatedAt(LocalDateTime.now());
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ticket not found"));
    }

    public Ticket updateTicket(Long id, Ticket ticketDetails) {
        Ticket ticket = getTicketById(id);
        ticket.setStatus(ticketDetails.getStatus());
        ticket.setDescription(ticketDetails.getDescription());
        ticket.setUpdatedAt(LocalDateTime.now());
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
