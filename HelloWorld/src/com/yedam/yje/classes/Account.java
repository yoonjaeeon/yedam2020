package com.yedam.yje.classes;

public class Account {
   private String ano;
   private String owner;
   private int balance;
   
   public Account(String ano, String owner, int balance) {
      super();
      this.ano = ano;
      this.owner = owner;
      this.balance = balance;
      
   }
   public String getAno() {
      return ano;
   }
   public String getOwner() {
      return owner;
   }
   public int getBalance() {
      return balance;
   }
   public void setBalance(int amount) {
      if(amount >= 10 && amount <= 100000) {
         balance = balance + amount;
      } else {
         balance = balance + 0;
      }
   }
   
   public void withdrawBalance(int amount) {
      if(amount >= 10 && amount <= 100000) {
         balance = balance - amount;
      } else {
         balance = balance - 0;
      }
   }
      
   @Override
   public String toString() {
      return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
   }
   
}