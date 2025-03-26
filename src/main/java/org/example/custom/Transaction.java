package org.example.custom;

import java.util.Collection;

public class Transaction {
 private  volatile static Transaction transaction;

  private Transaction(){

  }
  public synchronized Transaction getInstance() {

      if (transaction == null) {
          transaction = new Transaction();
      }

      return transaction;
  }
}
