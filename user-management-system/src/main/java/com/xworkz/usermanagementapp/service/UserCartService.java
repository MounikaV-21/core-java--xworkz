package com.xworkz.usermanagementapp.service;

import com.xworkz.usermanagementapp.dto.CartItemDto;

public interface UserCartService {
public void validateAndSave(CartItemDto dto);
}
