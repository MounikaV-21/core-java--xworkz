import com.xworkz.usermanagementapp.dto.CartItemDto;
import com.xworkz.usermanagementapp.dto.UserDto;
import com.xworkz.usermanagementapp.service.UserCartService;
import com.xworkz.usermanagementapp.service.impl.UserCartServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        UserCartService userCartService=new UserCartServiceImpl();

        for(int i =0; i<=size; i++) {

            UserDto userDto = new UserDto();

            System.out.println("Enter the user name");
            userDto.setUserName(sc.next());
            System.out.println("Enter the first name");
            userDto.setFirstName(sc.next());
            System.out.println("Enter the last name");
            userDto.setLastName(sc.next());
            System.out.println("Enter the phone Number");
            userDto.setPhoneNo(sc.nextLong());
            System.out.println("Enter the password");
            userDto.setPassword(sc.next());
            System.out.println("Enter the created date");
            userDto.setCreatedAt(new Date());
            System.out.println("Enter the modified date");
            userDto.setModifiedAt(new Date());

            CartItemDto cartItemDto = new CartItemDto();
            System.out.println("Enter the product quantity");
            cartItemDto.setQuantity(sc.nextInt());
            System.out.println("Enter the product id");
            cartItemDto.setProductId(sc.nextInt());
            System.out.println("Enter the created date");
            cartItemDto.setCreatedAt(new Date());
            System.out.println("Enter the modified date");
            cartItemDto.setModifiedAt(new Date());
            cartItemDto.setUserDto(userDto);

            userCartService.validateAndSave(cartItemDto);
        }
    }
}
