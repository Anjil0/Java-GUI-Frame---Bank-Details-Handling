
// importing required packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI {
    // Creating arraylist to store object
    private ArrayList<BankCard> bankArrayList = new ArrayList<BankCard>();
    // creating universal variable with value -1
    private final static int incorrect = -1;
    // creating instance of all swing componenets which is Required to make GUI
    private JFrame frameBank, frameDebit, frameCredit;
    private JPanel panelBankTitle, panelDebitTitle, panelDebitNav, panelAddDebit, panelWithdrawDebit,
            panelCreditTitle,
            panelCreditNav, panelAddCredit,
            panelSetCredit, panelCancelCredit;
    private JLabel titleBankLabel, titleDebitLabel, titleCreditLabel, cardId, clientName, issuerBank, bankAccount,
            balanceAmount, pinNumber, cardIdDebit, cvcNumber,
            creditLimit,
            interestRate, gracePeriod, withdrawalAmount, withdrawalDate, cardIdSetCredit, cardIdCancelCredit,
            expirationDate;
    private JTextField withdrawalAmountField, cardIdField, clientNameField, issuerBankField, bankAccountField,
            balanceAmountField, addPinNumberField, pinNumberField, cardIdDebitField, cvcNumberField, interestRateField,
            cardIdSetCreditField, creditLimitField, gracePeriodField, cardIdCancelCreditField;
    private JComboBox<String> withdrawalYearBox, withdrawalMonthBox, withdrawalDayBox, expirationYearBox,
            expirationMonthBox, expirationDayBox;
    private JButton bankDebitCardButton, bankCreditCardButton,
            clearBankButton, debitAddButton, addDebitCardButton, debitBackButton,
            creditAddButton,
            addCreditCardButton,
            withdrawButton, withdrawCashButton, setCLimitButton, setCreditLimitButton, cancelCreditButton,
            displayDebitButton,
            displayCreditButton,
            clearForAddDebitButton, clearForWithdrawButton, clearForAddCreditButton, clearForSetCreditButton,
            cancelCreditCardButton, creditBackButton, clearForCancelCredit;
    // creating arrays for Year, Month and Day for JCombo box
    private String[] year = { "Year", "2023", "2022", "2021", "2019", "2018", "2017", "2016" };
    private String[] month = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };
    private String[] day = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };

    // Creating Constructor of BankGUI Class
    public BankGUI() {
        // Calling Methods in constructor
        forBank();
        forDebit();
        forCredit();
        forActionPerformed();
        frameBank.setVisible(true);
    }

    public void forBank() {
        // Making a BankCardFrame
        frameBank = new JFrame("Bank Card");
        frameBank.setSize(650, 400);
        frameBank.setLayout(null);
        frameBank.setLocationRelativeTo(null);
        frameBank.setResizable(false);
        frameBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating TITLE Panel
        panelBankTitle = new JPanel();
        panelBankTitle.setSize(650, 105);
        panelBankTitle.setBackground(Color.gray);
        panelBankTitle.setLayout(null);
        frameBank.add(panelBankTitle);

        // ADDING BIG TITLE AT BankCard
        titleBankLabel = new JLabel("Welcome To Bank");
        titleBankLabel.setFont(new Font("Serif", Font.BOLD, 50));
        titleBankLabel.setBounds(120, 25, 400, 50);
        panelBankTitle.add(titleBankLabel);

        // Adding CleintName and Its field in BankCard GUI
        clientName = new JLabel("Client Name:");
        clientName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        clientName.setBounds(25, 130, 130, 25);
        frameBank.add(clientName);
        clientNameField = new JTextField();
        clientNameField.setBounds(160, 130, 145, 25);
        clientNameField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        frameBank.add(clientNameField);

        // Adding cardID label and Textfield in BankCard GUI
        cardId = new JLabel("Card ID:");
        cardId.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardId.setBounds(340, 130, 80, 25);
        frameBank.add(cardId);
        cardIdField = new JTextField();
        cardIdField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        cardIdField.setBounds(450, 130, 145, 25);
        frameBank.add(cardIdField);

        // Adding IssuerBank Name and Its field in BankCard GUI
        bankAccount = new JLabel("Bank Account:");
        bankAccount.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bankAccount.setBounds(25, 200, 130, 25);
        frameBank.add(bankAccount);
        bankAccountField = new JTextField();
        bankAccountField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        bankAccountField.setBounds(160, 200, 145, 25);
        frameBank.add(bankAccountField);

        // Adding IssuerBank Name and Its field in BankCard GUI
        issuerBank = new JLabel("Issuer Bank:");
        issuerBank.setFont(new Font("Times New Roman", Font.BOLD, 20));
        issuerBank.setBounds(340, 200, 130, 25);
        frameBank.add(issuerBank);
        issuerBankField = new JTextField();
        issuerBankField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        issuerBankField.setBounds(450, 200, 145, 25);
        frameBank.add(issuerBankField);

        // Adding balanceAmount and Its field in BankCard GUI
        balanceAmount = new JLabel("Balance Amount:");
        balanceAmount.setFont(new Font("Times New Roman", Font.BOLD, 20));
        balanceAmount.setBounds(150, 260, 150, 25);
        frameBank.add(balanceAmount);
        balanceAmountField = new JTextField();
        balanceAmountField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        balanceAmountField.setBounds(310, 260, 150, 25);
        frameBank.add(balanceAmountField);

        // Adding DebitCard Button in BankCard GUI
        bankDebitCardButton = new JButton("DEBIT CARD");
        bankDebitCardButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        bankDebitCardButton.setBounds(40, 315, 170, 30);
        frameBank.add(bankDebitCardButton);

        // adding Clear Button on Bank
        clearBankButton = new JButton("CLEAR");
        clearBankButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        clearBankButton.setBounds(255, 315, 120, 30);
        frameBank.add(clearBankButton);

        // Adding CreditCard Button in BankCard GUI
        bankCreditCardButton = new JButton("CREDIT CARD");
        bankCreditCardButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        bankCreditCardButton.setBounds(420, 315, 180, 30);
        frameBank.add(bankCreditCardButton);
    }

    public void forDebit() {
        // For DebitCard Frame
        frameDebit = new JFrame("Debit Card");
        frameDebit.setSize(750, 500);
        frameDebit.setLayout(null);
        frameDebit.setLocationRelativeTo(null);
        frameDebit.setResizable(false);
        frameDebit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding panel for Title In DebitCardFrame
        panelDebitTitle = new JPanel();
        panelDebitTitle.setSize(750, 95);
        panelDebitTitle.setBackground(Color.gray);
        panelDebitTitle.setLayout(null);
        frameDebit.add(panelDebitTitle);

        // ADDING BIG TITLE AT DebitCard
        titleDebitLabel = new JLabel("DEBIT CARD");
        titleDebitLabel.setFont(new Font("Serif", Font.BOLD, 50));
        titleDebitLabel.setBounds(210, 20, 400, 50);
        panelDebitTitle.add(titleDebitLabel);

        // Creating BackButton For going to MainFrame
        debitBackButton = new JButton("Back");
        debitBackButton.setFont(new Font("Arial Black", Font.BOLD, 20));
        debitBackButton.setBounds(20, 410, 100, 40);
        frameDebit.add(debitBackButton);

        // Creating panel in DebitCard Frame For Navigation Buttons
        panelDebitNav = new JPanel();
        panelDebitNav.setBounds(30, 180, 120, 200);
        panelDebitNav.setLayout(new GridLayout(4, 1, 1, 20));
        frameDebit.add(panelDebitNav);

        // creating Buttons To Nav
        debitAddButton = new JButton("Add");
        debitAddButton.setFont(new Font("Arial", Font.BOLD, 19));
        debitAddButton.setBackground(Color.GRAY);
        debitAddButton.setForeground(Color.white);
        panelDebitNav.add(debitAddButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setFont(new Font("Arial", Font.BOLD, 19));
        panelDebitNav.add(withdrawButton);

        displayDebitButton = new JButton("Display");
        displayDebitButton.setFont(new Font("Arial", Font.BOLD, 19));
        panelDebitNav.add(displayDebitButton);

        // Creating Adding Button panel, label and fields
        panelAddDebit = new JPanel();
        panelAddDebit.setLayout(null);
        panelAddDebit.setBounds(245, 140, 400, 250);
        panelAddDebit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        frameDebit.add(panelAddDebit);

        // Adding Pin Number and Its Field in Addpanel
        pinNumber = new JLabel("Pin Number: ");
        pinNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pinNumber.setBounds(50, 60, 130, 25);
        panelAddDebit.add(pinNumber);
        addPinNumberField = new JTextField();
        addPinNumberField.setBounds(170, 60, 150, 25);
        addPinNumberField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        panelAddDebit.add(addPinNumberField);

        // Adding Debitcard Button
        addDebitCardButton = new JButton("Add Debit Card");
        addDebitCardButton.setBounds(100, 120, 180, 30);
        addDebitCardButton.setFont(new Font("Arial", Font.BOLD, 20));
        panelAddDebit.add(addDebitCardButton);

        // Adding Clearbutton
        clearForAddDebitButton = new JButton("Clear");
        clearForAddDebitButton.setBounds(145, 170, 90, 30);
        clearForAddDebitButton.setFont(new Font("Arial", Font.BOLD, 18));
        panelAddDebit.add(clearForAddDebitButton);

        // Creating Withdraw Button Functions
        panelWithdrawDebit = new JPanel();
        panelWithdrawDebit.setLayout(null);
        panelWithdrawDebit.setBounds(225, 140, 460, 260);
        panelWithdrawDebit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        frameDebit.add(panelWithdrawDebit);
        panelWithdrawDebit.setVisible(false);

        // Adding cardID label and Textfield in BankCard GUI
        cardIdDebit = new JLabel("Card ID:");
        cardIdDebit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardIdDebit.setBounds(20, 20, 100, 25);
        panelWithdrawDebit.add(cardIdDebit);
        cardIdDebitField = new JTextField();
        cardIdDebitField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        cardIdDebitField.setBounds(180, 20, 150, 25);
        panelWithdrawDebit.add(cardIdDebitField);

        // Adding Pin Number and Its Field in withdrawpanel
        pinNumber = new JLabel("Pin Number: ");
        pinNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pinNumber.setBounds(20, 60, 130, 25);
        panelWithdrawDebit.add(pinNumber);
        pinNumberField = new JTextField();
        pinNumberField.setBounds(180, 60, 150, 25);
        pinNumberField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        panelWithdrawDebit.add(pinNumberField);

        // Adding withdrawalAmount and its field to in withdrapanel
        withdrawalAmount = new JLabel("Withdrawal Amount:");
        withdrawalAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
        withdrawalAmount.setBounds(20, 100, 180, 25);
        panelWithdrawDebit.add(withdrawalAmount);
        withdrawalAmountField = new JTextField();
        withdrawalAmountField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        withdrawalAmountField.setBounds(190, 100, 140, 25);
        panelWithdrawDebit.add(withdrawalAmountField);

        // Adding Withdrawn Date and its field to Debit Frame
        withdrawalDate = new JLabel("Withdrawal Date:");
        withdrawalDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
        withdrawalDate.setBounds(20, 140, 160, 25);
        panelWithdrawDebit.add(withdrawalDate);

        withdrawalYearBox = new JComboBox<String>(year);
        withdrawalYearBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
        withdrawalYearBox.setBounds(180, 140, 80, 25);
        panelWithdrawDebit.add(withdrawalYearBox);

        withdrawalMonthBox = new JComboBox<String>(month);
        withdrawalMonthBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
        withdrawalMonthBox.setBounds(270, 140, 100, 25);
        panelWithdrawDebit.add(withdrawalMonthBox);

        withdrawalDayBox = new JComboBox<String>(day);
        withdrawalDayBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
        withdrawalDayBox.setBounds(380, 140, 70, 25);
        panelWithdrawDebit.add(withdrawalDayBox);
        // creating withdraw button for withdrawing money
        withdrawCashButton = new JButton("Withdraw");
        withdrawCashButton.setFont(new Font("Arial Black", Font.BOLD, 20));
        withdrawCashButton.setBounds(140, 180, 150, 30);
        panelWithdrawDebit.add(withdrawCashButton);
        // creating clear button for clearing fields of withdraw panel
        clearForWithdrawButton = new JButton("Clear");
        clearForWithdrawButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        clearForWithdrawButton.setBounds(170, 220, 90, 25);
        panelWithdrawDebit.add(clearForWithdrawButton);
    }

    public void forCredit() {
        // Creating creditCard Frame
        frameCredit = new JFrame("CreditCard");
        frameCredit.setSize(750, 500);
        frameCredit.setLayout(null);
        frameCredit.setResizable(false);
        frameCredit.setLocationRelativeTo(null);
        frameCredit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding panel for Title In CreditCardFrame
        panelCreditTitle = new JPanel();
        panelCreditTitle.setSize(750, 95);
        panelCreditTitle.setBackground(Color.gray);
        panelCreditTitle.setLayout(null);
        frameCredit.add(panelCreditTitle);

        // ADDING BIG TITLE AT CreditCard
        titleCreditLabel = new JLabel("CREDIT CARD");
        titleCreditLabel.setFont(new Font("Serif", Font.BOLD, 50));
        titleCreditLabel.setBounds(200, 20, 400, 50);
        panelCreditTitle.add(titleCreditLabel);

        // Creating BackButton For going to MainFrame
        creditBackButton = new JButton("Back");
        creditBackButton.setFont(new Font("Arial Black", Font.BOLD, 20));
        creditBackButton.setBounds(20, 410, 100, 40);
        frameCredit.add(creditBackButton);

        // Creating panel in CreditCard Frame For Navigation Buttons
        panelCreditNav = new JPanel();
        panelCreditNav.setBounds(20, 180, 170, 200);
        panelCreditNav.setLayout(new GridLayout(4, 1, 1, 20));
        frameCredit.add(panelCreditNav);

        // creating Buttons To Nav in CreditCard
        // Add navigation Button
        creditAddButton = new JButton("Add");
        creditAddButton.setFont(new Font("Arial", Font.BOLD, 19));
        creditAddButton.setBackground(Color.GRAY);
        creditAddButton.setForeground(Color.white);
        panelCreditNav.add(creditAddButton);

        // Set Navigation Button
        setCLimitButton = new JButton("Set Limit");
        setCLimitButton.setFont(new Font("Arial", Font.BOLD, 19));
        panelCreditNav.add(setCLimitButton);

        // Cancel Navigation Button
        cancelCreditButton = new JButton("Cancel Credit");
        cancelCreditButton.setFont(new Font("Arial", Font.BOLD, 19));
        panelCreditNav.add(cancelCreditButton);

        // Display Navigation Button
        displayCreditButton = new JButton("Display");
        displayCreditButton.setFont(new Font("Arial", Font.BOLD, 19));
        panelCreditNav.add(displayCreditButton);

        // Creating AddingPanel for add Nav Bar
        panelAddCredit = new JPanel();
        panelAddCredit.setLayout(null);
        panelAddCredit.setBounds(245, 140, 450, 260);
        panelAddCredit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        frameCredit.add(panelAddCredit);

        // Adding CVCNumber and its field in add Panel
        cvcNumber = new JLabel("CVC Number:");
        cvcNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cvcNumber.setBounds(20, 20, 190, 25);
        panelAddCredit.add(cvcNumber);
        cvcNumberField = new JTextField();
        cvcNumberField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        cvcNumberField.setBounds(170, 20, 130, 25);
        panelAddCredit.add(cvcNumberField);

        // Adding InterestRate and its field in add panel
        interestRate = new JLabel("Interest Rate:");
        interestRate.setFont(new Font("Times New Roman", Font.BOLD, 20));
        interestRate.setBounds(20, 60, 190, 25);
        panelAddCredit.add(interestRate);
        interestRateField = new JTextField();
        interestRateField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        interestRateField.setBounds(170, 60, 130, 25);
        panelAddCredit.add(interestRateField);

        // Adding Expiration Date and its field to Add Panel
        expirationDate = new JLabel("Expiration Date:");
        expirationDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
        expirationDate.setBounds(20, 100, 150, 25);
        panelAddCredit.add(expirationDate);
        expirationYearBox = new JComboBox<String>(year);
        expirationYearBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
        expirationYearBox.setBounds(170, 100, 70, 25);
        panelAddCredit.add(expirationYearBox);
        expirationMonthBox = new JComboBox<String>(month);
        expirationMonthBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
        expirationMonthBox.setBounds(255, 100, 100, 25);
        panelAddCredit.add(expirationMonthBox);
        expirationDayBox = new JComboBox<String>(day);
        expirationDayBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
        expirationDayBox.setBounds(370, 100, 60, 25);
        panelAddCredit.add(expirationDayBox);

        // Adding addCreditCard Button
        addCreditCardButton = new JButton("Add Credit Card");
        addCreditCardButton.setBounds(120, 150, 190, 30);
        addCreditCardButton.setFont(new Font("Arial", Font.BOLD, 20));
        panelAddCredit.add(addCreditCardButton);

        // Adding Clearbutton
        clearForAddCreditButton = new JButton("Clear");
        clearForAddCreditButton.setBounds(170, 190, 90, 30);
        clearForAddCreditButton.setFont(new Font("Arial", Font.BOLD, 18));
        panelAddCredit.add(clearForAddCreditButton);

        // Creating setcreditpanel With its Function in creditFrame
        panelSetCredit = new JPanel();
        panelSetCredit.setBounds(245, 140, 450, 260);
        panelSetCredit.setLayout(null);
        panelSetCredit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        frameCredit.add(panelSetCredit);
        panelSetCredit.setVisible(false);

        // Adding cardID label and Textfield in SetCredit panel
        cardIdSetCredit = new JLabel("Card ID:");
        cardIdSetCredit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardIdSetCredit.setBounds(60, 30, 120, 25);
        panelSetCredit.add(cardIdSetCredit);
        cardIdSetCreditField = new JTextField();
        cardIdSetCreditField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        cardIdSetCreditField.setBounds(190, 30, 150, 25);
        panelSetCredit.add(cardIdSetCreditField);

        // Adding Credit Limit and its field to SetCredit panel
        creditLimit = new JLabel("Credit Limit:");
        creditLimit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        creditLimit.setBounds(60, 70, 120, 25);
        panelSetCredit.add(creditLimit);
        creditLimitField = new JTextField();
        creditLimitField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        creditLimitField.setBounds(190, 70, 150, 25);
        panelSetCredit.add(creditLimitField);

        // Adding GracePeriod and its field to SetCredit Panel
        gracePeriod = new JLabel("Grace Period:");
        gracePeriod.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gracePeriod.setBounds(60, 110, 120, 25);
        panelSetCredit.add(gracePeriod);
        gracePeriodField = new JTextField();
        gracePeriodField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        gracePeriodField.setBounds(190, 110, 150, 25);
        panelSetCredit.add(gracePeriodField);

        // Button for Setting Credit limit
        setCreditLimitButton = new JButton("Set Credit Limit");
        setCreditLimitButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        setCreditLimitButton.setBounds(130, 160, 200, 30);
        panelSetCredit.add(setCreditLimitButton);

        // Adding Clearbutton
        clearForSetCreditButton = new JButton("Clear");
        clearForSetCreditButton.setBounds(180, 200, 90, 30);
        clearForSetCreditButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        panelSetCredit.add(clearForSetCreditButton);

        // Creating cancelCreditPanel With its Function in creditFrame
        panelCancelCredit = new JPanel();
        panelCancelCredit.setBounds(245, 140, 450, 260);
        panelCancelCredit.setLayout(null);
        panelCancelCredit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        frameCredit.add(panelCancelCredit);
        panelCancelCredit.setVisible(false);

        // Adding cardID label and Textfield in CancelCredit Panel
        cardIdCancelCredit = new JLabel("Card ID:");
        cardIdCancelCredit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardIdCancelCredit.setBounds(80, 80, 80, 25);
        panelCancelCredit.add(cardIdCancelCredit);
        cardIdCancelCreditField = new JTextField();
        cardIdCancelCreditField.setFont(new Font("Century Gothic", Font.BOLD, 15));
        cardIdCancelCreditField.setBounds(170, 80, 170, 25);
        panelCancelCredit.add(cardIdCancelCreditField);

        // Adding cancelling Button
        cancelCreditCardButton = new JButton("Cancel Credit Card");
        cancelCreditCardButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        cancelCreditCardButton.setBounds(95, 130, 240, 30);
        panelCancelCredit.add(cancelCreditCardButton);

        // Adding Clearbutton
        clearForCancelCredit = new JButton("Clear");
        clearForCancelCredit.setBounds(170, 175, 90, 30);
        clearForCancelCredit.setFont(new Font("Arial Black", Font.BOLD, 18));
        panelCancelCredit.add(clearForCancelCredit);
    }

    // Method for performing UserActions
    public void forActionPerformed() {
        // Actions for BankFrame
        bankDebitCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                // Open DebitCard Frame and Close bank Frame
                if (bankValidityCheck() == 1) {
                    frameBank.setVisible(false);
                    frameDebit.setVisible(true);
                }
            }
        });

        clearBankButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearForBank();
            }
        });

        bankCreditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                // Open CreditCard Frame and Close bank Frame
                if (bankValidityCheck() == 1) {
                    frameBank.setVisible(false);
                    frameCredit.setVisible(true);
                }
            }
        });

        // Actions for DebitFrame
        debitBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                frameDebit.setVisible(false);
                frameBank.setVisible(true);
            }
        });

        debitAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                debitAddButton.setBackground(Color.GRAY);
                debitAddButton.setForeground(Color.white);
                withdrawButton.setBackground(null);
                withdrawButton.setForeground(null);
                displayDebitButton.setBackground(null);
                displayDebitButton.setForeground(null);
                panelAddDebit.setVisible(true);
                panelWithdrawDebit.setVisible(false);
            }
        });
        // Chaning nav Bar Color
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                withdrawButton.setBackground(Color.GRAY);
                withdrawButton.setForeground(Color.white);
                debitAddButton.setBackground(null);
                debitAddButton.setForeground(null);
                displayDebitButton.setBackground(null);
                displayDebitButton.setForeground(null);
                panelAddDebit.setVisible(false);
                panelWithdrawDebit.setVisible(true);
            }
        });

        displayDebitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                displayDebitButton.setBackground(Color.GRAY);
                displayDebitButton.setForeground(Color.white);
                debitAddButton.setBackground(null);
                debitAddButton.setForeground(null);
                withdrawButton.setBackground(null);
                withdrawButton.setForeground(null);
                displayDebit();
            }
        });

        addDebitCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                forAddInDebitCheck();
            }
        });

        clearForAddDebitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                clearForAddDebit();
            }
        });

        withdrawCashButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                forWithdrawInDebit();
            }
        });

        clearForWithdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                clearForWithdrawDebit();
            }
        });

        // Action for CreditCard Frame
        creditBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                frameCredit.setVisible(false);
                frameBank.setVisible(true);
            }
        });

        creditAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                creditAddButton.setBackground(Color.GRAY);
                creditAddButton.setForeground(Color.white);
                setCLimitButton.setBackground(null);
                setCLimitButton.setForeground(null);
                cancelCreditButton.setBackground(null);
                cancelCreditButton.setForeground(null);
                displayCreditButton.setBackground(null);
                displayCreditButton.setForeground(null);
                panelAddCredit.setVisible(true);
                panelSetCredit.setVisible(false);
                panelCancelCredit.setVisible(false);
            }
        });

        setCLimitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                setCLimitButton.setBackground(Color.GRAY);
                setCLimitButton.setForeground(Color.white);
                creditAddButton.setBackground(null);
                creditAddButton.setForeground(null);
                cancelCreditButton.setBackground(null);
                cancelCreditButton.setForeground(null);
                displayCreditButton.setBackground(null);
                displayCreditButton.setForeground(null);
                panelAddCredit.setVisible(false);
                panelSetCredit.setVisible(true);
                panelCancelCredit.setVisible(false);
            }
        });

        cancelCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                cancelCreditButton.setBackground(Color.GRAY);
                cancelCreditButton.setForeground(Color.white);
                creditAddButton.setBackground(null);
                creditAddButton.setForeground(null);
                setCLimitButton.setBackground(null);
                setCLimitButton.setForeground(null);
                displayCreditButton.setBackground(null);
                displayCreditButton.setForeground(null);
                panelAddCredit.setVisible(false);
                panelSetCredit.setVisible(false);
                panelCancelCredit.setVisible(true);
            }
        });

        displayCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                displayCreditButton.setBackground(Color.GRAY);
                displayCreditButton.setForeground(Color.white);
                creditAddButton.setBackground(null);
                creditAddButton.setForeground(null);
                setCLimitButton.setBackground(null);
                setCLimitButton.setForeground(null);
                cancelCreditButton.setBackground(null);
                cancelCreditButton.setForeground(null);
                displayCredit();
            }
        });

        addCreditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                forAddInCredit();
            }
        });

        clearForAddCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                clearForAddCredit();
            }
        });

        setCreditLimitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                forSetCreditLimit();
            }
        });

        clearForSetCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                clearForSetCredit();
            }
        });

        cancelCreditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                forCancelCredit();
            }
        });

        clearForCancelCredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                clearForCancelCredit();
            }
        });

    }

    // All frame Clearbutton methods
    public void clearForBank() {
        clientNameField.setText("");
        cardIdField.setText("");
        bankAccountField.setText("");
        issuerBankField.setText("");
        balanceAmountField.setText("");
    }

    public void clearForAddDebit() {
        addPinNumberField.setText("");
    }

    public void clearForWithdrawDebit() {
        cardIdDebitField.setText("");
        pinNumberField.setText("");
        withdrawalAmountField.setText("");
        withdrawalYearBox.setSelectedIndex(0);
        withdrawalMonthBox.setSelectedIndex(0);
        withdrawalDayBox.setSelectedIndex(0);
    }

    public void clearForAddCredit() {
        cvcNumberField.setText("");
        interestRateField.setText("");
        expirationYearBox.setSelectedIndex(0);
        expirationMonthBox.setSelectedIndex(0);
        expirationDayBox.setSelectedIndex(0);
    }

    public void clearForSetCredit() {
        cardIdSetCreditField.setText("");
        creditLimitField.setText("");
        gracePeriodField.setText("");
    }

    public void clearForCancelCredit() {
        cardIdCancelCreditField.setText("");
    }

    // Bank validity checking method
    public int bankValidityCheck() {
        String clientName = getClientName();
        String bankAccount = getBankAccount();
        String issuerBank = getIssuerBank();
        int cardId = getBCardId();
        int balanceAmount = getBalanceAmount();

        if (clientName.isEmpty() || bankAccount.isEmpty() || issuerBank.isEmpty()) {
            JOptionPane.showMessageDialog(frameBank, "Please, Fill all the Fields", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        } else if (cardId == incorrect) {
            JOptionPane.showMessageDialog(frameBank, "Please, Enter Positive Value in Card ID", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        } else if (balanceAmount == incorrect) {
            JOptionPane.showMessageDialog(frameBank, "Please, Enter Balance Amount Greater Zero",
                    "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        }
        return 1;
    }

    // Methods for adding object in arralist of DebitCard
    public void forAddInDebitCheck() {
        int pinNumber = getDebitAddPinNumber();
        String clientName = getClientName();
        String bankAccount = getBankAccount();
        String issuerBank = getIssuerBank();
        int cardId = getBCardId();
        int balanceAmount = getBalanceAmount();

        if (pinNumber == incorrect) {
            JOptionPane.showMessageDialog(frameDebit, "Please, Enter Pin Number greater than 0", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (checkDebitCardIdUnique(cardId)) {
                bankArrayList.add(new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber));
                JOptionPane.showMessageDialog(frameDebit,
                        "Debit Card Added Succesfully\n Client Name: " + clientName + "\n Card Id: "
                                + cardId
                                + "\n Bank Account: " + bankAccount + "\n Issuer Bank: " + issuerBank
                                + "\n Balance Amount:" + balanceAmount + "\n Pin Number: "
                                + pinNumber,
                        "Added Message", JOptionPane.INFORMATION_MESSAGE);
                clearForAddDebit();
            } else {
                JOptionPane.showMessageDialog(frameDebit, "!! CardId Should be Unique !!",
                        "Added Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // method for withdrawing money
    public void forWithdrawInDebit() {
        int cardID = getWithrawCardId();
        int pinNumber = getWithrawPinNumber();
        int withdrawalAmount = getWithrawAmount();
        if (cardID == incorrect) {
            JOptionPane.showMessageDialog(frameDebit, "Please, Enter Positive Value in Card ID", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (pinNumber == incorrect) {
            JOptionPane.showMessageDialog(frameDebit, "Please, Enter Pin Number greater than 0", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (withdrawalAmount == incorrect) {
            JOptionPane.showMessageDialog(frameDebit, "Please, Enter Balance Amount Greater or Equal To Zero",
                    "Withdraw Amount Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            String year = getWithdrawYear();
            String month = getWithdrawMonth();
            String day = getWithdrawDay();
            boolean isFound = false;
            if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
                JOptionPane.showMessageDialog(frameDebit, "Please, Select all Fields of Date",
                        "Error Box",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                String date = year + "-" + month + "-" + day;
                for (BankCard obj : bankArrayList) {
                    if (obj instanceof DebitCard) {
                        DebitCard debitobj = (DebitCard) obj;
                        if (debitobj.getCardId() == cardID) {
                            debitobj.withdraw(withdrawalAmount, date, pinNumber);
                            clearForWithdrawDebit();
                            isFound = true;
                            break;
                        }
                    }
                }
            }
            if (isFound == true) {
                JOptionPane.showMessageDialog(frameDebit, "!! Look Terminal For Result !!",
                        "Message Box",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(frameDebit, "!! CardId Not Found !!",
                        "Error Box",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    // method for displaying objects stored in arraylist
    public void displayDebit() {
        boolean isObj = false;
        for (BankCard obj : bankArrayList) {
            if (obj instanceof DebitCard) {
                DebitCard debitObj = (DebitCard) obj;
                debitObj.display();
                System.out.println("\n");
                isObj = true;
            }
        }
        if (isObj == true) {
            JOptionPane.showMessageDialog(frameDebit, "DebitCard Data has Been Displayed In the Terminal",
                    "Display Message",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(frameDebit, "!! No DebitCard Object to Display!!",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // method for checking debitcard cardid is same or not
    public boolean checkDebitCardIdUnique(int cardId) {
        boolean isRepeat = true;
        for (BankCard obj : bankArrayList) {
            if (obj instanceof DebitCard) {
                DebitCard debitObj = (DebitCard) obj;
                if (debitObj.getCardId() == cardId) {
                    isRepeat = false;
                }
            }
        }
        return isRepeat;
    }

    // method for checking CreditCard cardid is same or not
    public boolean checkCreditCardIdUnique(int cardId) {
        boolean isRepeat = true;
        for (BankCard obj : bankArrayList) {
            if (obj instanceof CreditCard) {
                CreditCard creditObj = (CreditCard) obj;
                if (creditObj.getCardId() == cardId) {
                    isRepeat = false;
                }
            }
        }
        return isRepeat;
    }

    // Methods for Ading CreditCard Object in arraylist
    public void forAddInCredit() {
        String clientName = getClientName();
        String bankAccount = getBankAccount();
        String issuerBank = getIssuerBank();
        int cardId = getBCardId();
        int balanceAmount = getBalanceAmount();
        int cvcNumber = getCvcNumber();
        double interestRate = getInterestRate();
        String year = getExpirationYear();
        String month = getExpirationMonth();
        String day = getExpirationDay();

        if (cvcNumber == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "Please, Enter CVC Number greater than 0", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (interestRate == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "Please, Enter Interest greater or equals to 0", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            JOptionPane.showMessageDialog(frameBank, "Please, Select all Fields of Date",
                    "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (checkCreditCardIdUnique(cardId)) {
                String date = year + "-" + month + "-" + day;
                bankArrayList.add(new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber,
                        interestRate, date));
                JOptionPane.showMessageDialog(frameDebit,
                        "Credit Card Added Succesfully\n Client Name: " + clientName + "\n Card Id: "
                                + cardId
                                + "\n Bank Account: " + bankAccount + "\n Issuer Bank: " + issuerBank
                                + "\n Balance Amount: " + balanceAmount + "\n CVC Number: "
                                + cvcNumber + "\n Interest Rate: " + interestRate + "\n Date: "
                                + date,
                        "Added Message", JOptionPane.INFORMATION_MESSAGE);
                clearForAddCredit();
            } else {
                JOptionPane.showMessageDialog(frameDebit, "!! CardID should be Unique !!", "Add Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Methods for setting credit limit CreditCard
    public void forSetCreditLimit() {
        int cardID = getSetCreditCardId();
        double creditLimit = getCreditLimit();
        int gracePeriod = getGracePeriod();
        if (cardID == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "!! Please, Enter Positive Value greater than 0 in Card ID !!",
                    "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (creditLimit == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "!! Please, Enter Valid Credit Limit !!", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (gracePeriod == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "!! Please, Enter Grace Period Greater or Equal To Zero !!",
                    "Grace Period Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            boolean isFound = false;
            for (BankCard obj : bankArrayList) {
                if (obj instanceof CreditCard) {
                    CreditCard creditObj = (CreditCard) obj;
                    if (creditObj.getCardId() == cardID) {
                        creditObj.setCreditLimit(creditLimit, gracePeriod);
                        isFound = true;
                        clearForSetCredit();
                        break;
                    }
                }
            }
            if (isFound == true) {
                JOptionPane.showMessageDialog(frameCredit, "!! Look Terminal For Result !!",
                        "Result Box",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(frameCredit, "!! Card ID Not Found !!",
                        "No Account Error Box",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }
  // Methods for cancelling credit CreditCard
    public void forCancelCredit() {
        int cardID = getCancelCreditCardId();
        if (cardID == incorrect) {
            JOptionPane.showMessageDialog(frameCredit, "!!  Please, Enter Positive Value in Card ID  !!", "Error Box",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            boolean isFound = false;
            for (BankCard obj : bankArrayList) {
                if (obj instanceof CreditCard) {
                    CreditCard creditObj = (CreditCard) obj;
                    if (creditObj.getCardId() == cardID) {
                        creditObj.cancelCreditCard();
                        isFound = true;
                        clearForCancelCredit();
                        break;
                    }
                }
            }
            if (isFound == true) {
                JOptionPane.showMessageDialog(frameCredit, "Succesfully Cancelled CreditCard",
                        "Result Box",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(frameCredit, "!! CardID Not Found !!",
                        "No Account Error Box",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }
  // Methods for Displaying creditCard object
    public void displayCredit() {
        boolean isObj = false;
        for (BankCard obj : bankArrayList) {
            if (obj instanceof CreditCard) {
                CreditCard creditobj = (CreditCard) obj;
                creditobj.display();
                System.out.println("\n");
                isObj = true;
            }
        }
        if (isObj == true) {
            JOptionPane.showMessageDialog(frameDebit, "CreditCard Data has Been Displayed In the Terminal",
                    "Display Message",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(frameDebit, "!!!No Credit Card Object to display !!!",
                    "Display Error Message",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // All getter Method for private fields
    public int getBCardId() {
        int cardId = incorrect;
        try {
            cardId = Integer.parseInt(cardIdField.getText().trim());
            if (cardId <= 0) {
                cardId = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return cardId;
    }

    public String getClientName() {
        String clientName = clientNameField.getText().trim();
        return clientName;
    }

    public String getBankAccount() {
        String bankAccount = bankAccountField.getText().trim();
        return bankAccount;
    }

    public String getIssuerBank() {
        String issuerBank = issuerBankField.getText().trim();
        return issuerBank;
    }

    public int getBalanceAmount() {
        int balanceAmount = incorrect;
        try {
            balanceAmount = Integer.parseInt(balanceAmountField.getText().trim());
            if (balanceAmount <= 0) {
                balanceAmount = incorrect;
            }
        } catch (Exception f) {
            //// DialogBox in if loop when method gets called
        }
        return balanceAmount;
    }

    // getter methods for add in debit add panel
    public int getDebitAddPinNumber() {
        int pinNumber = incorrect;
        try {
            pinNumber = Integer.parseInt(addPinNumberField.getText().trim());
            if (pinNumber <= 0) {
                pinNumber = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return pinNumber;
    }

    // getter methods for withdraw in debit withdraw panel
    public int getWithrawCardId() {
        int withdrawCardId = incorrect;
        try {
            withdrawCardId = Integer.parseInt(cardIdDebitField.getText().trim());
            if (withdrawCardId <= 0) {
                withdrawCardId = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return withdrawCardId;
    }

    public int getWithrawPinNumber() {
        int withdrawPinNumber = incorrect;
        try {
            withdrawPinNumber = Integer.parseInt(pinNumberField.getText().trim());
            if (withdrawPinNumber <= 0) {
                withdrawPinNumber = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return withdrawPinNumber;
    }

    public int getWithrawAmount() {
        int withdrawAmount = incorrect;
        try {
            withdrawAmount = Integer.parseInt(withdrawalAmountField.getText().trim());
            if (withdrawAmount < 0) {
                withdrawAmount = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return withdrawAmount;
    }
    // getting comboboxes data from withdraw panel

    public String getWithdrawYear() {
        String year = (String) withdrawalYearBox.getSelectedItem();
        return year;
    }

    public String getWithdrawMonth() {
        String month = (String) withdrawalMonthBox.getSelectedItem();
        return month;
    }

    public String getWithdrawDay() {
        String day = (String) withdrawalDayBox.getSelectedItem();
        return day;
    }

    public int getCvcNumber() {
        int cvcNumber = incorrect;
        try {
            cvcNumber = Integer.parseInt(cvcNumberField.getText().trim());
            if (cvcNumber <= 0) {
                cvcNumber = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return cvcNumber;
    }

    public double getInterestRate() {
        double interestRate = incorrect;
        try {
            interestRate = Double.parseDouble(interestRateField.getText().trim());
            if (interestRate < 0) {
                interestRate = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return interestRate;
    }

    public String getExpirationYear() {
        String year = (String) expirationYearBox.getSelectedItem();
        return year;
    }

    public String getExpirationMonth() {
        String month = (String) expirationMonthBox.getSelectedItem();
        return month;
    }

    public String getExpirationDay() {
        String day = (String) expirationDayBox.getSelectedItem();
        return day;
    }

    public int getSetCreditCardId() {
        int setCreditCardId = incorrect;
        try {
            setCreditCardId = Integer.parseInt(cardIdSetCreditField.getText().trim());
            if (setCreditCardId <= 0) {
                setCreditCardId = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return setCreditCardId;
    }

    public double getCreditLimit() {
        double creditLimit = incorrect;
        try {
            creditLimit = Double.parseDouble(creditLimitField.getText().trim());
            if (creditLimit < 0) {
                creditLimit = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return creditLimit;
    }

    public int getGracePeriod() {
        int gracePeriod = incorrect;
        try {
            gracePeriod = Integer.parseInt(gracePeriodField.getText().trim());
            if (gracePeriod <= 0) {
                gracePeriod = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return gracePeriod;
    }

    public int getCancelCreditCardId() {
        int cancelCreditCardId = incorrect;
        try {
            cancelCreditCardId = Integer.parseInt(cardIdCancelCreditField.getText().trim());
            if (cancelCreditCardId <= 0) {
                cancelCreditCardId = incorrect;
            }
        } catch (Exception f) {
            // DialogBox in if loop when method gets called
        }
        return cancelCreditCardId;
    }

    public static void main(String[] args) {
        new BankGUI();
    }
}
