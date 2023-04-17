package com.mozart.codinglikemozart.classPackage;

import com.mozart.codinglikemozart.dependance.ConcreteDependance1;
import com.mozart.codinglikemozart.dependance.ConcreteDependance2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;
}
