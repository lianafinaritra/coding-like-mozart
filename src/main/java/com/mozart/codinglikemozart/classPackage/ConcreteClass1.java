package com.mozart.codinglikemozart.classPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class ConcreteClass1 {
    private AbstractClass1 abstractClass1;
}
