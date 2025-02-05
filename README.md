📌 Descrição (Português)

Este projeto é um sistema de controle financeiro para motoristas de aplicativo, permitindo o registro de ganhos e despesas diárias. O sistema oferece funcionalidades para calcular o saldo diário, além de gerar relatórios financeiros semanais, mensais e anuais.

🛠️ Funcionalidades:

1- Cadastro de ganhos diários 

2- Registro de despesas

3- Cálculo automático do saldo

4- Relatórios financeiros por semana, mês e ano

5- Consulta de faturamento por período específico




📌 Description (English)

This project is a financial management system for ride-hailing drivers, allowing them to track daily earnings and expenses. The system provides functionalities to calculate the daily balance and generate financial reports on a weekly, monthly, and yearly basis.

🛠️ Features:

1- Daily earnings registration

2- Expense tracking

3- Automatic balance calculation

4- Financial reports by week, month, and year

5- Revenue queries for specific periods

## DIAGRAMA DE CLASSE ##
    
```mermaid

classDiagram
    class User {
        -Long id
        -String name
        -List<Earnings> earnings
        -List<Expenses> expenses
        +User(Long id, String name)
        +void addEarnings(Earnings earning)
        +void addExpenses(Expenses expense)
        +double calculateBalance(Date date)
    }
    
    class Earnings {
        -Long id
        -double amount
        -Date date
        +Earnings(Long id, double amount, Date date)
    }
    
    class Expenses {
        -Long id
        -double amount
        -Date date
        +Expenses(Long id, double amount, Date date)
    }
    
    class FinancialReport {
        -Long id
        -String period
        -double totalEarnings
        -double totalExpenses
        +FinancialReport(Long id, String period)
        +double calculateWeeklyEarnings()
        +double calculateMonthlyEarnings()
        +double calculateAnnualEarnings()
        +void generateReport(User user)
    }
    
    User "1" -- "*" Earnings : records
    User "1" -- "*" Expenses : records
    User "1" -- "*" FinancialReport : consults
