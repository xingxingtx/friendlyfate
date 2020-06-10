package com.wei;

import io.swagger.models.auth.In;

/**
 *@describe  BitOperationTest
 *@author  wei.peng
 *@date  2020 05/24
 */
public class BitOperationTest {

    public static void main(String[] args) {
        UserDTO dto = new UserDTO();
        dto.setName("nihao");
        dto.setAddress("shanghai");
        setUser(dto);
        System.out.println(dto.toString());
    }

    private static void setUser(UserDTO dto){
        UserDTO dto1 = new UserDTO();
        dto.setLogin("denglu");
        dto1.setActiveKey("121424");
        dto1.setAge(12);
        dto = dto1;



    }

}
