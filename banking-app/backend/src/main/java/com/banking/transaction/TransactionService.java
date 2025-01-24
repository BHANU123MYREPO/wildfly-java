package com.banking.transaction;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/transactions")
public class TransactionService {

    @PersistenceContext(unitName = "bankingPU")
    private EntityManager entityManager;

    @GET
    @Path("/submit")
    public String submitTransaction(@QueryParam("transactionId") String transactionId) {
        // Save transaction to the database
        Transaction transaction = new Transaction();
        transaction.setTransactionId(transactionId);
        transaction.setStatus("Submitted");

        entityManager.persist(transaction);

        return "Transaction " + transactionId + " submitted successfully!";
    }
}
