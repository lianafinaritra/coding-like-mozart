package com.mozart.codinglikemozart.classPackage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class ConcreteClass2 {
    private AbstractClass1 abstractClass1;
}
