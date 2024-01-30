package com.bedu.example1.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Task {
    private Long id;
    private String title;
    private boolean completed;
}
