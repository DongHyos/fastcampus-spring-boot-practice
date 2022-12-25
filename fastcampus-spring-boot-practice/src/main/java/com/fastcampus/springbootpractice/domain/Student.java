package com.fastcampus.springbootpractice.domain;

import lombok.Value;

public record Student(
        String name,
        Integer age,
        Grade grade
) {
    private enum Grade {
        A, B, C, D, F
    }
}
