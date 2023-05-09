package java_start.part_001.lesson_007.bankSystem.service;

import java_start.part_001.lesson_007.bankSystem.entity.Account;
import java_start.part_001.lesson_007.bankSystem.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнения счета, текущее значение счета: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Операция пополнения счета прошла успешно, новое значение счета: " + bill.getAmount());
    }
}