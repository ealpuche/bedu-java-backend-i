package com.bedu.example1.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task implements Serializable {
    private Long id;
    private String name;
    private String description;
    private boolean completed;
    private String dueDate;
}
