package com.seunguk.todolist.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TodolistResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        TodolistResonseDto dto = new TodolistResonseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
