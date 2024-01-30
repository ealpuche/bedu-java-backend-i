package com.bedu.example0.model;


import lombok.*;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task implements Serializable {
    @NotNull
    private Long id;
    private String title;
    private boolean completed;
    private String category;
}
