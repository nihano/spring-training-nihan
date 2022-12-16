package com.cydeo;

import com.cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class QueryDemo implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final MovieRepository movieRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final TicketRepository ticketRepository;
    private final GenreRepository genreRepository;
    private final UserRepository userRepository;

    public QueryDemo(AccountRepository accountRepository, CinemaRepository cinemaRepository, MovieRepository movieRepository, MovieCinemaRepository movieCinemaRepository, TicketRepository ticketRepository, GenreRepository genreRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.movieRepository = movieRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.ticketRepository = ticketRepository;
        this.genreRepository = genreRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("cinemaRepository: " +cinemaRepository.findByName("Hall 1 - EMPIRE"));
        System.out.println("accountRepository: " +accountRepository.fetchAdminAccounts());
        System.out.println("cinemaRepository: " + cinemaRepository.distinctBySponsoredName());
        System.out.println("movieRepository: "+movieRepository.fetchAllMovieNames());
        System.out.println("movieCinemaRepository: " + movieCinemaRepository.countAllByCinemaId(4L));
        System.out.println("movieCinemaRepository: "+movieCinemaRepository.retrieveAllByLocationName("AMC Empire 25"));
        System.out.println("ticketRepository:" + ticketRepository.fetchAllTicketsByUserAccount(4L));
        System.out.println("ticketRepository: " + ticketRepository.fetchAllTicketsBetweenRangeOfDateTimes(LocalDateTime.now().minusDays(1000), LocalDateTime.now()));
        System.out.println("ticketRepository: " +ticketRepository.retrieveAllBySearchCriteria("it"));
        System.out.println("genreRepository: " + genreRepository.fetchAll());
//        System.out.println(userRepository.fetchAllUsers());

    }
}