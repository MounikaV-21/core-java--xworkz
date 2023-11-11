package com.xworkz.usermanagementapp.service.impl;

import com.xworkz.usermanagementapp.dto.CartItemDto;
import com.xworkz.usermanagementapp.repository.UserCartRepository;
import com.xworkz.usermanagementapp.repository.impl.UserCartRepositoryImpl;
import com.xworkz.usermanagementapp.service.UserCartService;

public class UserCartServiceImpl implements UserCartService {
UserCartRepository userCartRepository;

public UserCartServiceImpl() {

    userCartRepository = new UserCartRepositoryImpl();
}


    @Override
    public void validateAndSave(CartItemDto dto) {
        System.out.println("_____validation_____");
        boolean isQuantityValidated = false;
        boolean isCreatedAtValidated = false;
        boolean isModifiedAtValidated = false;
       boolean isUserDtoValidated = false;
        //boolean isProductIdValidated = false;
         if(dto!=null){
             if(dto.getQuantity()>0){
                 isQuantityValidated = true;
             }
             if(dto.getCreatedAt()!=null){
                 isCreatedAtValidated = true;
             }
             if(dto.getModifiedAt()!=null){
                 isModifiedAtValidated=true;
             }
             if(dto.getUserDto()!=null){
                 isUserDtoValidated=true;
             }
//             if(dto.getProductId()>0){
//                 isProductIdValidated = true;
//             }
             if((isQuantityValidated == true && isCreatedAtValidated == true && isModifiedAtValidated == true)){
                 userCartRepository.save(dto);
                 System.out.println("Method is validated");
             }
         }



    }
}
