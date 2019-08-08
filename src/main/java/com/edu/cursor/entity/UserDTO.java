package com.edu.cursor.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private LocalDate lastLoginDate;
    private int accessId;
    private String email;
    private Map<String, Boolean> homeworkToIsDone;
}
