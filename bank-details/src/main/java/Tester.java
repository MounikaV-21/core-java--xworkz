import com.xworkz.bankapp.dto.AtmCardDto;
import com.xworkz.bankapp.dto.BankAccountDto;
import com.xworkz.bankapp.service.BankAccountService;
import com.xworkz.bankapp.service.impl.BankAccountServiceImpl;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        BankAccountService bankAccountService = new BankAccountServiceImpl();

        BankAccountDto bankAccountDto = new BankAccountDto();
        System.out.println("Enter Bank Account No int");
        bankAccountDto.setAccountNo(sc.nextInt());
        System.out.println("Enter account holder name");
        bankAccountDto.setAccountHolderName(sc.next());
        System.out.println("Enter bank account type");
        bankAccountDto.setAccountType(sc.next());
        System.out.println("Enter bank branch name");
        bankAccountDto.setBranchName(sc.next());

        AtmCardDto atmCardDto = new AtmCardDto();
        System.out.println("Enter card num string");
        atmCardDto.setCardNo(sc.next());
        System.out.println("Enter cvv num int");
        atmCardDto.setCvv(sc.nextInt());
        System.out.println("Enter card holder name");
        atmCardDto.setCardHolderName(sc.next());
        atmCardDto.setBankAccountDto(bankAccountDto);

        bankAccountService.saveAndValidate(atmCardDto);
    }
}
