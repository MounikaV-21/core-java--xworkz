package com.xworkz.usermanagementapp.repository;


import com.xworkz.usermanagementapp.dto.CartItemDto;

public interface UserCartRepository {
  public void save(CartItemDto dto);
}
