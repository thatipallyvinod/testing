package com.NetBanking.FsF.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity

@NoArgsConstructor

@Data
@AllArgsConstructor
public class Account {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private Double balance;

    // Other fields as needed
    @ManyToOne
    private Applicant applicant; 
    
    @OneToMany(mappedBy = "senderAccount", cascade = CascadeType.ALL)
    private List<Transaction> sentTransactions;

    @OneToMany(mappedBy = "recipientAccount", cascade = CascadeType.ALL)
    private List<Transaction> receivedTransactions;

    // Getters and setters
}
