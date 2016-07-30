package br.com.leonardoterrao.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {

    private Long id;

    private Long amount;

    private LocalDateTime date;

    private Customer customer;

    private Product product;

}
